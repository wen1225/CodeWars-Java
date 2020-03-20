public class Troll {
    public static String disemvowel(String str) { 
        String newStr = new String();
        for(int index = 0; index < str.length(); index++){
            switch(str.charAt(index)){
                case 'a':
                    continue;
                case 'A':
                     continue;
                case 'e':
                    continue;
                case 'E':
                    continue;
                case 'i':
                    continue;
                case 'I':
                    continue;
                case 'o':
                    continue;
                case 'O':
                     continue;
                case 'u':
                    continue;
                case 'U':
                     continue;
                default:
                    newStr += str.charAt(index);
                    break;
            }
        }
        return newStr;
    }
}
