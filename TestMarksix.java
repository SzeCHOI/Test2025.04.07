import java.util.Arrays;
import java.util.Random;

public class TestMarksix {
  public static void main (String[] args){
    // Print six differnt number for marksix
    int count = 0;
    int[] marksix = new int[6];
    boolean isDuplicated = false;
    while (count < 6){
      int x = new Random().nextInt(49)+1;
      isDuplicated = false;
      for (int i = 0; i < marksix.length; i++){
        if(marksix[i] == x){
          isDuplicated = true;
          break;
        }
      }
        if (!isDuplicated){
          marksix[count] = x;
          count++;
        }
    }
    System.out.println(Arrays.toString(marksix));

    int temp = -1;
    for (int i = 0; i < marksix.length - 1; i ++){
      for (int j = 0; j < marksix.length - i -1; j++){
        if ( marksix[j+1] < marksix[j]){
          temp = marksix[j+1];
          marksix[j+1] = marksix[j];
          marksix[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(marksix));


  }
  
}
