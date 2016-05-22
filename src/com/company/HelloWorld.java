package com.company;

import java.io.IOException;
import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args) throws IOException {
        System.out.println("Enter Your fraze:");
        Scanner sFraze = new Scanner(System.in);
        String fraze = sFraze.nextLine();
        System.out.println("Enter Your name:");
        Scanner sName = new Scanner(System.in);
        String name = sName.nextLine();
        System.out.println(name+" says:\n\""+fraze+"\"");
    }
}
