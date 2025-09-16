// Java program to merge two files alternatively into third file

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.java
// Description :  Merge two files alternately line by line
// Author      :  Ankita Anil Patil
// Date        :  14/09/2025
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class program4 {
    public static void main(String[] args) {
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String mergefile = "mergefile.txt";

        try (
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(mergefile))
        ) {
            String line1 = reader1.readLine();
            String line2 = reader2.readLine();

            // Write alternately
            while (line1 != null || line2 != null) {
                if (line1 != null) {
                    writer.write(line1);
                    writer.newLine();
                    line1 = reader1.readLine();
                }
                if (line2 != null) {
                    writer.write(line2);
                    writer.newLine();
                    line2 = reader2.readLine();
                }
            }

            System.out.println("Files merged successfully into " + mergefile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
