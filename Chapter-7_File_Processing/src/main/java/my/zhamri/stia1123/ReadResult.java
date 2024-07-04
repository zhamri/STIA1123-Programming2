package my.zhamri.stia1123;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class ReadResult {

    public static void main(String[] args) throws IOException {

        //set up file and stream
        File inFile = new File("/Users/zhamri/Documents/JavaProjects/STIA1123-Programming2/Chapter-7_File_Processing/result.txt");
        FileReader fileReader = new FileReader(inFile);
        BufferedReader bufReader = new BufferedReader(fileReader);
        int matric;
        String name;
        double mark;
        char grade;


        // read data  using looping structure
        String currentRow = bufReader.readLine();
        while (currentRow != null) {

            // split up tokens by comma for this data: 1111,Zhamri Che Ani,89.6,A
            String[] tokens = currentRow.split(",");

            matric = Integer.parseInt(tokens[0]); // matric = 1111, matric = 2222
            name = tokens[1]; // name = "Zhamri Che Ani" , name = "Ali Abu"
            mark = Double.parseDouble(tokens[2]); // mark = 89.6 , mark = 60.5
            grade = tokens[3].charAt(0); // grade= 'A' , grade = 'B'

            System.out.println("");
            System.out.println("The matric number = " + matric);
            System.out.println("The name = " + name);
            System.out.println("The mark = " + mark);
            System.out.println("The grade = " + grade);
            currentRow = bufReader.readLine();
        }
        bufReader.close();
        fileReader.close();
    }
}
