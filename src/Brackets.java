import java.util.*;

public class Brackets {

    public boolean checkBrackets(String stringWithBrackets){

        Map<Character, Character> bracketsType = new TreeMap<>();
        bracketsType.put(')', '(');
        bracketsType.put('}', '{');
        bracketsType.put(']', '[');

        ArrayDeque<Character> array =  new ArrayDeque<>();

        for (char symbol : stringWithBrackets.toCharArray()){
            if (bracketsType.containsKey(symbol)){
                if (array.isEmpty()){
                    return false;
                }
                else if (array.getLast() == bracketsType.get(symbol)){
                    array.removeLast();
                }
                else {
                    return false;
                }
            }

            else {
                array.add(symbol);
            }
        }

        return !(array.isEmpty());
    }
}
