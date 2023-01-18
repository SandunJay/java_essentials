package beginner_syntaxes_basics.text_processing;

public class ReserveString {

    public static void main(String[] args) {
//        countWords("I love Java");
        reverseString("stop");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Count words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text) {
        String[] words = text.split(" ");
        int numOfWords = words.length;
        String message = String.format("Your text contains %d words", numOfWords);
        System.out.println(message);

        for (int i=0; i<3; i++){
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a String in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text){
        for (int i=text.length()-1; i>=0;i--){
            System.out.print(text.charAt(i));
        }
    }

}