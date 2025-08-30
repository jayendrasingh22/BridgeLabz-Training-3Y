import java.util.*;
public class Purchase_Total_L2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double unitPrice=sc.nextDouble();
        int qty=sc.nextInt();
        double total=unitPrice*qty;
        System.out.println("The total purchase price is INR "+total+" if the quantity "+qty+" and unit price is INR "+unitPrice);
    }
}