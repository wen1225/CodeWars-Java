public class SquareDigit {

  public int squareDigits(int n) {
      String nInString = Integer.toString(n);
      String nFinalInString = "";
      int nFinalInInt = 0;
      for (int i = 0; i < nInString.length(); i++)
      {
          int nInInt = 0;
          //access individual char in nInString by converting
          //it to char.
          char nInChar = nInString.charAt(i);
          //convert the char into int, square and store answer in nInInt
          nInInt = Character.getNumericValue(nInChar) * Character.getNumericValue(nInChar);
          //concatenate converted nInInt like a string
          nFinalInString = nFinalInString + Integer.toString(nInInt);    
      }
      //convert nFinalInString to int as return variable
      nFinalInInt = Integer.parseInt(nFinalInString);
      return nFinalInInt;
      }
}
