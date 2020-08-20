public class Someone {
  public static void main(String[] args) {
    CellularPhone myPhone = new CellularPhone("123-4567");
    myPhone.receiveCall("111-1111");
    myPhone.talkSomething("久しぶり!");
    myPhone.talkSomething("元気?");
    myPhone.hungUp();
  }
}
