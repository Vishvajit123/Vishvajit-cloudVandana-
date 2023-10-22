public class PangramChecker {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkPangram(sentence);
        System.out.println("Is the sentence a pangram? " + isPangram);
    }

    public static boolean checkPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        int count = 0;
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            if ('A' <= ch && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
            }
            
            if ('a' <= ch && ch <= 'z') {
                int index = ch - 'a';
                
                if (!alphabet[index]) {
                    alphabet[index] = true;
                    count++;
                }
            }
            if (count == 26) {
                return true;
            }
        }
        return false;
    }
}
