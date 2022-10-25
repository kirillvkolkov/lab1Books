import java.util.Arrays;

public class Book {
    private String name;
    private Publisher publisher;
    private Integer publishYear;
    private String[] authors;

    public Book(String name, Publisher publisher, Integer publishYear) {
        this.name = name;
        this.publisher = publisher;
        this.publishYear = publishYear;
    }

    public Book(String name, Publisher publisher, Integer publishYear, String[] authors) {
        this.name = name;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.authors = authors;
    }

    public Book(String name, Publisher publisher, Integer publishYear, String author) {
        this.name = name;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.authors = new String[]{author};
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public String[] getAuthors() {
        return authors;
    }

    public Integer getAuthorsAmmount() {
        return authors.length;
    }

    // В случае некорректного индекса должно выбрасываться исключение; OK, оно обязательно выбросится автоматически :)
    public String getAuthorByIndex(Integer index) {
        return authors[index];
    }

    public void setPublishYear(Integer publishYear) {
        if (publishYear <= 0) {
            throw new IllegalArgumentException();
        } else {
            this.publishYear = publishYear;
        }
    }

    public void setAuthors(String[] authors) {
        for (int i = 0; i < authors.length; i++) {
            if (authors[i] == null) {
                throw new IllegalArgumentException();
            } else {
                this.authors = authors;
            }
        }
    }

    public static void print(Book book) {
        if (!(book.authors == null)){
            System.out.printf(book.toString() + "\n");
        } else {
            System.out.printf(book.toStringWithoutAuthors() + "\n");
        }
    }

    public static void printAll(Book[] booksCollection) {
        for (int i = 0; i < booksCollection.length; i++) {
            if (!(booksCollection[i].authors == null)){
                System.out.printf(booksCollection[i].toString() + "\n");
            } else {
                System.out.printf(booksCollection[i].toStringWithoutAuthors() + "\n");
            }
        }
    }

    @Override
    public String toString() {
        return "Название " + name +
                ", Издатель " + publisher.getName() +
                ", Год выхода " + publishYear +
                ", Авторы " + Arrays.toString(authors);
    }

    public String toStringWithoutAuthors() {
        return "Название " + name +
                ", Издатель " + publisher.getName() +
                ", Год выхода " + publishYear;
    }
}
