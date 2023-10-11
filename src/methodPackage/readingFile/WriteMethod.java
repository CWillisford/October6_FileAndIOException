package methodPackage.readingFile;

import java.io.*;

public class WriteMethod {
    public static void main(String[] args) {
        String sourceFile = "src/methodPackage/readingFile/Hamlet.txt";
        String outputFile = "src/methodPackage/readingFile/output.txt";
         //complete this with what she uploads to D2L
//        String sourceContents = readFile(sourceFile);
//        writeFile(outputFile)
    }
    public static String readFile(String filepath) throws IOException {
        StringBuilder sb = new StringBuilder();

        //try-with-resource
        try (FileReader fr = new FileReader(filepath);
             BufferedReader br = new BufferedReader(fr);) {
            {
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line).append('\n');
                }
            }
            return sb.toString();
        }
    }

    public static void writeFile(String filepath, String contents){
        try(FileWriter fw = new FileWriter(filepath)){
            fw.write(contents);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void writeFileReverse(String filepath, String contents) throws IOException{
        StringBuilder sb = new StringBuilder(contents).reverse();

        try(FileWriter fw = new FileWriter(filepath)) {
            fw.write(contents);
        }
    }
}

