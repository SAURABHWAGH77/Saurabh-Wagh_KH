class q_13
{
    public static void main(String []args)
    {
        // Q.13.a    convert short value into string value
        short value = 345;
        String str = Short.toString(value);
        System.out.println(str);

          // Q.13.b   convert short value into short instance
          short s = Short.valueOf(value);
          System.out.println(s);

          // Q.13.c   convert string instance into short instance
    }
}