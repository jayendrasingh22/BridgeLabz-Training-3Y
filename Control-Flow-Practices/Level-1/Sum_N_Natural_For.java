import java.util.*;
public class Sum_N_Natural_For{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            int formula=n*(n+1)/2;
            int sum=0;
            for(int i=1;i<=n;i++) sum+=i;
            System.out.println(formula);
            System.out.println(sum);
        }else System.out.println("Not Natural");
    }
}