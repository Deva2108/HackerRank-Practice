import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        for(int i = 1; i<=s.length()-k ;i++){
            String current = s.substring(i,i+k);
            int result = current.compareTo(smallest);
            
            
            if(result < 0){
                smallest = current;
            }
            result = current.compareTo(largest);
            if(result > 0){
              largest = current;
            }
            
        }
        
        return smallest + "\n" + largest;
        
        
        
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}