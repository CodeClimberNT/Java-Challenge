//If you wanna download this file remember to rename the file as the class name

    /*  Kata Mumbling 7 kyu
    
        Examples:
        
        accum("abcd") -> "A-Bb-Ccc-Dddd"
        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
        accum("cwAt") -> "C-Ww-Aaa-Tttt"
    */

public class Accumul {
  public static String accum(String s) {

      char charArray[] = s.toLowerCase().toCharArray();               //array of char of the lowercase input String
      StringBuilder modifiedString = new StringBuilder();             //inizialized 2 StringBuilder for later
      StringBuilder charConcatenation = new StringBuilder(); ;
      
      /* 
          This is the core logic of everything:
          Wanted to make a single for loop in this program, to do so made an inverse for starting from the last position
          of the char array coming to the first one (index 0) to make this possible I used the "insert" method and 
          inserting in every cicle in the index 0 of a Custom String (The string builder modifiedString), then 
          I had to make the String sequence requested from the exercise (the number of lowecase was their position
          of the original array index), so i made a char concatenation insiede another Stringbuild 
          (the charConcatenation "duh") and here I used a logic as confusing as effective: using the Character.toString
          method to transform a char into a String and appending that in the charConcatenation variable, then appended 
          the char trasformed to string but this time repeated "i" times (the position of the index). This was usend 
          in both the logic of the ternary operator, the difference was that I tracked the value of "i" and when it 
          was not equal to 0 I also added an "-" at the start of the appending, when the counter reached 0 means that 
          the for was finished and no more "-" was needed. Another method could also be to not use the ternary operator
          and at the end return "modifiedString.toString().substring(1)" (this will cut the not wanted value).
          I preferred using a more compact form, for the return, but it works in both ways, of course
      */

      for(int i=charArray.length-1; i >= 0; i--){
          modifiedString.insert(0, i != 0
          ? (charConcatenation.append("-").append( Character.toUpperCase(charArray[i]) ).append( Character.toString(charArray[i]).repeat(i) ))
          : (charConcatenation.append( Character.toUpperCase(charArray[i]) ).append( Character.toString(charArray[i]).repeat(i) )) );

          charConcatenation.setLength(0);
      }

      return modifiedString.toString();
  }
}