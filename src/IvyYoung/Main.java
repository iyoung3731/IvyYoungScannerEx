package IvyYoung;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello "+ name + ", nice to meet you!");

        System.out.println("What is your age");
        int age = input.nextInt();
        System.out.println("You are "+ age + " years old.");
    }
}
