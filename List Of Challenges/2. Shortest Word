//If you wanna download this file remember to rename the file as the class name

public class Kata{

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
}
