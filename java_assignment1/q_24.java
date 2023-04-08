class q_24
{
    public static void main(String []args)
    {
        // Q.24.a    convert long value into string value
        float value = 54.34f;
        String str = Float.toString(value);
        System.out.println(str);

          // Q.24.b   convert long value into long instance
          float s = Float.valueOf(value);
          System.out.println(s);

          // Q.24.c   convert string instance into int instance

          //Q.24.d. convert int value into  hexadecimal string.
        
         String HexString = Float.toHexString(value);

         System.out.println("HexString : "+HexString);

    }
}