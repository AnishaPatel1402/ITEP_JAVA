class Test{
    public static void main(String args[]){
        System.out.println(7.5 % 2.1);

        float f1 = 7.5f;
        float f2 = 2.1f;
        float res = f1%f2;
        System.out.println(res);
        System.out.println(0.0 / 0);   //NaN
        System.out.println(10.0 / 0.0);   //Infinity


        boolean b1 = true;
        // System.out.println(b1 > false);  //error: bad operand types for binary operator '>'

        int a = 10, b = 30, c = 88;
        // System.out.println(a==b==c);  //error: incomparable types: boolean and int

        float f = 0.1f;
        double d = 0.1;
        // float f = 1.0f;
        // double d = 1.0;
        System.out.println(f == d); // false : float and double have different precision → value is promoted to double → small mismatch.
        System.out.println(1.0 == 1); //true
        System.out.println(1.0f == 1); //true
        System.out.println(1.0f == 1.0); //true
        System.out.println(1.2f == 1.2); //false
        System.out.println(0.0f == 0.0); //true


        int x = 5;
        long y = 5L;
        System.out.println(x == y); // true

    }
}