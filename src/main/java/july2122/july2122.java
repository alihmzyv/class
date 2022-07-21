package july2122;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class july2122 {
    public static void main(String[] args) {
        Box box1 = new Box(11, 7, 4);
        Box box2 = new Box(10, 8, 10);

        System.out.println(box1.canBePutInto(box2));
    }
}
