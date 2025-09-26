class Test{
    public static void main(String args[]){
        // System.out.println(~5);
        // System.out.println(~-5);
        // System.out.println(~9);
        // System.out.println(~-10);
        int x = 8;

        // if(x=4){}  //error: incompatible types: int cannot be converted to boolean
        // System.out.println(x);

        String s = "Java";
        switch(s) {
            case "Python": System.out.println("Python");
            // case "Java": System.out.println("Python");  //error: duplicate case label
            case "Java": System.out.println("Java");
            default: System.out.println("Default");
        }       

        // int a[], n;
        // a = new int [9];
        // n = 90;
        // System.out.println(n);
        // System.out.println(a);  //[I@372f7a8d : [type@hashcode
        
        char ch[] = new char [5];
        for(char c : ch){
            System.out.println(c);
        }
    }
}