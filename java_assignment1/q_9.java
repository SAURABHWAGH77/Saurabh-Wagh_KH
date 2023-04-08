class q_9
{
    public static void main(String [] args)
    {
        byte value = 115;
        Byte bs = new Byte(value);

        byte b1 = bs.byteValue();
        System.out.println("b1 : "+b1);

         short s1 = bs.shortValue();
        System.out.println("s1 : "+s1);

         int i1 = bs.intValue();
        System.out.println("i1 : "+i1);

         float f1 = bs.floatValue();
        System.out.println("f1 : "+f1);

         double d1 = bs.doubleValue();
        System.out.println("d1 : "+d1);
    }

}