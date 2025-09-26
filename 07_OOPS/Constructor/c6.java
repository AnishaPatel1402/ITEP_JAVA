
class Addition{
    private int a;
    private int b;
    public Addition(){}
    public Addition(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public void add(){
        System.out.println("Addition : "+(a+b));
    }
}
class TestMain{
    public static void main(String arggs[]){
        Addition obj = new Addition(20,10); //obj= {a:20,b:10}
        obj.add();
        obj.setA(50);
    }
}

// class Parent {
//     Parent(int x) {
//         System.out.println("Parent constructor: " + x);
//     }
// has no default constructor but in child compile implicitly add super() so here will be error
// error: constructor Parent in class Parent cannot be applied to given types;
//   required: int
//   found: no arguments
// }

// class Child extends Parent {
//     Child() {
//         System.out.println("Child constructor");
//     }
// }
