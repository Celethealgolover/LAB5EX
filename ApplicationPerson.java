package immutable;

public class ApplicationPerson {
    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson("John", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
