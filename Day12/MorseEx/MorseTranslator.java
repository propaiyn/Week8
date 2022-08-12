package MorseEx;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MorseTranslator {
    private final static HashMap<String, String> map = new HashMap<String, String>();
    
    public MorseTranslator(){
        
            map.put(".-", "A");
            map.put("-...", "B");
            map.put("-.-.", "C");
            map.put("-..", "D");
            map.put(".", "E");
            map.put("..-.", "F");
            map.put("--.", "G");
            map.put("....", "H");
            map.put("..", "I");
            map.put(".---", "J");
            map.put("-.-", "K");
            map.put(".-..", "L");
            map.put("--", "M");
            map.put("-.", "N");
            map.put("---", "O");
            map.put(".--.", "P");
            map.put("--.-", "Q");
            map.put(".-.", "R");
            map.put("...", "S");
            map.put("-", "T");
            map.put("..-", "U");
            map.put("...-", "V");
            map.put(".--", "W");
            map.put("-..-", "X");
            map.put("-.--", "Y");
            map.put("--..", "Z");
        }
    



    String translate(String decodeMe){
        return Arrays.stream(decodeMe.split(" "))
        .map(n -> this.map.get(n))
        .collect(Collectors.joining(""));
    }
}