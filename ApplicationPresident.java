package singleton;

public class ApplicationPresident {
    public static void main(String[] args)
    {
        President pr=President.getPresident("Iohannis");
        System.out.println(pr.getPresidentName());
    }
}
