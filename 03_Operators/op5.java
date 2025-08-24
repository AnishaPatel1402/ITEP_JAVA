/*
  Logical Operation :-
   1. && AND
   2. || OR
   
   A        B         A&&B           A||B
  (a>b)    (c<d)    (a>b)&&(c<d)   (a>b)||(c<d)
   T        F          F             T
   F        T          F             T
   T        T          T             T
   F        F          F             F

 */
class Test{
    public static void main(String arg[]){
       int a,b,c,d;
       a = 10;
       b = 20;
       c = 30;
       d = 40;
       
    //    boolean x  = (a > b) && (++c < d);  //short circuit behavior of && => 2nd exp will not be evaluated

    //    boolean x = (a > b) & (++c < d);  //prevent short circuit behavior by only sigle &  => 2nd exp will also evaluated
       /*
       x  = (a > b) && (++c < d);
            10 > 20
            false && (++c<d)
            false &&  31 < 40
                false && true
                      false      
        */



       // OR will work same as &&
    //    boolean x = (a < b) || (++c < d);  //short circuit
    boolean x = (a < b) | (++c < d);  //prevent short circuit

       System.out.println(x);
       System.out.println("a : "+a);
       System.out.println("b : "+b);
       System.out.println("c : "+c);
       System.out.println("d : "+d);
    }
}