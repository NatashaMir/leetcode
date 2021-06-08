
public class FirstUniqueCharacterString {

    public int firstUniqChar(String s) {

        int symbolNum = -1;

        if ((s == null) || (s.length() == 0)) {
            return -1;
        } else if (s.length() == 1) {
            return 0;
        }

        for (char symbol : s.toCharArray()) {
            if (s.indexOf(symbol) == s.lastIndexOf(symbol)) {
                symbolNum = s.lastIndexOf(symbol);
                break;
            }
        }

        return symbolNum;

    }
}
