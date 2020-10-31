                                                                    //8 kyu
//*-----------------------------------------------------------------------------------------------------*//

    /*  Kata Square(n) Sum

        Description:
        Complete the square sum function so that it squares each number passed into it and then sums the results together.
        For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9. 
    */
public class Kata{

    public static int squareSum(int[] n){ 
        if(n.length == 0)
            return 0;
        int result = 0;
        for(int i=0; i<n.length; i++){
            result += n[i]*n[i];
        }
        return result;
    }
}

//*-----------------------------------------------------------------------------------------------------*//
                                                                    //7 kyu
//*-----------------------------------------------------------------------------------------------------*//

    /*  Kata Shortest Word

        Description:
        Simple, given a string of words, return the length of the shortest word(s).
        String will never be empty and you do not need to account for different data types. 
    */

public class Kata{
    public static int findShort(String s) {
        String StringArray[] = s.split(" ");
        int small = s.length();
        if(StringArray.length == 1){
            return StringArray[0].length();
        }

        for(int i = 0; i<StringArray.length; i++){
            if(StringArray[i].length() < small){
                small = StringArray[i].length();
            }
        }

        return small;
    }
}

//*-----------------------------------------------------------------------------------------------------*//

//*-----------------------------------------------------------------------------------------------------*//

	/* 	Kata Sum of the first nth term of Series
	
		Description:
		Your task is to write a function which returns the sum of following series upto nth term(parameter).
		Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +... 
	*/

public class NthSeries {
    public static String seriesSum(int n) {
        double sum = 1;
        double den = 1;
        for(double i = 1; i <= n; i++){
            sum += 1/(den+3);
            den +=3;
        }
        return String.valueOf(sum);
    }
}

//*-----------------------------------------------------------------------------------------------------*//

//*-----------------------------------------------------------------------------------------------------*//

    /*  Kata Mumbling
    
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

//*-----------------------------------------------------------------------------------------------------*//

//*-----------------------------------------------------------------------------------------------------*//

    /*  Kata Vowel Count

        Description:
        Return the number (count) of vowels in the given string.

        We will consider a, e, i, o, u as vowels for this Kata (but not y).

        The input string will only consist of lower case letters and/or spaces. 
    */

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        char charArray[] = str.toCharArray();
        for(char temp: charArray){
            if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u')
            vowelsCount++;
        }
        return vowelsCount;
    }
  
}

//*-----------------------------------------------------------------------------------------------------*//

//*-----------------------------------------------------------------------------------------------------*//

    /*  Kata You're a square!
    
        Description:
        A square of squares
        You like building blocks. You especially like building blocks that are squares. And what you even like more, is to arrange them into a square of square building blocks!

        However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! Those blasted things! If you just had a way to know, whether you're currently working in vain… Wait! That's it! You just have to check if your number of building blocks is a perfect square.

        Task
        Given an integral number, determine if it's a square number:

        In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.

        The tests will always use some integral number, so don't worry about that in dynamic typed languages.

        Examples
        -1  =>  false
        0  =>  true
        3  =>  false
        4  =>  true
        25  =>  true
        26  =>  false 
    */

public class Square {    
    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0 ? true : false;
    }
}

//*-----------------------------------------------------------------------------------------------------*//
                                                                    //6 kyu
//*-----------------------------------------------------------------------------------------------------*//

    /*  Kata Your order, please
    
        Description:
        Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

        Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

        If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

        Examples
        "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
        "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
        ""  -->  "" 
    */

public class Order {
    public static String order(String words) {
        String orderedString = new String();
        String orderedArray[] = new String[10];                                          //Dimension 10 for a reason
      
        if(words.isBlank()){                                                             //Condition if string is Blank
            return "";
        }
  
        String splittedWords[] = words.split(" ");                                       //Splitting the words in an array of string
  
        for(int i=0; i<splittedWords.length; i++){                                       //Loop in the array
            for(int j=0; j<splittedWords[i].length(); j++){                              //Loop between the char of the string

                if (Character.isDigit(splittedWords[i].charAt(j))) {                     //When the char is a digit put the all string in another array with same index as the digit
                    orderedArray[splittedWords[i].charAt(j)-'0'] = splittedWords[i];
                    break;
                }
                      
            }
        }

        for(int i=1; i<=splittedWords.length; i++){                                      //String concatenation to make the ordered string requested
             orderedString += orderedArray[i] +' ';
        }
          
        orderedString = orderedString.trim();                                           
        return orderedString;

    }
}

