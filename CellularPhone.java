public class CellularPhone extends Telephone {
  int batteryRemaining = 100;

  public CellularPhone (String telNum) {
    super(telNum);
  }

  public void hungUp () {
    super.hungUp();
    batteryRemaining  -= 10;
    System.out.println("batteryRemaining: " + batteryRemaining);
  }
}
