package com.liumapp;

import com.liumapp.tcp.TcpServer;
import com.liumapp.tcpclient.Client;
import com.liumapp.utils.SpringLocator;
import org.apache.commons.cli.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Hello world!
 *
 */
@Component
public class App
{
    private boolean isShutDown = false;

    public static String SERVER = "tcpServer";

    public static String CLIENT = "tcpClient";

    public static String QUEEN  = "useQueen";

    public static void main( String[] args )
    {

        Options options = new Options();
        CommandLineParser commandLineParser = new PosixParser();
        try {
            CommandLine commandLine = commandLineParser.parse(options , args);
            List<String> list = commandLine.getArgList();
            if (list.get(0).equals(App.SERVER)) {
                TcpServer tcpServer = new TcpServer();
                tcpServer.setPort(Integer.parseInt(list.get(1)));
                tcpServer.starServer();

            } else if(list.get(0).equals(App.CLIENT)) {
                Client client = new Client();
                client.setIp(list.get(1));
                client.setPort(Integer.parseInt(list.get(2)));
                client.connect();
            } else if(list.get(0).equals(App.QUEEN)) {
                SpringLocator.applicationContext = new ClassPathXmlApplicationContext("classpath*:/spring/applicationContext*.xml");
                App app = SpringLocator.getBean(App.class);
                while (!app.isShutDown) {
                    try {
                        Thread.sleep(10000000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
