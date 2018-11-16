package com.bud.test.tcp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-11-05
 */
public class UDPServer {

    public static void main(String[] args) throws Exception {
        DatagramSocket ds = null;
        DatagramPacket dp = null;

        // 构建发送对象
        ds = new DatagramSocket();
        // 将数据打包-->打成数据报
        String info = "hello world!";

        dp = new DatagramPacket(info.getBytes(), info.length(), InetAddress.getByName("localhost"),3333);

        // 发出数据报
        ds.send(dp);

    }
}
