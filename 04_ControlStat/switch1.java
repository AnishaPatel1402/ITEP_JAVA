import java.util.Scanner;
class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int n = sc.nextInt();

      switch(n%2){
        case 0 : System.out.println("EVEN");break;
        default: System.out.println("ODD");
      }
    }
}