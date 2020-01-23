import java.util.Scanner;


class Computation1
{
    public static void main(String[]args)
    {
        Scanner i=new Scanner(System.in);
       
       //To find out the area of a circle
        System.out.println("Enter the radius of a circle");

        double radius=i.nextDouble();
        double area=Math.PI*Math.pow(radius,2);

        //To find out the circumference of a circle
        
        double circum=2*Math.PI*radius;

        System.out.println("The area of the circle is "+area);
        System.out.println("The circumference of the circle is "+circum);
        


    }

}