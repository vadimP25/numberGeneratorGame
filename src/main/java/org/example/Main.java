package org.example;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("You need to find which number generate program  from 0 to 100");
        int answer = numberGenerator.generateNumber();
        boolean cycle = true;

        while (cycle){
            System.out.println("Your guess:");
            int number = scanner.nextInt();

            if (number > answer) {
                System.out.println("Your number is bigger than the answer.");
            } else if (number < answer) {
                System.out.println("Your number is smaller than the answer.");
            } else {
                System.out.println("You found the correct number! It’s " + answer + "! Congratulations!!!");
                cycle = false;
            }

        }
        scanner.close();
    }
}