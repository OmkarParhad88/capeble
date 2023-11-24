 class main {
  public static void main (String[]args) {
    int n = 8;
    // for (int i = 0; i < n; i++) { 
    //   thread object = new thread();
    //   object.start();
    // }

    for (int i = 0; i < n; i++) {
      Thread object = new Thread(new thread());
      object.start();
    }
  }
  
}
