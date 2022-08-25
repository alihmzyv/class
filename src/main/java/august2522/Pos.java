package august2522;

import java.util.Objects;

public class Pos implements Comparable<Pos> {
    final char x;
    final int y;

    // Pos p = new Pos('c', 5);
    public Pos(char x, int y) {
        this.x = x;
        this.y = y;
    }

    // Pos p = Pos.of('c', 5);
    public static Pos of(char x, int y) {
        return new Pos(x, y);
    }

    // Pos p = Pos.of("c5");
    public static Pos of(String s) {
        return Pos.of(s.charAt(0), s.charAt(1) - '0');
    }

    public boolean isOnBoard() {
        return x >= 'a' && x <= 'h' && y >= 1 && y <= 8;
    }

    @Override
    public String toString() {
        return String.format("%s%d", x, y);
    }

    // Pos e6 = e5.move(0, 1);
    public Pos move(int dx, int dy) {
        return Pos.of((char) (x + dx), y + dy);
    }

    public static void main(String[] args) {
        Pos e5 = Pos.of("e5");
        Pos e6 = e5.move(0, 1);
        Pos e6a = e5.move(0, 10);
        System.out.println(e5.isOnBoard());  // true
        System.out.println(e6.isOnBoard());  // true
        System.out.println(e6a.isOnBoard()); // false
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pos pos = (Pos) o;
        return x == pos.x && y == pos.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public int compareTo(Pos o) {
        int flag = this.x - o.x;
        if (flag == 0) {
            flag = this.y - o.y;
        }
        return flag;
    }
}

