class q_6
{
    public static void main(String args[])
    {
        // Q.6.a - convert boolean value into string
        //there are two methods for converting boolean into string
        
      //  1. toString method 
      boolean b = true;
      String str = Boolean.toString(b);
        System.out.println(str);

      // 2. valueOf method
      String str1 = String.valueOf(b);
       System.out.println(str);


       // Q.6.b - convert boolean value into boolean instance
                boolean bs = Boolean.valueOf(b);
                 System.out.println(bs);


       // Q.6.c - convert string value into boolean value
       String str_1 = "true";
       String str_2 = "false";
       String str_3 = "ok";
       boolean x= Boolean.parseBoolean(str_1);
       boolean y = Boolean.parseBoolean(str_2);
       boolean z = Boolean.parseBoolean(str_3);
       System.out.println(x);
       System.out.println(y);
       System.out.println(z);

       // Q.6.d - convert string value into boolean instance
       String str_5 = "123";
       boolean bh = Boolean.valueOf(str_5);
       System.out.println(bh);


       



    }
}
