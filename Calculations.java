class Calculations
{
    public static void main(String[]args)
    {
        double num=Double.parseDouble (args[0]);
        
        //Squared value of the given number
        double sq=Math.pow(num,2);

        //Squareroot value of the given number
        double sqrt=Math.sqrt(num);

        System.out.println("Squared value for the given number "+sq);
        System.out.println("Squareroot value for the given number"+sqrt);

    
    }
}
