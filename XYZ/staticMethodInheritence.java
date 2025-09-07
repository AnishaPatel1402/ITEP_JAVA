// Method Hiding (static methods)
// Happens with static methods.
// Child defines a method with the same name as Parent’s static method.
// But this does not replace the Parent’s method — both methods exist, just “hidden.”
// Which one gets called is decided at compile time, based on reference type or class name used.

class Parent {
    static void display() {
        System.out.println("Parent static method");
    }
}
class Child extends Parent {
    static void display() {  // ❌ not overriding → ✅ hiding
        System.out.println("Child static method");
    }
}
public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();   // Output: Parent static method (reference type is Parent)

        Child c = new Child();
        c.display();   // Output: Child static method (reference type is Child)

        Parent.display(); // Parent static method
        Child.display();  // Child static method
    }
}
