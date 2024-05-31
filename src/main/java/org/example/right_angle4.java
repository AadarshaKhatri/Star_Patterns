package org.example;

public class right_angle4 {
    public static void main(String[] args) {
        for (int i = 5; i>0 ; i--){
            for(int j =1 ;j<5;j++ ){
                if(i< 6 - j ){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }
}