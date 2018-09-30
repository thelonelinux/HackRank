package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


        System.out.println("##############################################");

        for(int i=5;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }


        System.out.println("##############################################");

        for(int i=0;i<5;i++){
            for(int j=0;j<5-1-i;j++){
                System.out.print(" ");
            }

            for(int k=5-1-i;k<5;k++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("##############################################");


    }
}
