class Conversions
{
    public static void main(String[]args)
    {
        int miles;
        int yards;
        double kilometers;
        double kilometers1;
        miles=26;
        yards=385;

        kilometers=26*1.609;
        miles=yards/(int)1760.0;
        kilometers1=miles*1.609;

        System.out.println("26 miles from kilometers is "+kilometers+" km");
        System.out.println("385 yards in kilometers is"+kilometers1+" km");


    }
}