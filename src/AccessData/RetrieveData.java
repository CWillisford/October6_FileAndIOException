package AccessData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RetrieveData {
    public static void main(String[] args) {

    }

    public static List<Double> readFile(String filename) throws IOException {
        List<Double> numbers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                for (String x : parts) {
                    numbers.add(Double.parseDouble(x.trim()));
                }
            }


        }

    }
}
