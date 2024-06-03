package org.example;
import java.util.*;



public class LeftSideRightAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height:");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for( int j  = 0 ; j < n-i+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
