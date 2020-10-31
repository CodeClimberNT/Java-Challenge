/*  Kata Vowel Count 7 kyu
    Description:
    Return the number (count) of vowels in the given string.

    We will consider a, e, i, o, u as vowels for this Kata (but not y).

    The input string will only consist of lower case letters and/or spaces. */
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