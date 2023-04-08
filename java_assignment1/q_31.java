//this program will give NumberFormatException as string str is not parsable.
class q_31
{
    public static void main(String [] args)
    {
        String str = "123abc";
       int number = Integer.parseInt(str);
       System.out.println(number);
    }
}