package com.javaboot;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println( "What is your name?" );
        String name=sc.nextLine();
        System.out.println("Welcome "+name);
        sc.close();
    }
}
