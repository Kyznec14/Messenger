package com.kyznec14.messenger.Server;
import java.sql.*;


import java.net.ServerSocket;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Stock")

public class ServerDataBase {
    private ServerSocket server;
    Connection connection;

    ServerDataBase(){}
    public void openDB(String nameBD) throws Exception {
        try{
            Class.forName("org.sqlite.JDBC");
            connection=DriverManager.getConnection("jdbc:sqlite:items.sql");
            //connection=DriverManager.getConnection(nameBD);
            System.out.println("Connected");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            throw new Exception("connection failed");
        }
    }

public void openSocket(){

}

public void closeSocket(){}

public void closeBD(){
    try{
    connection.close();
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
@RequestMapping(value = "/get",method = RequestMethod.GET)
public Item getItem(int id)
{

    return null;
}
}

