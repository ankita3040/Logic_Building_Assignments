//  Program to check given strings are Anagram or not 
// This java program will read two strings and check whether they 
// are anagram strings or not. 
/*
    Input : slient
    Output : listen 
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.java
// Description :  Accept two strings and check whether they are anagram strings or not.
// Autor       :  Ankita Anil Patil
// Date        :  14/09/2025
///////////////////////////////////////////////////////////////////////////////



import java.util.Scanner; 
class AnagramString  
{ 
    public static boolean isAnagrams(String str1,String str2) 
    {
        if(str1.length() != str2.length())
        {
            return false;
        }
        int i = 0;

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        
        int Count[] =new int[26];

        for(i = 0; i < arr1.length; i++)
        {
            if(arr1[i] >= 'a' && arr1[i] <= 'z')
            {
                Count['a' + i]++;
            }

            if(arr2[i] >= 'a' && arr2[i] <= 'z')
            {
                Count['a' + i]--;
            }
            
        }

        for(i = 0; i < 26; i++)
        {
            if(Count[i] != 0)
            {
                break;
                return false;
            }
        }

        
    }  
 } 

 class program2
 {
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1 : "); 
        String str1 = sc.next(); 

        System.out.println("Enter String 2 : "); 
        String str2 = sc.next(); 
    
        if(AnagramString.isAnagrams(str1,str2)) 
        { 
            System.out.println("Anagram Strings !!"); 
        } 
        else 
        { 
            System.out.println("Strings are not Anagram !!");
    
        }
    }   
}
