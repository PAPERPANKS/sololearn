/**
 * loop
 */
class loop1 extends Thread {
    private int num=5;
    public void run() {
        try{
                for (int var=1;var<=num;var++) {
            System.out.println("value "+var);
            sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class loop2 extends Thread {
    private int num=5;
    public void run() {
        //try{
                for (int var=1;var<=num;var++) {
            System.out.println("value "+var);
            
            }
        //}
        // catch(InterruptedException e){
        //     System.out.println(e);
        // }
    }
}
class multiple{
    public static void main(String[] args) {
        loop1 obj = new loop1();
        new loop2().start();
        obj.start();
    }
}