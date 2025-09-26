class Test{
    public static void main(String... args){
       int n = 046;  //octal
       n++;
       System.out.println(n);

       n = 0x45;  //hexadecimal
       System.out.println(n);

       n = 0b10101;  //binary
       System.out.println(n);

       System.out.println(1==1.0f);   //true
       System.out.println(1.0==1.0f);   //true
       System.out.println(1.5==1.5f);   //true
       System.out.println(-0); //0
       System.out.println(-0.0);  //-0.0

       double x = 0.0 / 0.0;          // NaN
        double y = 1.0 / 0.0;          // Infinity
        double z = -1.0 / 0.0;         // -Infinity
        double negZero = -0.0;         // negative zero

        System.out.println("NaN: " + x);
        System.out.println("Positive Infinity: " + y);
        System.out.println("Negative Infinity: " + z);
        System.out.println("Negative Zero: " + negZero);

        // double d = 0.1 + 0.2;
        float d = 0.1f + 0.2f;
        System.out.println("d = "+ d);

        double a = 0.3;
        double b = 0.1 + 0.2;
        System.out.println(a == b); 

        // System.out.println(7/0);
        // System.out.println(7%0);
        System.out.println(0/7);  //0
        System.out.println(0%7);  //0
    }
}