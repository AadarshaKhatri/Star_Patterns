package org.example;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height:");
        int n = sc.nextInt();
        for(int i =1 ; i<=n;i++){

            for(int s = 1 ; s < n-i+1;s++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
