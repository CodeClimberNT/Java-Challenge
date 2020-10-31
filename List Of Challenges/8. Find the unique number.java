//If you wanna download this file remember to rename the file as the class name

    /*  Kata Find the unique number 6 kyu

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