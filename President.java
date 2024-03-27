package singleton;

public class President {
    private static President president;///variabila statica privata de instanta
    private String nume;
    private President(String name){this.nume=name;}
    public static President getPresident(String nume)
    {
        if(president==null)
            president=new President(nume);
        return president;
    }
    public String getPresidentName()
    {
        return nume;
    }
}
