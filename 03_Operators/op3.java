/*
  Increment/Decrement
  ++/--
  PreIncrement : Increment first then assign
  PostIncrement : first assign then Increment

  PreDecrement : Decrement first then assign
  PostDecrement : first assign then Decrement
*/
class Test{
    public static void main(String args[]){
        // int x = 10;
        // int y = x++;

        // int x = 10;
        // int y = ++x;
        // System.out.println("x = "+ x + " y = "+ y);

        int x=5;
        boolean y = x++ > 5;
    /*
        y  = x > 5
        x = x + 1;
    */
        System.out.println("x : "+x+" y : "+y);


        byte z = 127;
        ++z;
        System.out.println(z);  //-128
    }
}