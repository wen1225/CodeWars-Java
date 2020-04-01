//Attempt 1
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

//Attempt 2
public class DuplicateEncoder {
  static String encode(String word){
    String wordInLowerCase = word.toLowerCase();
    String encodedWord = "";
    
    for (int i = 0; i < word.length(); i++){
        int counter = 0;
        for (int j = 0; j < word.length(); j++){
            if (wordInLowerCase.charAt(i) == wordInLowerCase.charAt(j) && counter < 2)
                counter++;
        }
        if (counter < 2)
        encodedWord =  encodedWord + "(";
        else
        encodedWord = encodedWord + ")";
    }
    return encodedWord;
  }
}

//Top voted solution
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
