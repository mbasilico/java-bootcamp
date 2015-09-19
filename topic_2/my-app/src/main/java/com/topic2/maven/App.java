package com.topic2.maven;
import java.io.*;

public class App
{
    public static void main( String[] args )
    {
       
        Console console = System.console();
        String username = console.readLine("Please enter yout name : ");
        System.out.println("Greetings " + username);
    }
}
