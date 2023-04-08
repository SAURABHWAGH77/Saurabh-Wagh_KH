class q_28
{
    public static void main(String []args)
    {
        // Q.28.a    convert long value into string value
        double value = 54.65;
        String str = Double.toString(value);
        System.out.println(str);

          // Q.28.b   convert long value into long instance
          double s = Double.valueOf(value);
          System.out.println(s);

          // Q.28.c   convert string instance into int instance

          //Q.28.d. int value into binary, octal and hexadecimal string.
         String BinaryString = Double.toBinaryString(value);
         String OctalString = Double.toOctalString(value);
         String HexString = Double.toHexString(value);

         
         System.out.println("BinaryString : "+BinaryString);
         System.out.println("OctalString : "+OctalString);
         System.out.println("HexString : "+HexString);

    }
}