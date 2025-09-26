class Test{
    public static void main(String args[]){
        int a = 5;
        // Pre-increment
        int b = ++a;  // a=6, b=6

        // Post-increment
        int c = a++;  // c=6, a=7

        // Pre-decrement
        int d = --a;  // a=6, d=6

        // Post-decrement
        int e = a--;  // e=6, a=5

        float f = 1.1f;
        System.out.println(++f);  //2.1

        int x = 5, y = 3, z;
        z = ++x - x-- * y++ / ++x;
        System.out.println(z);

    }
}