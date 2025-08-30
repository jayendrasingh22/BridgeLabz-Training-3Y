import java.util.*;
public class Feet_To_Yards_Miles{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double feet=sc.nextDouble();
        double yards=feet/3.0;
        double miles=yards/1760.0;
        System.out.println("The distance in feet is "+feet+" while in yards is "+yards+" and in miles is "+miles);
    }
}