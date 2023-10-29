package Lab_12;
import java.util.LinkedList;

public class Game_DoubleList {
    private LinkedList<Integer> fp;
    private LinkedList<Integer> sp;

    public Game_DoubleList(String fp, String sp) {
        this.fp = new LinkedList<>();
        this.sp = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            this.fp.add(Integer.parseInt(fp.substring(i, i + 1)));
            this.sp.add(Integer.parseInt(sp.substring(i, i + 1)));
        }
    }

    public String play() {
        int count = 0;
        while (!fp.isEmpty() && !sp.isEmpty() && count <= 106) {
            if (fp.peek() > sp.peek() && sp.peek() != 0) {
                fp.add(fp.remove());
                fp.add(sp.remove());

            } else {
                sp.add(fp.remove());
                sp.add(sp.remove());
            }
            count++;
        }
        String res = "";
        if (fp.isEmpty()) res += "second ";
        else res += "first ";
        res += count;
        if (count >= 106) res += " botva";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Game_DoubleList("13579", "24680").play());
    }

}