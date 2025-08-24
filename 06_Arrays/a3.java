/*
    [size] ===> int size;
 */
class Test{
    public static void main(String args[]){

        // double x[] = new double[2147483647];  //Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit

        // int x[] = new int[0];  //no error
        // x[0] = 100; //Index 0 out of bounds for length 0

        // int x[] = new int[-5];  //Exception in thread "main" java.lang.NegativeArraySizeException: -5

        // int x[] = new int['A']; // 65

        // int x[] = new int[10L];    //incompatible types: possible lossy conversion from long to int

        // int x[] = new int[(byte)(10L)]; 

        int x[] = new int[3];
        
    }
}