package com.liumapp;

import org.apache.commons.cli.*;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        Options options = new Options();
        CommandLineParser commandLineParser = new PosixParser();
        try {
            CommandLine commandLine = commandLineParser.parse(options , args);
            List<String> list = commandLine.getArgList();
            
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
