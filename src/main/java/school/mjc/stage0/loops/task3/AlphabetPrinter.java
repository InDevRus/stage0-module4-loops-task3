package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        var startLetter = 'a';
        var lastLetter = 'z';

        for (var letter = startLetter; letter <= lastLetter; letter++) {
            System.out.println(letter);
        }
    }
}
