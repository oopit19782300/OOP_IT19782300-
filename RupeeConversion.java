import java.util.Scanner;
class RupeeConversion
{
    public static void main(String[]args)
    {
        Scanner i=new Scanner(System.in);

        System.out.println("Enter the  amount in Rupees ");
        float amount=i.nextFloat();

        float  Dollar= amount/(float)182.26;
        float Pound= amount/(float)222.74;
        float Euro=amount/(float)206.36;

        
        System.out.println(amount+" LKR =" +Dollar+" $");
        System.out.println(amount+" LKR =" +Pound+" Pounds");
        System.out.println(amount+" LKR =" +Euro+" Euros");


    }
}