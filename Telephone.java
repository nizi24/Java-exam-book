public class Telephone {
  String telephoneNumber;

  public Telephone (String telNum) {
    telephoneNumber = telNum;
    System.out.println("新しい携帯電話を作成しました");
  }

  public void receiveCall (String caller) {
    System.out.println("ring! ring! ring!");
    System.out.println("Calling from " + caller);
  }

  public void talkSomething (String msg) {
    System.out.println("[" + msg + "]");
  }

  public void hungUp () {
    System.out.println("bye!");
  }
}
