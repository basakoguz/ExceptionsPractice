import java.util.concurrent.TimeUnit;

public class HotChocolate{

  public static final double tooHot = 185;
  public static final double tooCold = 160;

  public static void drinkHotChocolate(double cocoaTemp) throws
                                            TooHotException, TooColdException {
    if (cocoaTemp >= tooHot){
      throw new TooHotException();
    }
    else if (cocoaTemp <= tooCold){
      throw new TooColdException();
    }
  }

  public static void main(String[] args) throws InterruptedException{
    double currentCocoaTemp = 200;
    boolean wrongTemp = true;
    while(wrongTemp){
      try {
        drinkHotChocolate(currentCocoaTemp);
        System.out.println("That cocoa was good!");
        wrongTemp = false;
      } catch(TooHotException e1){
        System.out.println("THAT'S TOO HOT!");
        currentCocoaTemp = currentCocoaTemp - 5;
      } catch(TooColdException e2){
        System.out.println("EWWW THAT'S SO COLD!");
        currentCocoaTemp = currentCocoaTemp + 5;
      }
      TimeUnit.SECONDS.sleep(2);//Tries  with 2 seconds intervals.
      //Too hot! (Decreases temperature.) After 2 secs, try again.
      //throws InterruptedException should be declared in the method declaration.
    }
    System.out.println("And it's gone...");
  }
}
