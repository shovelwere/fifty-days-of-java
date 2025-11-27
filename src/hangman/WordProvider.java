package hangman;

import java.util.concurrent.ThreadLocalRandom;

public class WordProvider {
        private String[] words = {
                "pill", "term", "element", "psychiatrist", "flavor", "weather", "sorry", "gold",
                "tray", "pin", "talk", "transition", "spotlight", "treat", "result", "baseball",
                "pasta", "gambling", "specific", "page", "hurry", "beach", "e-mail", "hold",
                "encounter", "continuing", "offering", "expand", "blood", "darkness"
        };

        public String getRandomWord(){
            return words[ThreadLocalRandom.current().nextInt(words.length)];
        }
}
