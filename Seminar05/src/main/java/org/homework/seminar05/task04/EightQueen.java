package org.homework.seminar05.task04;

import java.util.Random;

/**
 * 4. На шахматной доске расставить eight ферзей так, чтобы они не били друг друга.
 */
public class EightQueen {


    private static final int eight = 8;
    private QueenPlace[] queens = new QueenPlace[eight];

    public EightQueen() {
        init();
    }

    public boolean Execute(int maxIterate) {
        var rnd = new Random();

        for (int i = 0; i < maxIterate; i++) {
            var q1 = rnd.nextInt(eight);
            var q2 = rnd.nextInt(eight);

            var tmp = queens[q1].x;
            queens[q1].x = queens[q2].x;
            queens[q2].x = tmp;

            if (isOk())
                return true;
        }

        return false;
    }


    private void init() {
        for (int i = 0; i < eight; i++) {
            queens[i] = new QueenPlace(i, i);
        }
    }

    private boolean isOk() {
        for (int i = 0; i < eight - 1; i++) {
            for (int j = i + 1; j < eight; j++) {
                if (Math.abs(queens[i].x - queens[j].x) == Math.abs(queens[i].y - queens[j].y)) {
                    return false;
                }
            }
        }
        return true;
    }


    @Override
    public String toString() {
        var sb = new StringBuilder();

        for (int x = 0; x < eight; x++) {
            for (int y = 0; y < eight; y++) {
                var queenExists = false;

                for (var q : queens) {
                    if (q.x == x && q.y == y) {
                        sb.append("* ");
                        queenExists = true;
                        break;
                    }
                }

                if (!queenExists)
                    sb.append(". ");
            }
            sb.append('\n');
        }

        return sb.toString();
    }
}
