package com.liumapp.tcpclient;

import java.io.*;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by liumapp on 9/6/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class Client {

    private String ip;

    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void connect() {

        try {

            /**
             *  创建客户端socket
             *  指定服务器地址和端口
             */
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(ip , port));

            /**
             * 获取输出流
             * 向服务器端发送输出信息
             */
            OutputStream os = socket.getOutputStream();//字节输出流
            PrintWriter pw = new PrintWriter(os);//将输出流包装为打印流
            pw.write("用户名：admin；密码：123456");
            pw.flush();
            socket.shutdownOutput(); //关闭输出流

            /**
             * 获取输入流
             * 读取server的响应
             */
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader bf = new BufferedReader(isr);
            String info = null;
            while((info = bf.readLine()) != null) {
                System.out.println("client get server's response: " + info);
            }

            /**
             * 关闭相关资源
             */
            bf.close();
            isr.close();
            is.close();
            pw.close();
            os.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
