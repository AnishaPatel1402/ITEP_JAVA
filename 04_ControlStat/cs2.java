import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a value");
      int n = sc.nextInt();
      // n = 15
      if(n > 10) 
       System.out.println("indore");  //associate with if stat.
      System.out.println("pune");   // not associate with if | its an independent stat


//    finding n is +ve or -ve or 0
      if(n>0)
         System.out.println("+ve");
       else if(n < 0)
          System.out.println("-ve");
        else   
          System.out.println("Neither +ve nor -ve");
    }
}