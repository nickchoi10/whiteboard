import java.util.HashMap;
import java.util.Map;

public class secondHighestRepeatedCharacter {

    public static void main (String[] args) {
        Character[] charr = {'a', 'a', 'b', 'b', 'b', 'c', 'a', 'a','c','c','c','c','a','a'};
        System.out.println(secondHighestRepeatedCharacter.secondMostRepeatedNumber(charr));
    }

    public static Character secondMostRepeatedNumber(Character[] charr) {

        Map<Character, Integer> hash = new HashMap<>();
        for (Character c : charr) {
            if (!hash.containsKey(c)) {
                hash.put(c, 1);
            } else {
                hash.put(c, hash.get(c) + 1);
            }
        }


        Character result=' ';
        Integer countHighestRepeated = 0;
        Integer countSecondHighestRepeated = 0;
        for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
            if (entry.getValue() > countHighestRepeated) {
                countHighestRepeated = entry.getValue();
            }
            if (entry.getValue() < countHighestRepeated && entry.getValue() > countSecondHighestRepeated) {
                countSecondHighestRepeated = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }



}
