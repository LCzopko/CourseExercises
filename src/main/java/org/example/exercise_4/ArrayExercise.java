package org.example.exercise_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayExercise {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String countryArr[] = {"China", "India", "USA", "France", "Germany"};
        System.out.println("Please enter the index of target country" +
                " \n 1.China \n 2.India \n 3.USA \n 4.France \n 5.Germany \n Select country index from 1 to " + countryArr.length + ":");
        try{
            String select = reader.readLine();
            int index = Integer.parseInt(select);
            System.out.println("You selected " + countryArr[index-1]);
        }catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
