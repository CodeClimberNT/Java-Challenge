public class Kata{
    
    /*  Kata Square(n) Sum 8 kyu

        Description:
        Complete the square sum function so that it squares each number passed into it and then sums the results together.
        For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9. */
    public static int squareSum(int[] n){ 
        if(n.length == 0)
            return 0;
        int result = 0;
        for(int i=0; i<n.length; i++){
            result += n[i]*n[i];
        }
        return result;
    }

    /*  Kata Shortest Word 7 kyu

        Description:
        Simple, given a string of words, return the length of the shortest word(s).
        String will never be empty and you do not need to account for different data types. */
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

    /*  Kata Find the unique number 6 kyu

        Description:
        There is an array with some numbers. All numbers are equal except for one. Try to find it!

        Examples:
        Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
        Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55 */
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

    /*  Kata Create Phone Number 6 kyu

        Description:
        Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

        Example:
        Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890" */
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