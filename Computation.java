class Computation 
{
    public static void main(String[]args)
    {
        //Passing the radius of a circle as the patrameters
        double rad=Float.parseFloat(args[0]);

        //Calculating the area of a circle
        double area=Math.PI*Math.pow(rad,2);

        //Calculating the circumference of a circle
        double circum=2*Math.PI*rad;

        System.out.println("The area of the circle is "+area);
        System.out.println("The circumference of the circle is "+circum);
        

    }
}