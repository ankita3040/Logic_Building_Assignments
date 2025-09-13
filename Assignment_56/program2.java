// Write a java program which accept string from user and print frequency of each word.  

/*
    Input : India  is Demo India Hello Demo
    Output : India 2
             is    1
             Demo  2
             Hello 1

 */


////////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.java
// Description :  accept string from user and print frequency of each word.    
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////

import java.util.HashMap;
import java.util.Scanner;

class MyArray
{
    public void FrequencyOfWord(String str)
    { 
        str = str.trim();
        String arr[] = str.split(" ");
        int Freq = 0;
        
        HashMap<String,Integer> hobj = new HashMap<String,Integer>();

        for(String s : arr)
        {
            if(hobj.containsKey(s))
            {
                Freq = (hobj.get(s) + 1);
                hobj.put(s,Freq);
                
            }
            else
            {
                hobj.put(s,Freq );
            }

           
        }

         for(String s : hobj.keySet())
            {
                System.out.println(s + "\t"+ (hobj.get(s) + 1));
            }

    }

}

class program2
{
    public static void main(String[] args) 
    {

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter  string ");
        String str= sobj.nextLine();

        
        MyArray mobj = new MyArray();
        mobj.FrequencyOfWord(str);


    }
}