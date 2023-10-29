package Lab_4_new;
class Book1 {
    private String author;      // Автор книги
    private String title;       // Название книги
    private int year;           // Год написания книги


    // Конструктор для создания объекта книги
    public Book1(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    // Метод для получения автора книги
    public String getAuthor() {
        return author;
    }

    // Метод для изменения автора книги
    public void setAuthor(String author) {
        this.author = author;
    }

    // Метод для получения названия книги
    public String getTitle() {
        return title;
    }

    // Метод для изменения названия книги
    public void setTitle(String title) {
        this.title = title;
    }

    // Метод для получения года написания книги
    public int getYear() {
        return year;
    }

    // Метод для изменения года написания книги
    public void setYear(int year) {
        this.year = year;
    }
}
