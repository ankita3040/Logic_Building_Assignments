// Java program to count the number of words, sentences, characters,
// paragraphs, and whitespaces in a file

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.java
// Description :  Count words, sentences, characters, paragraphs, whitespaces
// Author      :  Ankita Anil Patil
// Date        :  14/09/2025
////////////////////////////////////////////////////////////////////////////////

import java.io.*; 

public class program5 
{ 
    public static void main(String[] args) throws IOException 
    { 
        File file = new File("program5.java");   // Change file if needed

        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input);

        String line; 

        int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
        int paragraphCount = 1;    
        int whitespaceCount = 0; 

        while ((line = reader.readLine()) != null) 
        { 
            if (line.equals("")) 
            {   
                paragraphCount++; 
            } 
            else
            { 
                characterCount += line.length(); 

                
                String[] wordList = line.split("\\s+"); 
                countWord += wordList.length; 

                // Count sentences (ends with . ? or !)
                String[] sentenceList = line.split("[!?.:]+"); 
                sentenceCount += sentenceList.length; 

                // Count whitespaces (words - 1 in line)
                whitespaceCount += wordList.length - 1; 
            } 
        } 

        System.out.println("Total word count = " + countWord); 
        System.out.println("Total number of sentences = " + sentenceCount); 
        System.out.println("Total number of characters = " + characterCount); 
        System.out.println("Number of paragraphs = " + paragraphCount); 
        System.out.println("Total number of whitespaces = " + whitespaceCount); 
    } 
}
