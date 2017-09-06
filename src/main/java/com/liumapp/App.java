package com.liumapp;

import com.liumapp.tcp.TcpServer;
import org.apache.commons.cli.*;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static String SERVER= "server";

    public static String CLIENT= "tcpClient";

    public static void main( String[] args )
    {

        Options options = new Options();
        CommandLineParser commandLineParser = new PosixParser();
        try {
            CommandLine commandLine = commandLineParser.parse(options , args);
            List<String> list = commandLine.getArgList();
            if (list.get(0).equals(App.SERVER)) {
                TcpServer tcpServer = new TcpServer();
                tcpServer.starServer();
            } else if(list.get(0).equals(App.CLIENT)) {
                
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
