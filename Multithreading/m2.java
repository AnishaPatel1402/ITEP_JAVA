class First extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("First");
            //sleep method is a static method of thread class
            //sleep method throw an exception so write it inside try catch else error -> unreported exception InterruptedException; must be caught or declared to be thrown
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class Second extends Thread {
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Second");
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class Test{
    public static void main(String args[]){
        // Thread mainThread = new Thread();
        // System.out.println(mainThread.getPriority());
        // System.out.println("maximum priority : "+ Thread.MAX_PRIORITY);
        // System.out.println("minimum priority : "+ Thread.MIN_PRIORITY);
        // System.out.println("normal priority : "+ Thread.NORM_PRIORITY);

        //Setting the priority of main thread
        Thread.currentThread().setPriority(9);
        System.out.println(Thread.currentThread().getPriority());

        First t1 = new First();
        t1.start();
        System.out.println(t1.getPriority());

        
        Second t2 = new Second();
        t2.start();
         System.out.println(t2.getPriority());

    }
}