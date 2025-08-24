import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int array[] = new int [n];
        byte array1[] = new byte [n];
        short array2[] = new short [n];
        long array3[] = new long [n];
        float array4[] = new float [n];
        double array5[] = new double [n];
        boolean array6[] = new boolean [n];
        char array7[] = new char[n];
        String array8[] = new String[n];

        // System.out.print("Default Data is : ");  //int default value is 0
        // for(int i=0; i<n; i++){
        //     System.out.print(array[i]+" ");
        // }
        // System.out.println();

        System.out.println("int = " + array.getClass());
        System.out.println("byte = " + array1.getClass());
        System.out.println("short = " + array2.getClass());
        System.out.println("long = " + array3.getClass());
        System.out.println("float = " + array4.getClass());
        System.out.println("double = " + array5.getClass());
        System.out.println("boolean = " + array6.getClass());
        System.out.println("char = " + array7.getClass());
        System.out.println("string = " + array8.getClass());
    }
}