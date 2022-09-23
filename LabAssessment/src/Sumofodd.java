import java.util.*;


public class Sumofodd {
    public static void main(String args[]) {
        int N, i, sum = 0;
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        N = sc.nextInt();
 
        for(i = 0; i <= N; i++){
            if((i%2) == 1){
                sum += i;
            }
        }
     
        System.out.print("Sum of all odd numbers between 0 to "
            + N + " = " + sum);
    }
}
