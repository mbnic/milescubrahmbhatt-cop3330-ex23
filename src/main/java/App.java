/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.startQuestions();
    }

    public void startQuestions() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter y or n");

        System.out.println("Is the car silent when you turn the key?");
        String ans = in.next();
        if (ans.equals("y")) {
            System.out.println("Are the battery terminals corroded?");
            ans = in.next();
            if (ans.equals("y"))
                System.out.println("Clean terminals and try starting again.");
            //n
            else
                System.out.println("Replace cables and try again.");
        }

        //n
        else {
            System.out.println("Does the car make a slicking noise?");
            ans = in.next();
            if (ans.equals("y"))
                System.out.println("Replace the battery.");

            //n
            else {
                System.out.println("Does the car crank up but fail to start?");
                ans = in.next();

                if (ans.equals("y"))
                    System.out.println("Check spark plug connections.");

                else {
                    System.out.println("Does the engine start and then die?");
                    ans = in.next();

                    if (ans.equals("y")) {
                        System.out.println("Does your car have fuel injection?");
                        ans = in.next();

                        if (ans.equals("y"))
                            System.out.println("Get it in for service.");

                        else
                            System.out.println("Check to ensure the choke is opening and closing");
                    }

                    else
                        System.out.println("This should not be possible.");
                }
            }
        }
    }
}
