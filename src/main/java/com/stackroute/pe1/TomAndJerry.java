package com.stackroute.pe1;

import java.util.Scanner;

public class TomAndJerry
{
    //public static void main(String[] args){
        //System.out.println("enter the number");
       // Scanner scn=new Scanner(System.in);

       // int x=scn.nextInt();
       public static String tomAndJerry(int x){
           if(x>20&&x<30){
            if(x%2==0){
                return "tom";
            }
            else{
                return "jerry";
            }
            }
        else{
            return "not in a range";
        }
    }
}

