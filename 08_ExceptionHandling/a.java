class Main{
    public static void main(String args[]){
        try{
            int a = 10/0;
            // String s = null;
            // System.out.println(s.length());
        }
        catch(ArithmeticException e){
            System.out.println("AE");
            String s = null;
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println("NE");
        }
        finally{
            System.out.println("Finally executed!");
        }
    }
}