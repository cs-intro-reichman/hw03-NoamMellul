/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        // Replace the following statement with your code
        String res = "";
        for (int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
               if ('A' <= currentChar && currentChar <= 'Z'){
                   int valChar = currentChar + 32;
                   char newChar = (char) (valChar);
                   res = res + newChar;
               }
               else {
                   res = res + currentChar;
               }
        }
        return res;
    }
}
