package Lab_12;
import java.util.ArrayDeque;
import java.util.Queue;

public class Game_Queue {
    private final Queue<Integer> firstPlayer;
    private final Queue<Integer> secondPlayer;

    public Game_Queue(String firstPlayer, String secondPlayer) {
        this.firstPlayer = new ArrayDeque<>();
        this.secondPlayer = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            this.firstPlayer.add(Integer.parseInt(firstPlayer.substring(i, i + 1)));
            this.secondPlayer.add(Integer.parseInt(secondPlayer.substring(i, i + 1)));
        }
    }

    public String play() {
        int count = 0;
        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty() && count < 106) {
            if (firstPlayer.peek() > secondPlayer.peek() && secondPlayer.peek() != 0) {
                firstPlayer.add(firstPlayer.remove());
                firstPlayer.add(secondPlayer.remove());

            } else {
                secondPlayer.add(firstPlayer.remove());
                secondPlayer.add(secondPlayer.remove());
            }
            count++;
        }
        String res = "";
        if (firstPlayer.isEmpty()) res += "second ";
        else if (secondPlayer.isEmpty()) res += "first ";
        res += count;
        if (count >= 106) res += " botva";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Game_Queue("13579", "24680").play());

    }

}