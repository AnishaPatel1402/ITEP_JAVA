class Test{
    public Test(int x, float y){
        System.out.println("Integer-Integer Version...");
        this(x); // this-call  error: error: statements before super() is a preview feature and is disabled by default.
    }
    public Test(int x){
        this();
        System.out.println("Integer Version...");
    }
    public Test(){
        System.out.println("Default Version");
    }
}
class TestMain{
    public static void main(String args[]){
        new Test(20,10);
    }
}