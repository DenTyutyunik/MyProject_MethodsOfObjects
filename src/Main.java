public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        // Create authors
        Author author1 = new Author("Стивен", "Кинг");
        Author author2 = new Author("Джордж", "Мартин");
        // Create books
        Book book1 = new Book("Властелин колец", author1, 1954);
        Book book2 = new Book("Игра престолов", author2, 1996);
        // Data readout
        System.out.printf("Book 1. Author: %s, Book: %s, Publish Date: %s year\n", book1.getAuthor(), book1.getTitle(), book1.getPublishDate());
        System.out.printf("Book 2. Author: %s, Book: %s, Publish Date: %s year\n", book2.getAuthor(), book2.getTitle(), book2.getPublishDate());
        // Change data
        System.out.println("Book 1. Publish date was changed");
        book1.setPublishDate(1991);
        // Date readout
        System.out.printf("Book 1. Author: %s, Book: %s, Publish Date: %s year\n", book1.getAuthor(), book1.getTitle(), book1.getPublishDate());
        System.out.printf("Book 2. Author: %s, Book: %s, Publish Date: %s year\n", book2.getAuthor(), book2.getTitle(), book2.getPublishDate());
        // Author's equals
        System.out.println();
        System.out.printf("Equals between Author 1 and Author 1: %s\n", author1.isEquals(author1));
        System.out.printf("Equals between Author 1 and Author 2: %s\n", author1.isEquals(author2));
        System.out.printf("Equals between Author 2 and Author 1: %s\n", author2.isEquals(author1));
        System.out.printf("Equals between Author 2 and Author 2: %s\n", author2.isEquals(author2));
        // Author's hashcode
        System.out.println();
        System.out.printf("Hashcode of Author 1: %s\n", author1.hashCode());
        System.out.printf("Hashcode of Author 2: %s\n", author2.hashCode());
        // Author's ToString
        System.out.println();
        System.out.printf("ToString of Author 1: %s\n", author1);
        System.out.printf("ToString of Author 2: %s\n", author2);
        // Book's equals
        System.out.println();
        System.out.printf("Equals between Book 1 and Book 1: %s\n", book1.isEquals(book1));
        System.out.printf("Equals between Book 1 and Book 2: %s\n", book1.isEquals(book2));
        System.out.printf("Equals between Book 2 and Book 1: %s\n", book2.isEquals(book1));
        System.out.printf("Equals between Book 2 and Book 2: %s\n", book2.isEquals(book2));
        // Book's hashcode
        System.out.println();
        System.out.printf("Hashcode of Book 1: %s\n", book1.hashCode());
        System.out.printf("Hashcode of Book 2: %s\n", book2.hashCode());
        // Book's ToString
        System.out.println();
        System.out.printf("ToString of Book 1: %s\n", book1);
        System.out.printf("ToString of Book 2: %s\n", book2);
        // Check equals with mistake
        System.out.printf("Check between Author 1 and Book 1: %s\n", author1.isEquals(book1));
        System.out.printf("Check between Author 1 and null: %s\n", author1.isEquals(null));
        System.out.printf("Check between Book 1 and Author 1: %s\n", book1.isEquals(author1));
        System.out.printf("Check between Book 1 and null: %s\n", book1.isEquals(null));
        System.out.printf("Check between Book 1 and Book 1: %s\n", book1.isEquals(book1));
        System.out.printf("Check between Author 1 and Author 1: %s\n", author1.isEquals(author1));
    }
}
