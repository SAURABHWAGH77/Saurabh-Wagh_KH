class q_8
{
    public static void main(String args [])
    {   
        //Q.8.a. Convert byte value into string
        byte b = 3;
        String str = String.valueOf(b);
        System.out.println(str);

         //Q.8.b. Convert byte value into byte instance
         byte bi = Byte.valueOf(b);
         System.out.println(bi);

    } 
}