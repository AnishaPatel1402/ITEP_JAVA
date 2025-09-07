class Test{
    static void swap(int a , int b){
        // int temp = a;
        // a = b;
        // b = temp;

        Integer temp = a;
        a = b;
        b = temp;
    }
    public static void main(String args[]){
        // primitive integer variables
        int a = 10; 
        int b = 20; 
        System.out.println("Int primitive");
        System.out.println("Value of a and b before swaping : "+a+" "+b);
        swap(a,b);
        System.out.println("Value of a and b before swaping : "+a+" "+b);  // no change in values because java is PASS BY VALUE not PASS BY REFERENCE


        //now take Integer (wrapper class where Integer is a object)
        
        Integer x = 10;   // Integer x = new Integer(10);
        Integer y = 20;
        System.out.println("Integer object");
        System.out.println("Value of a and b before swaping : "+x+" "+y);
        swap(a,b);
        System.out.println("Value of a and b before swaping : "+x+" "+y);  // still values will be same | this is because Integer class is FINAL (that can't be changed)
    }
}