package AccessFile.reverseOrder;

public class RecursionBasic {
    public static void main(String[] args) {

        RecursionBasic rb = new RecursionBasic();
        String x = rb.reverseString("Friday");
        System.out.println(x);
        //Friday
    }

    public String reverseString(String str){
        System.out.println("entering: " + str); //see whats happening
        //base to stop the recursive call
        if(str.isEmpty()){
            return str;
        }
        else{
            String reversed = reverseString(str.substring(1)) + str.charAt(0);
            System.out.println("returning value: " + reversed); //see whats happening
            return reversed;
        }
        //recursive call of the method reverseString
    }
}
