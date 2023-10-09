package AccessFile.reverseOrder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile1LineByLine {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("src/AccessFile/hamletShort.txt");


            BufferedReader bufferedReader = new BufferedReader(file);
            //read each line
            String line1 = bufferedReader.readLine();
            String line2 = bufferedReader.readLine();
            String line3 = bufferedReader.readLine();

            //print each line
            if(line1 != null)System.out.println(line1);
            if(line2 != null)System.out.println(line2);
            if(line3 != null)System.out.println(line3);

            //close the bufferreader object
            bufferedReader.close();

        }catch(IOException e){

        }
    }
}
