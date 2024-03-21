import java.util.Scanner;


public class Week {
    public static void main (String [] args){
        System.out.println("please input x y coordinate");
        Scanner input = new Scanner (System.in);

        double x = input.nextDouble();
        double y= input.nextDouble();

        int width = 10;
        int height =5;
        
        if (x<= width/2 && x >= -width/2 && y <= height/2 && height >= -height/2) {
System.out.println("The point is within the rectangle");
 }else{
 System.out.println("The point is not within the rectangle");
 }
    }
    
}
