
class Overloading{
    public void m1(){
        System.out.println("Default version...");
    }
    // public void m1(int x){
    //     System.out.println("Int version...");
    // }
    public void m1(float x){
        System.out.println("Float version....");
    }
    public void m1(double x){
        System.out.println("Double version....");
    }
    public void m1(int x, int y){
        System.out.println("Int-Int version...");
    }
}

class TestMain{
    public static void main(String args[]){
        Overloading obj = new Overloading();
        obj.m1();
        obj.m1(100); // HMP :- 1, TOP :- int
        obj.m1(20,10);
    }
}


//in overloading return type doesn't matter 
// class Test {
//     int m1(int x) { return x; }
//     double m1(int x) { return x * 2; }  // ❌ Compile-time error -> method m1(int) is already defined in class Test
// }
