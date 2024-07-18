import java.util.Objects;

public class Author {

    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String toString() {
        return "Author full name = [" + this.getFullName() + "]";
    }

    public boolean isEquals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else if (this == obj) {
            return true;
        } else {
            Author other = (Author) obj;
            return firstName.equals(other.firstName) && lastName.equals(other.lastName);
        }
    }

    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
