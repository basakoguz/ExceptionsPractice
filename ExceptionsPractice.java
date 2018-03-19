

public class ExceptionPractice{
  
  public static void main(String[] args){

    try {
      int[] c = new int[5];
      System.out.println("Element 6 at index 5 is: " + c[5]);
    } catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Exception thrown " + e);
    } finally { //Executes whatever happens above.
      System.out.println("Finally finished try-catch.");
      //This will still execute if written out of finally{} and other try-catch's.
    }
  }

}
