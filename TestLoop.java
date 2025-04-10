public class TestLoop {
  public static void main (String[] args) {
    
    String id = "A1234567";
    int counter = 0;
    for ( int i = 0; i < id.length(); i++){
      if (id.charAt(i) % 2 == 0) {
        counter ++;
      }
    }
    System.out.println("How many even number(s) in your ID? " + counter);

  }
}
