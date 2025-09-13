// Write a java program which accept string from user and display such a 
// word which occurs maximum number of times. 

/*
    Input : India  is Demo India Hello Demo India
    Output : India 3
             
            
 */


////////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.java
// Description :  accept string from user and display such a 
//                word which occurs maximum number of times.
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.HashMap;
import java.util.Scanner;

class MyArray
{
    public void MaximumOccurance(String str)
    { 
        str = str.trim();
        String arr[] = str.split(" ");
        int i = 0, iMax = 0,iCount = 0;
 

        HashMap<String,Integer> hobj = new HashMap<String,Integer>();

        for(String s : arr)
        {
            if(hobj.containsKey(s))
            {
                iCount = (hobj.get(s) + 1);
                hobj.put(s,iCount);
            }
            else
            {
                hobj.put(s,iCount);
            }
        }
        String newstr = " ";
        iMax = 0;
        for(String s : hobj.keySet())
        {
            if(hobj.get(s) > iMax)
            {
                iMax = hobj.get(s);
                newstr = s;
              
            }
        }

        System.out.println("Maximum number of times occurs word is :"+newstr );
    }
}   

class program3
{
    public static void main(String[] args) 
    {

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter  string ");
        String str= sobj.nextLine();

        
        MyArray mobj = new MyArray();
        mobj.MaximumOccurance(str);


    }
}