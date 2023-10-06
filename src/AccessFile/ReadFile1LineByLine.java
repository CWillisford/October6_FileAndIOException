package AccessFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile1LineByLine {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("src/AccessFile/hamletShort.txt");


            BufferedReader bufferedReader = new BufferedReader(file);

            String line1 = bufferedReader.readLine();
            String line2 = bufferedReader.readLine();
            String line3 = bufferedReader.readLine();
        }catch(IOException e){

        }
    }
}
