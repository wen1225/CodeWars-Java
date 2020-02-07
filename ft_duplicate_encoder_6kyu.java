//My solution
public class DuplicateEncoder {
	static String encode(String word){
    String temp = word.toLowerCase();
    String answer = "";
    int length = word.length();
    
    for (int i = 0; i < length; i++){
        int counter = 0;
        for (int j = 0; j < length; j++){
            if (temp.charAt(i) == temp.charAt(j))
                counter++;
        }
        answer = counter <= 1 ? answer + "(" : answer + ")";
    }
    return answer;
  }
}


//Optimal solution
public class DuplicateEncoder {
  static String encode(String word){
    word = word.toLowerCase();
    String result = "";
    for (int i = 0; i < word.length(); ++i) {
      char c = word.charAt(i);
      result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
    }
    return result;
  }
}
