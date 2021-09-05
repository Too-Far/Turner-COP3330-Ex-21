/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Turner
 */
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    public static void handleOutput(String month) {
        System.out.println("The name of the month is " + month);
    }

    public static void handleSwitch(int month) {

        switch (month) {
            case 1:
                handleOutput("January");
                break;
            case 2:
                handleOutput("February");
                break;
            case 3:
                handleOutput("March");
                break;
            case 4:
                handleOutput("April");
                break;
            case 5:
                handleOutput("May");
                break;
            case 6:
                handleOutput("June");
                break;
            case 7:
                handleOutput("July");
                break;
            case 8:
                handleOutput("August");
                break;
            case 9:
                handleOutput("September");
                break;
            case 10:
                handleOutput("October");
                break;
            case 11:
                handleOutput("November");
                break;
            case 12:
                handleOutput("December");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }

    public static void gatherInput() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int month;
       while (true) {
           try {
               System.out.println("Please enter the number of the month: ");
               month = Integer.parseInt(reader.readLine());
               if (month < 13 && month > 0) {
                   handleSwitch(month);
                   break;
               } else {
                   System.out.println("Please enter a valid number:");
               }
           } catch (NumberFormatException e ) {
               System.out.println("Please enter a number");
           }
       }
    }

    public static void main( String[] args ) throws IOException
    {
        gatherInput();
    }
}
