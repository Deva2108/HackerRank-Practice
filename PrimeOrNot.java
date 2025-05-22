import java.io.*;
import java.math.*;




public class PrimeOrNot {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        BigInteger big = new BigInteger(n);
        
        boolean isPrime = big.isProbablePrime(100);
        
        if(!isPrime){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
        
    }
}
