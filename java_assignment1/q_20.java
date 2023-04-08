class q_20
{
    public static void main(String []args)
    {
        // Q.20.a    convert long value into string value
        long value = 54;
        String str = Long.toString(value);
        System.out.println(str);

          // Q.20.b   convert long value into long instance
          long s = Long.valueOf(value);
          System.out.println(s);

          // Q.20.c   convert string instance into int instance

          //Q.20.d. int value into binary, octal and hexadecimal string.
         String BinaryString = Long.toBinaryString(value);
         String OctalString = Long.toOctalString(value);
         String HexString = Long.toHexString(value);

         
         System.out.println("BinaryString : "+BinaryString);
         System.out.println("OctalString : "+OctalString);
         System.out.println("HexString : "+HexString);

    }
}