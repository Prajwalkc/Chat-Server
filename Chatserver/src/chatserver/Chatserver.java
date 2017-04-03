/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

import chatserver.handler.ClientHandler;
import chatserver.handler.ClientListner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Prajwal
 */
public class Chatserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int port = 9000;
        try{
        ServerSocket server = new ServerSocket(port);
            System.out.println("Server is running at"+port);
            ClientHandler handler = new ClientHandler();
        handler.start();
            while(true){
     Socket client = server.accept();
            System.out.println("Got connection request from"+client.getInetAddress().getHostAddress());
            ClientListner listner = new ClientListner(client,handler);
            listner.start();
        }       
    }catch(IOException ioe){
            System.out.println(ioe.getMessage());
    }
    
}
}