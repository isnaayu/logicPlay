import java.util.Locale;

public class Polindrom {
    public static void main(String[] args) {
        Polindrom polindrom = new Polindrom();
        boolean result = polindrom.isPolindrom("katak");
        System.out.println(result);
        boolean result2 = polindrom.isPolindromMultipleWords("kasur ini rusak");
        System.out.println(result2);
    }
    boolean isPolindrom(String word){
        int left =0;
        int right = word.length()-1;
        while (left < right){
            if (word.charAt(left) != word.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    boolean isPolindromMultipleWords(String words){
        String word = words.replaceAll("\\s", "").toLowerCase();
        int left = 0;
        int right = word.length() - 1;
        while (left < right){
            if (word.charAt(left) != word.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
