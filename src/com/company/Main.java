package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int number,anotherNumber;
        Scanner keyboard= new Scanner (System.in);

        System.out.println("Enter the size of the  numbers:");
         number=keyboard.nextInt ();
         keyboard.nextLine ();

       /* System.out.println("Enter a number to compare:");
        anotherNumber=keyboard.nextInt ();
        keyboard.nextLine ();*/

        int[]  num= new int[number];
        num[0]=1;
        //num[1]=num[0]+1;
        for(int i=0;i<num.length-1;i++)
        {
            //System.out.println (i );


               num[i+1]=num[i]+1;

           // System.out.print (num[i]+" " );

            if(num[i]%3==0&&num[i]%5==0)
            {
                System.out.println ("Fizz Buzz" );
            }else if(num[i]%3==0)
               {
                   System.out.println ("Fizz" );

               }else if(num[i]%5==0)
               {
                   System.out.println ("Buzz" );
               } else

                System.out.println (num[i] );










        }
    }
}
