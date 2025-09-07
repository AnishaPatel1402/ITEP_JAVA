
class A{
    protected void m1(){
        System.out.println("A-m1()");
    }
}
class B extends A{
//     private void m1(){  //Error : attempting to assign weaker access privileges; was protected
//     System.out.println("B-m1()");
//    }
   public void m1(){  //assigning weaker access to higher access 
    System.out.println("B-m1()");
   }
}
class TestMain{
    public static void main(String args[]){
        A obj = new B();
        obj.m1();
    }
}
