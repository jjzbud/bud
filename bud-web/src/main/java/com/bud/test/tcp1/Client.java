package com.bud.test.tcp1;

import java.io.*;
import java.net.Socket;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-11-05
 */
public class Client {
    final static String ADDRESS = "127.0.0.1";
    final static int PORT = 8700;
    public static void main(String[] args) {
        //Socket socket = null;
        try {
            Socket socket = new Socket(ADDRESS, PORT);
            System.out.println("连接服务器--------");
            new Thread(()->{
                DataInputStream dataInputStream = null;
                try {
                    while (true) {
                        dataInputStream = new DataInputStream(socket.getInputStream());
                        System.out.println("接收服务端信息："+dataInputStream.readUTF());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {

                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            try {
//                System.out.println("服务器关闭--------");
//                socket.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }
}



