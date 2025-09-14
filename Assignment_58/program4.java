// Java program to read and add two distances using class 

/*  In this java program, we will read two distances in feet and inches and 
    find their sum, here program is implementing using class and objects 
    concept.

    Given program is used to read two distances (in feet and inches) and 
    print their sum in feet and inches, note that if total inches are more than 
    12 then it would be consider as 1 feet. 

*/

/*
    Input: 
        Enter first distance: 
        Enter feet: 20 
        Enter inches: 10 
        Enter second distance: 
        Enter feet: 20 
        Enter inches: 10
    Output :  
        Total distance is: 
        Feet: 41    Inches: 8 
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.java
// Description :  read two distances (in feet and inches) and  print their sum in feet and inches 
// Autor       :  Ankita Anil Patil
// Date        :  14/09/2025
///////////////////////////////////////////////////////////////////////////////
// Java program to read and add two distances using class 

import java.util.*;

class MyClass 
{
    public void TwoDistance(int feet1, int inches1, int feet2, int inches2) 
    {
        int feetSum = feet1 + feet2;
        int inchesSum = inches1 + inches2;

        // convert inches into feet if >= 12
        feetSum += inchesSum / 12;
        inchesSum = inchesSum % 12;

        System.out.println("Total distance is :");
        System.out.println("Feet : " + feetSum + "\nInches : " + inchesSum);
    }
}

class program4 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first distance:");
        System.out.print("Enter feet : ");
        int feet1 = sobj.nextInt();

        System.out.print("Enter inches : ");
        int inches1 = sobj.nextInt();

        System.out.println("Enter second distance:");
        System.out.print("Enter feet : ");
        int feet2 = sobj.nextInt();

        System.out.print("Enter inches : ");
        int inches2 = sobj.nextInt();

        MyClass mobj = new MyClass();
        mobj.TwoDistance(feet1, inches1, feet2, inches2);
    }
}
