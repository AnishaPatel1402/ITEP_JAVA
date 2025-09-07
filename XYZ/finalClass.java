final class MyClass{  //final class cannot be inherited 
    private int a;
    public MyClass(int a){
        this.a = a;
    }
    public void changeA(int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }
    public int square(){
        return a*a;
    }
}
class Test{
    public static void main(String args[]){
        MyClass m = new MyClass(2);
        System.out.println("square = "+ m.square());
        System.out.println("a = "+ m.getA());
        m.changeA(22);
        System.out.println("a = "+ m.getA());
    }
}