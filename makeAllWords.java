import java.util.List;
import java.util.ArrayList;

public class makeAllWords{
  public static List<String> makeAllWords(int k, int maxLetter){
    ArrayList<String> ans = new ArrayList<String>();
    makeAllWords(k, maxLetter, "", ans);
    return ans;
  }
  private static void makeAllWords(int k, int maxLetter, String s, List<String> ans){
    if (k == 0){
      ans.add(s);
    } else {
      for (int i = 0; i < maxLetter; i++){
        makeAllWords(k - 1, maxLetter, (char)('a' + 1) + s, ans);
      }
    }
  }
}
