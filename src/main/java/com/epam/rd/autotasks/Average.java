package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int n=0;
        int num;
        int avg=0;
        int round = 0;
        while(true){
            num=scanner.nextInt();
            n++;
            if(num==0) break;
            avg+=num;
            round= (int) Math.ceil(avg/n);
        }
        System.out.print(round);


    }

}