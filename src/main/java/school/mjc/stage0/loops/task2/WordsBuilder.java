package school.mjc.stage0.loops.task2;
import java.util.Arrays;

public class WordsBuilder {
    public void buildPhrase(char[] chars) {
        int lengthChars = chars.length;
        int counter = 0;
        while (counter < lengthChars) {
            System.out.print(chars[counter]);
            counter++;
        }
    }
}
