package org.example;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "What is your name? " );
        Scanner getname = new Scanner(System.in);
        String name = getname.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");

    }
}
