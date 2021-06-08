
public class FirstUniqueCharacterStringLine {

    public int firstUniqChar(String s) {

        int index = -1;

        char countSymb[] = new char[26];

        for (int i = 0; i < s.length(); i++){
            countSymb[s.charAt(i)-97]++;
        }

        for (int i = 0; i < s.length(); i++){
            if (countSymb[s.charAt(i)] == 1){
                index = i;
                break;
            }
        }
        return index;
    }
}
