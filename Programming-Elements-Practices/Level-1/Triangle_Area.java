import java.util.*;
public class Triangle_Area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        double area=0.5*base*height;
        double area_cm=area*6.4516;
        System.out.println("The area of triangle in square inches is "+area+" and in square cm is "+area_cm);
    }
}