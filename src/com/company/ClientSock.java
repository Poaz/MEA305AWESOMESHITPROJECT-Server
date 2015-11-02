package com.company;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.net.*;


public class ClientSock  extends KeyAdapter {

    int ID = 23;
    String nickName = "Andreas";
    ClientSock(){

    }

    public static void main(String[] args) throws Exception {


        // Client TCP
        ClientSock client = new ClientSock();
        client.run();


    }



    public void run()throws Exception {

        Socket sock = new Socket("192.168.0.103", 444);
        PrintStream PS = new PrintStream(sock.getOutputStream());
        PS.println(nickName);
       // PS.println(ID);

        //Testing things
        PS.println("card");


        InputStreamReader IR = new InputStreamReader(sock.getInputStream());
        BufferedReader BR = new BufferedReader(IR);

        while (true) {
            String message = BR.readLine();
            System.out.println(message);
        }
    }
}
