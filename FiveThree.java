public class FiveThree {
  public static void main(String[] args) {
    char c = 'か';
    if (c == '漢') {
      System.out.println("漢字");
    } else if (c == 'か' || c == 'な') {
      System.out.println("かな");
    } else {
      System.out.println("その他");
    }
  }
}
