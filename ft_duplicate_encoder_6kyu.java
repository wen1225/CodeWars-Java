/*  
Problem: 
The goal of this exercise is to convert a string to a new string where each character 
in the new string is "(" if that character appears only once in the original string, 
or ")" if that character appears more than once in the original string. Ignore 
capitalization when determining if a character is a duplicate.

Examples:
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))((" 

Problem Notes:
Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!

Origin:
6 Kyu, CodeWars.

Notes:
Can still be refactor to simplify logic. Check the other cleaner solution!

Time to Solve:
~4 hours. 2/6/20
*/

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
