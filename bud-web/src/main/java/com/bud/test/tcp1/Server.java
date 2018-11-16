package com.bud.test.tcp1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-11-05
 */
public class Server {

    final static int PROT = 8700;

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            System.out.println(" server start .. ");
            serverSocket = new ServerSocket(PROT);
            socket = serverSocket.accept();
            System.out.println("新连接:" + socket.getInetAddress() + ":" + socket.getPort());
            int i=10;
            while (i>0) {
                i--;
                //new Thread(() -> {
                DataOutputStream dataOutputStream = null;
                try {
                    Thread.sleep(1000);
                    String randomStr = getRandomStr();
                    dataOutputStream = new DataOutputStream(socket.getOutputStream());
                    dataOutputStream.writeUTF(randomStr);
                    System.out.println("向客户端发消息：" + randomStr);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //}).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String getRandomStr() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = simpleDateFormat.format(date);
        return format;
    }
}