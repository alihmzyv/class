package august2522;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SentenceDemo {
    public static List<String> allPossible(List<String> subjects, List<String> verbs, List<String> objects) {
        //take each subject and map each subject to subject + all verbs
        //take each subject + verb and map to subject + verb + all objects
        return subjects.stream()
                .flatMap(subject -> verbs.stream()
                        .map(verb -> subject + " " + verb))
                .flatMap(subjectVerb -> objects.stream().map(object -> subjectVerb + " " + object))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        allPossible(List.of("Noel", "The cat", "The dog"),
                List.of("wrote", "chased", "slept on"),
                List.of("the book","the ball","the bed"))
                .forEach(System.out::println);
    }
    /*
    |  Given:  |
------------
  List<String> subjects = list("Noel", "The cat", "The dog")
  List<String> verbs =    list("wrote", "chased", "slept on")
  List<String> objects =  list("the book","the ball","the bed")
  List<String> sentences = all_possible(subjects, verbs, objects)
------------
|  Goal:   |
------------
To build all possible combinations of this words:
Noel wrote the book
Noel wrote the ball
Noel wrote the bed
Noel chased the book
Noel chased the ball
Noel chased the bed
Noel slept on the book
Noel slept on the ball
Noel slept on the bed
The cat wrote the book
The cat wrote the ball
The cat wrote the bed
The cat chased the book
The cat chased the ball
The cat chased the bed
The cat slept on the book
The cat slept on the ball
The cat slept on the bed
The dog wrote the book
The dog wrote the ball
The dog wrote the bed
The dog chased the book
The dog chased the ball
The dog chased the bed
The dog slept on the book
The dog slept on the ball
The dog slept on the bed
     */
}
