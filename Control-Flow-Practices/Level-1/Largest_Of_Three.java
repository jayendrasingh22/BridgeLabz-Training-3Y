import java.util.*;
public class Largest_Of_Three{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt(),n2=sc.nextInt(),n3=sc.nextInt();
        boolean f=(n1>=n2 && n1>=n3);
        boolean s=(n2>=n1 && n2>=n3);
        boolean t=(n3>=n1 && n3>=n2);
        System.out.println("Is the first number the largest? "+f);
        System.out.println("Is the second number the largest? "+s);
        System.out.println("Is the third number the largest? "+t);
    }
}