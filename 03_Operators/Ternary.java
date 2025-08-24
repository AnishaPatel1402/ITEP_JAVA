class Test{
    public static void main(String args[]){
        //ternary operator
        //(condition) ? exp1(if condition true) : exp2(if condition is false);
        int n = 10;
        // (n>20) ? System.out.println("Indore") : System.out.println("Pune");  //error: not a statement
        String s = (n>20)?"Indore":"Pune";
        System.out.println(s);
    }
}