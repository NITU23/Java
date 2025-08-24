import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReaderScanner {
    public static void main(String args[]) throws IOException {

        System.out.println("Please Enter A number: ");

        // below is the older method to take inputs in java.
        /*
         * InputStreamReader in = new InputStreamReader(System.in);
         * BufferedReader bf = new BufferedReader(in);
         * 
         * int num = Integer.parseInt(bf.readLine());
         * 
         * System.out.println(num);
         * bf.close();
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }

}