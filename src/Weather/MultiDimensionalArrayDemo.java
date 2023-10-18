package Weather;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4};
        int[][] y = { {1,2,3},
                      {4,5,6},
                      {7,8,9} };

        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.deepToString(y));

        System.out.println(y[1].length);

        
    }
}
