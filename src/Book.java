import java.util.Objects;

public class Book {

    private String title;
    private Author author;
    private int publishDate;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publishDate = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author.getFullName();
    }

    public int getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public String toString() {
        return "Book title = [" + title + "], author = [" + author.getFullName() + "], publishDate = [" + publishDate + "]";
    }

    public boolean isEquals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else if (this == obj) {
            return true;
        } else {
            Book other = (Book) obj;
            return title.equals(other.title) && author.equals(other.author) && publishDate == other.publishDate;
        }
    }

    public int hashCode() {
        return Objects.hash(title, author, publishDate);
    }
}
