package org.example.exercise_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringFromConsole {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.println("Enter your name: ");
        String name = reader.readLine();
        System.out.println("Hello, your name is " + name);

        System.out.println("Enter city where you live: ");
        String city = reader.readLine();
        String message = name + " lives in " + city;
        System.out.println(message + " the message length is " + message.length());
    }
}
