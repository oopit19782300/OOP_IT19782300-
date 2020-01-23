import java.util.Scanner;
class Details
{
    public static void main(String[]args)   
    {

        Scanner i=new Scanner(System.in);

        System.out.println("Enter the item name");
        String item_name=i.next();

        System.out.println("Enter the quantity");
        int qty=i.nextInt();

        System.out.println("Enter the Unit price");
        float Unit_price=i.nextFloat();

        double Total=Unit_price*qty;
        System.out.println("The total is "+Total);



    }
}