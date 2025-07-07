import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        if (str == null || str.isEmpty()) {
            return ' ';
        }
        Map<Character,Integer> commonChar = new HashMap<>();
        for (char c : str.toCharArray()) {
            commonChar.put(c, commonChar.getOrDefault(c,0) + 1);
        }

        char mostChar = ' ';
        int maxCount = 0;
        for(Map.Entry<Character, Integer> entry : commonChar.entrySet()){
            char currentChar = entry.getKey();
            int currentCount = entry.getValue();

            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostChar = currentChar;
            }
        }
        return mostChar;
    }
}
