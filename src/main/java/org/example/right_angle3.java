package org.example;

public class right_angle3 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (j < row - i) {
                    System.out.print(" ");
                } else {

                    System.out.print("*");
                }

            }
            System.out.println();

        }
    }
}
