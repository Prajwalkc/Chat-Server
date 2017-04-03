/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver.handler;

import chatserver.entity.Client;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Prajwal
 */
public class ClientHandler extends Thread {
 private final List<Client> clients = new ArrayList<>();
 public void addClient(Client client){
     clients.add(client);
 }
public Client getUserName(String username){
    for (Client c : clients){
        if(c.getUsername().equalsIgnoreCase(username)){
            return c;
            
        }
    }
return null;
}
public List<Client> getClient(){
    return clients; 
}
public Client getBySocket(Socket client){
    for(Client c :clients){
        if(c.getSocket().equals(client)){
            return c;
        }
    }
    return null;
}
public void broadcastMessage(Client client,String message)throws IOException{
    for (Client c : clients){
        
        if(!c.getUsername().equals(client)){
            PrintStream ps = new PrintStream(c.getSocket().getOutputStream());
            ps.println(message);
        }
    } 
}

}

