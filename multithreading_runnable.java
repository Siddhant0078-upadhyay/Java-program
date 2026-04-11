class cookin implements Runnable{
    public void run(){
       System.out.println("I am cooking");
        System.out.println("I am cooking");
        System.out.println("I am cooking");
      System.out.println("I am cooking");
    System.out.println("I am cooking");
     System.out.println("I am cooking");
    System.out.println("I am cooking");
    System.out.println("I am cooking");
    System.out.println("I am cooking");
    System.out.println("I am cooking");
    System.out.println("I am cooking");
     System.out.println("I am cooking");
    }} 
class chattin implements Runnable{
    public void run(){
        System.out.println("I am chatting");
        System.out.println("I am chatting");
        System.out.println("I am chatting");
        System.out.println("I am chatting");
        System.out.println("I am chatting");
        System.out.println("I am chatting");
        System.out.println("I am cooking");
        System.out.println("I am chatting");
        System.out.println("I am chatting");
        System.out.println("I am chatting");
        System.out.println("I am chatting");
        System.out.println("I am chatting");
        System.out.println("I am chatting");
        System.out.println("I am cooking");
        
       }}
public class multithreading_runnable {
    public static void main(String[] args){
        cookin t1 = new cookin();
        Thread cook = new Thread(t1);
        chattin t2 = new chattin();
        Thread chat = new Thread(t2);
        chat.start();
        cook.start();
        System.err.println("The id of thread is "+chat.getId());

    }
    
}
 