import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Split the string on all non-alphabetic characters
        String[] tokens = s.trim().split("[^A-Za-z]+");

        // Check for empty input
        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}
