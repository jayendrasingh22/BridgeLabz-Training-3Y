import java.util.*;
public class Factorial_For{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0){
            long fact=1;
            for(int i=1;i<=n;i++) fact*=i;
            System.out.println(fact);
        }else System.out.println("Not Natural");
    }
}