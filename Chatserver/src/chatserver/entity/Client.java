/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver.entity;

import java.net.Socket;

/**
 *
 * @author Prajwal
 */
public class Client {
    private Socket socket;
    private String username;

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Client(Socket socket, String username) {
        this.socket = socket;
        this.username = username;
    }

    public Client() {
    }

}
