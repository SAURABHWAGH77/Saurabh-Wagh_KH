class q_14
{
    public static void main(String [] args)
    {
        short value = 24434;
        Short ss = new Short(value);

        byte b1 = ss.byteValue();
        System.out.println("b1 : "+b1);

         short s1 = ss.shortValue();
        System.out.println("s1 : "+s1);

         int i1 = ss.intValue();
        System.out.println("i1 : "+i1);

         float f1 = ss.floatValue();
        System.out.println("f1 : "+f1);

         double d1 = ss.doubleValue();
        System.out.println("d1 : "+d1);
    }

}