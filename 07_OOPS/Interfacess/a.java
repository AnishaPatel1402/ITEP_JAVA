interface I1{
    default void m1(){
        System.out.println("Default of I1");
    }
}

interface I2{
    default void m1(){
        System.out.println("Default of I2");
    }
}

class MyClass implements I1{
    // public void m1(){   //attempting to assign weaker access privileges; was public  -> so write public while overriding
    //     System.out.println("m1 in class");  
    // }
    public void m2(){
        System.out.println("m2 in class");
    }
}

class Test{
    public static void main(String args[]){
        MyClass mc = new MyClass();
        // I1 mc = new MyClass();
        //  I2 mc = new MyClass();

        mc.m1();
        mc.m2();  //error when we class with parent refference
    }
}