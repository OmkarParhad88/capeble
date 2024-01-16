/**
 * parenthases
 */
public class parenthases {

  public boolean valid(String s) {
    char c[] = new char[s.length()];

    for (int i = 0; i < s.length(); i++) {
      char a = s.charAt(i);
      if (a == '[' || a == '{' || a == '(') {
        c[i] = a;
      }
      if (a == ']' || a == '}' || a == ')') {
        flag2++;
      }
    }

  }

  public static void main(String[] args) {

    String s = "{()}";

    for (int i = 0; i < s.length(); i++) {
      char a = s.charAt(i);
      if (a == '[' || a == '{' || a == '(') {

      }
      if (a == ']' || a == '}' || a == ')') {
        flag2++;
      }
    }

  }

}