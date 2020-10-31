//If you wanna download this file remember to rename the file as the class name

    /*  Kata Create Phone Number 6 kyu

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