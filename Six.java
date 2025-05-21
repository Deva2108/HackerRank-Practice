import java.util.*;

class Six{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = a;
            int state = b;
            for(int j = 0; j<n;j++){
                sum = sum + state;
                System.out.print(sum + " ");
                state = state*2;
            }
            
            System.out.println();
        }
        in.close();
    }
}