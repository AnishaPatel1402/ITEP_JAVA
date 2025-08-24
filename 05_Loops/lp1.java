import java.util.Scanner;
class Test{
    public static void main(String args[]){
        // int i=1;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }
        // System.out.println("Outside the loop : "+i);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit");
        int n = sc.nextInt();

        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        System.out.println("Outside the loop : "+i);

    }
}