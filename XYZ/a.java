class Parent {
    void m1(){
        System.out.println("Hello parent");
    }
}
class Child extends Parent{
    int a = 10;
    void m1(){
        System.out.println("Hello child");
    }
}

class Main{
    public static void main(String args[]){
        Parent c = new Child();
        System.out.println(c.a); //error : cannot find symbol
    }
}