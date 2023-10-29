package Lab_4_new;
public class BookTest1 {
    public static void main(String[] args) {
        // Создаем объект книги
        Book1 book = new Book1("Александр Пушкин", "Евгений Онегин", 1833);

        // Выводим информацию о книге
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год написания: " + book.getYear());

        // Изменяем название книги
        book.setTitle("Мастер и Маргарита");

        // Выводим обновленную информацию о книге
        System.out.println("\nОбновленная информация о книге:");
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год написания: " + book.getYear());
    }
}
