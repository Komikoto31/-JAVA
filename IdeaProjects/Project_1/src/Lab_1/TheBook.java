package Lab_1;


public class TheBook {
    public static void main(String[] arg){
        Book g1 = new Book("War and Peace",1300);
        Book g2 = new Book("Dead Souls");g2.setPage(480);

        System.out.println(g1);
        System.out.println(g2);
    }
}
