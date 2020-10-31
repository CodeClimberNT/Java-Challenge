//If you wanna download this file remember to rename the file as the class name

/*  Kata Your order, please 6 kyu
    
    Description:
    Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

    Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

    If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

    Examples
    "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
    "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
    ""  -->  "" */

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