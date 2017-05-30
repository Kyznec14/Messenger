package com.kyznec14.messenger.Server;
import java.sql.*;


import java.net.ServerSocket;

public class Server {
    private ServerSocket server;
    public static  void main(String [] args){
        try{
            class.forName("org.sqlite.JDBC");
            Connection co=DriverManager.getConnection("jdbc:sqlite:items.sql");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

