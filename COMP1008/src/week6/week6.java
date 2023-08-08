import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class week6 {
    static void regex() {
        /*
        Text:
        Cats and dogs are good companions
         |: one of these options
            regex: 'cat|dog|mouse'
         .: matches any character
         +: at least once for a single char
         ?: at most once for a single char
         *: zero or more times for a single char
         'g.?t'
            geet
            get
            got
            gt
         'g.+t'
            got
            get
            geeeaaaooooooot
         'g.*t'
            gt
            got
            get
            geeeaaaooooooot

         positional characters
         ^: at the start of the string
            '^hello'
         $: at the end of the string
            'world$'

         shortcut characters

           \d   a digit: 0-9
           \D   non-digit
           \w   a word: a-z, 0-9
           \W   non-word
           \s   whitespace
           \S   non-whitespace

         repetition
           {exactly}
           {min,}
           {,max}
           {min,max}
                'g.{1,3}p'
                gap
                gaaaaaaap
                gop
                gip
                gooop
                goooop => invalid

         []
            one of these options
            'g.+t'
                match any vowel
                    git
                    get
                    got
                    gooot
                    gut
         */
    }
    public static void main(String[] args) {
        example4();
    }
    static void example1() {
        // Pattern: regular expression goes here
        // Matcher: execute the regex on a text
        Pattern pattern;
        Matcher matcher;
        String text = "We all love working in java and ";
        String regex = "[aeiou]";
        pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(text);
        boolean result = matcher.find();
        String hit1 = matcher.group();

        System.out.println(hit1);
        System.out.println("position is " + text.indexOf(hit1));
    }
    static void example2() {
        Pattern pattern;
        Matcher matcher;
        String text = "We all love working in java and ";
        String regex = "[aeiou]";
        pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(text);
        while(matcher.find()) {
            String hit = matcher.group();
            System.out.println(hit);
        }
    }
    static void example3() {
        String text = "My number is 705-243-1980. Call me any time";
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            String textFound = matcher.group();
            System.out.printf("Digit '%s' was found at the index '%d'\n", textFound, text.indexOf(textFound));
        }
    }
    static void example4() {
        String text = "I love pizza and wings";
        String replace1 = text.replace("pizza", "water");
        String replace2 = text.replaceAll("[i]", "pasta");
        System.out.println(replace1);
        System.out.println(replace2);
    }
}
