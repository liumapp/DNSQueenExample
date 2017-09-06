package com.liumapp;

import com.liumapp.tcp.TcpServer;
import com.liumapp.tcpclient.Client;
import org.apache.commons.cli.*;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static String SERVER= "tcpServer";

    public static String CLIENT= "tcpClient";

    public static void main( String[] args )
    {
        test();
//        Options options = new Options();
//        CommandLineParser commandLineParser = new PosixParser();
//        try {
//            CommandLine commandLine = commandLineParser.parse(options , args);
//            List<String> list = commandLine.getArgList();
//            if (list.get(0).equals(App.SERVER)) {
//                TcpServer tcpServer = new TcpServer();
//                tcpServer.setPort(Integer.parseInt(list.get(1)));
//                tcpServer.starServer();
//            } else if(list.get(0).equals(App.CLIENT)) {
//                Client client = new Client();
//                client.setIp(list.get(1));
//                client.setPort(Integer.parseInt(list.get(2)));
//                client.connect();
//            }
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

    }

    public static void test() {
        Client client = new Client();
        client.setIp("118.190.40.58");
        client.setPort(9999);
        client.connect();
    }
}
