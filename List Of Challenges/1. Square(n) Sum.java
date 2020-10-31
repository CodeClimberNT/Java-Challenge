//If you wanna download this file remember to rename the file as the class name

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
}
