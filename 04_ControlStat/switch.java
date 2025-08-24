
/*
  switch(expression/value){
     case label-1 : statment--1;
                    statement--2;
                    break;
     case labe-2 : statement---2;
                   break;
     :
     :
     default : default-statment;                             
  }
 */
import java.util.Scanner;
class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a value b/w 1 to 5");
      int n = sc.nextInt();
      // n=7
      int a = 2,b=1;
      switch(n){
        // case a+b: System.out.println("three");break;
        case 4: System.out.println("four");break;
        case 3: System.out.println("three");break;
        case 1: System.out.println("one");break;
        case 2: System.out.println("two");break;
        case 5: System.out.println("five");break;
        default: System.out.println("Invalid value");
      }
    }
}



