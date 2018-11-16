package com.bud.test.tcp1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-11-05
 */
public class TestThread {

    public static void main(String[] args) {

        try {
//            InetAddress byName = InetAddress.getByName("centaline.com.cn");
//            System.out.println(byName);
//            System.out.println("--------------------");
//            InetAddress[] allByName = InetAddress.getAllByName("centaline.com.cn");
//            for(InetAddress byName1:allByName){
//                System.out.println(byName1);
//            }
            InetAddress loopbackAddress = InetAddress.getLoopbackAddress();
            InetAddress localHost = InetAddress.getLocalHost();

            System.out.println(loopbackAddress.getHostName());
            System.out.println(localHost.getHostName());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9999);
            serverSocket.accept();




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
