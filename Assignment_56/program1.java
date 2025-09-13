// Write a java program which accept two strings from user and check 
// whether first string is the rotation of second string or not. 

/*
    Input : abcdefg  cdefgab
    Output : TRUE

 */


////////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.java
// Description :  accept two strings from user and check whether first string is
//                the rotation of second string or not.    
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class MyArray
{
    public boolean Checkrotation(String str1, String str2)
    { 
        if(str1.length() != str2.length())
        {
            return false;
        }
        char arr1[] = str1.toCharArray();
        char arr2[]= str2.toCharArray();
        int i = 0, j= 0;
        boolean bFlag = true;

        int count[] = new int[26];
       

        for(i = 0; i < arr1.length; i++)
        {
            if(arr1[i] >= 'a' && arr1[i] <= 'z')
            {
                count[arr1[i] - 'a']++;
            }
        }

         for(i = 0; i < arr2.length; i++)
        {
            if(arr2[i] >= 'a' && arr2[i] <= 'z')
            {
                count[arr2[i] - 'a']--;
            }
        }

        for(i = 0; i< 26; i++)
        {
            if(count[i] != 0)
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;

    }

}

class program1
{
    public static void main(String[] args) 
    {

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter first string ");
        String str1= sobj.nextLine();

        System.out.println("Enter second string ");
        String str2= sobj.nextLine();

        MyArray mobj = new MyArray();
        boolean bRet = mobj.Checkrotation(str1,str2);

        if(bRet)
        {
            System.out.println("First string is rotation of second string ");
        }
        else
        {
            System.out.println("First string is not rotation of second string ");
        }

    }
}