class cooking extends Thread{
    public void run(){
        System.out.println("I am cooking");
    }
}
class chatting extends Thread{
    public void run(){
        System.out.println("I am chatting");
    }
}
public class multithreading {
    public static void main(String[] args) {
        cooking cook=new cooking();
        chatting chat = new chatting();
        cook.start();
        chat.start();
    }
    
}
