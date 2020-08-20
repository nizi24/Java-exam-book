public class CellularPhone extends Telephone {
  int batteryRemaining = 100;

  public CellularPhone (String telNum) {
    super(telNum);
  }

  public void hungUp () {
    System.out.println("bye!");
    batteryRemaining  -= 10;
    System.out.println("batteryRemaining: " + batteryRemaining);
  }
}
