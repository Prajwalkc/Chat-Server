/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver.handler;

import chatserver.dao.UserDAO;
import chatserver.dao.impl.UserDaoImp;
import chatserver.entity.Client;
import chatserver.entity.User;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author Prajwal
 */
public class ClientListner extends Thread {
    private Socket client;
    private PrintStream printer;
    private BufferedReader reader;
    private  ClientHandler handler;
    public ClientListner(Socket client, ClientHandler handler ) throws IOException{
        this.client=client;
        this.handler=handler;
    printer = new PrintStream(client.getOutputStream());
    reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
      
    }

    @Override
    public void run() {
        try{
           printer.println("Welcome to the Server ");
        while(!doLogin()){
            doLogin();
        }
           doChat();
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        }
public boolean doLogin() throws IOException{
    UserDAO userDAO = new UserDaoImp();
    
            printer.println("Tapaiko shuba naam ? :)");
            String username = reader.readLine();
            printer.println("Tapaiko Password :)");
            String password = reader.readLine();
              
            User user = userDAO.login(username, password);
            if(user!=null)
            {
            printer.println("La Dhanyabaad  " +username );
                handler.addClient(new Client(client, username));
            return true;
            }
            printer.println("Inavalid login raja");
return false;
}
public void doChat() throws IOException{
    printer.println("******************************************");
 printer.println("Welcome to the Our Private Chat server kta ho!! ");
while(true){
    String line = reader.readLine();
    Client sender = handler.getBySocket(client);
handler.broadcastMessage(sender, sender.getUsername()+"says > "+line);
}
}
}
