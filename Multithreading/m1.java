class First extends Thread{
    public void run(){
        for(int i=0; i<11; i++){
            System.out.println("First "+ this.getName());
            // System.out.println("First "+ Thread.currentThread().getName());
        }
    }
}

class Second extends Thread{
    public void run(){
        for(int i=0; i<11; i++){
            System.out.println("Second "+ this.getName());
        }
    }
}

class Test{
    public static void main(String args[]){
        System.out.println("Current executing thread : "+ Thread.currentThread());
        System.out.println("Name of thread : "+ Thread.currentThread().getName());

        First t1 = new First();
        // System.out.println("Name of t1: "+ t1.getName());  //by default name is Thread-0 for t1 and for t2 it will be Thread-1
        t1.setName("Anisha");
        t1.start();

        Second t2 = new Second();
        // System.out.println("Name of t2: "+ t2.getName());
        t2.setName("Khushi");
        t2.start();
        
        
    }
}