//*-----------------------------------------------------------------------------------------------------*//

//*-----------------------------------------------------------------------------------------------------*//

    /*  Kata Find the unique number

        Description:
        There is an array with some numbers. All numbers are equal except for one. Try to find it!

        Examples:
        Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
        Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55 
    */
    
public class Kata{
    public static double findUniq(double arr[]) {
        double first = arr[0];
        double second = arr[1];
        double third = arr[2];
        double common = 0;

        if(first==second){              
            if(first==third){               //first 3 number identical
                common = first;
            }else{
                return third;               //3 not equal
            }

        }else{
            if(first == third){             //if 2 not equal
                return second;              
            }else{
                return first;               //1 not equal
            }
        }
        for(int i = 3; i<arr.length; i++){
            if(common != arr[i]){
                return arr[i];
            }
        }

        return arr[0];
    }
}

//*-----------------------------------------------------------------------------------------------------*//

//*-----------------------------------------------------------------------------------------------------*//

    /*  Kata Create Phone Number

        Description:
        Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

        Example:
        Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890" 
    */

public class Kata{

    public static String createPhoneNumber(int[] numbers) {
        /*   3 easy way to do it:
        * 1) Using a StringBuilder and append every char one after the other.
        * 2) Same as before but instead of having all in one line use some for loop to make the code look prettier
        * 3) just return a concatenation of the string
        * Just change the value of to get inside a switch (I choose to have the default case to be the return solution)
        * (It seems that the path 2 is the faster of the three)
        * Try find other ways to do this same code ;)
        */
        int path = 0; //Choose first or second option, every other number will be redirect to third ways
        StringBuilder phoneNumber = new StringBuilder();

        switch (path){
            case 1:
                phoneNumber.append("(").append(numbers[0]).append(numbers[1]).append(numbers[2]).append(")").append(" ").append(numbers[3]).append(numbers[4]).append(numbers[5]).append("-").append(numbers[6]).append(numbers[7]).append(numbers[8]).append(numbers[9]);
                return phoneNumber.toString();              //the kata requires a string

            case 2:
                phoneNumber.append("(");
                for(int i = 0; i<3; i++){
                    phoneNumber.append(numbers[i]);
                }

                phoneNumber.append(")");
                phoneNumber.append(" ");

                for(int i = 3; i<6; i++){
                    phoneNumber.append(numbers[i]);
                }

                phoneNumber.append("-");
                
                for(int i = 6; i<10; i++){
                    phoneNumber.append(numbers[i]);
                }
                return phoneNumber.toString();              //the kata requires a string

            default:
                return "("+numbers[0]+ "" + numbers[1] + "" + numbers[2] +")" + " " + numbers[3]+ "" + numbers[4] + "" + numbers[5] + "-" + numbers[6] + "" + numbers[7]+ "" + numbers[8] + "" + numbers[9];

        }
    }

}

//*-----------------------------------------------------------------------------------------------------*//
                                                                    //5 kyu
//*-----------------------------------------------------------------------------------------------------*//

    /*  Kata Perimeter of squares in rectangle 5 kyu
    
        Description:
        The drawing (https://i.imgur.com/EYcuB1wm.jpg) shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. It's easy to see that the sum of the perimeters of these squares is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80

        Could you give the sum of the perimeters of all the squares in a rectangle when there are n + 1 squares disposed in the same manner as in the drawing:

        alternative text

        #Hint: See Fibonacci sequence #Ref: http://oeis.org/A000045

        The function perimeter has for parameter n where n + 1 is the number of squares (they are numbered from 0 to n) and returns the total perimeter of all the squares.

        perimeter(5)  should return 80
        perimeter(7)  should return 216
    */

import java.math.BigInteger;

class SumFct {
	public BigInteger perimeter(BigInteger n) {
        BigInteger fb[] = new BigInteger[n.intValue()+2];
        fb[1]=BigInteger.valueOf(1);
        fb[2]=BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(2);

        for(int i = 3; i < fb.length; i++){
            fb[i] = fb[i-1].add(fb[i-2]);
            sum = sum.add(fb[i]);
        }
        
        return sum.multiply(BigInteger.valueOf(4));
    }
}