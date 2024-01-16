public class thread implements Runnable {
  public void run() {
    try{
      System.out.println("Thread " + Thread.currentThread().getId() + "is running");
    }
    catch ( Exception e ){
      System.out.println("exception is cought");
    }
  }
  
}
