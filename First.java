import java.io.*;
import java.util.*;

public class First {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int count = 1;
        while(sc.hasNext()){
            String N = sc.nextLine();
            System.out.println(count + " " +N);
            count++;
        }
    }
}
