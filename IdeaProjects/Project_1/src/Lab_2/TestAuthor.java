package Lab_2;

import Lab_2.Author;

public class TestAuthor {

    public static void main(String[] args) {
        Author author = new Author("Tom", "tom@gmail.com", 'M');

        System.out.println(author);
        author.setEmail("ru@gmail.com");
        //System.out.println(author.getEmail());
        System.out.println(author);
    }
}
