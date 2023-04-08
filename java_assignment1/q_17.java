class q_17
{
    public static void main(String [] args)
    {
        int value = 115;
        Integer bs = new Integer(value);

        byte b1 = bs.byteValue();
        System.out.println("b1 : "+b1);

         short s1 = bs.shortValue();
        System.out.println("s1 : "+s1);

         int i1 = bs.intValue();
        System.out.println("i1 : "+i1);

         float f1 = bs.byteValue();
        System.out.println("f1 : "+f1);

         double d1 = bs.byteValue();
        System.out.println("d1 : "+d1);
    }

}