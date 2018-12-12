package main;

import java.util.Scanner;

public class NegativeDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       int num;

       System.out.println("4");
        num = input.nextInt();

        if (num>0){
            System.out.println("positiv");

        }
        else  if (num<0){
            System.out.println("Nagative");


        }
        else {
            System.out.println("Equal to zero");
        }
    }
}

