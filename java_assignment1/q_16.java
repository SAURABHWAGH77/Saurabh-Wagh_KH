class q_16
{
    public static void main(String []args)
    {
        // Q.13.a    convert int value into string value
        int value = 54;
        String str = Integer.toString(value);
        System.out.println(str);

          // Q.13.b   convert int value into int instance
          int s = Integer.valueOf(value);
          System.out.println(s);

          // Q.13.c   convert string instance into int instance

          //Q.13.d. int value into binary, octal and hexadecimal string.
         String BinaryString = Integer.toBinaryString(value);
         String OctalString = Integer.toOctalString(value);
         String HexString = Integer.toHexString(value);

         
         System.out.println("BinaryString : "+BinaryString);
         System.out.println("OctalString : "+OctalString);
         System.out.println("HexString : "+HexString);

    }
}