package Lab_3;

public class TestAuthor {

    public static void main(String[] args) {
        Author author = new Author("Tom", "tom@gmail.com", 'M');

        System.out.println(author);
        author.setEmail("ru@gmail.com");
        //System.out.println(author.getEmail());
        System.out.println(author);
    }
}
