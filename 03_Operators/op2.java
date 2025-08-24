class Test{
    public static void main(String args[]){

        //remove the last digit of any integer number
        int x = 1234;
        x = x/10;
        System.out.println(x);

        //to get the last digit of any integer number
        int y = 1234;
        y = y%10;
        System.out.println(y);

        // Relational Operator 
        // >, <, >=, <=, ==, !=   
        //result will be in boolean either true/false

      System.out.println("20 > 20 : "+(20 > 20)); // false 
      System.out.println("20 >= 20 :"+(20 >= 20));  //true
      System.out.println("20 == 20  :"+(20 == 20)); //true      
      System.out.println("20 != 20  :"+(20 != 20)); // false


        int a = 10, b = 10, c = 10, d = 10;
    //   int res = a==b==c==d;
    //   System.out.println(res);  //error: incomparable types: boolean and int

    //   boolean res = a==b==c==d;
    //   System.out.println(res);  ////error: incomparable types: boolean and int

        boolean res = (a==b)==(c==d);
        System.out.println("res = " + res);



    }
}