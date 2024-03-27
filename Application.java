public class Application {
    public static void main(String[] args)
    {
        //EX1
        String ex1="b",ex2="h",ex3="z",ex4="Y",ex5="sF",ex6="abbacbbac",ex7="",ex8="acbbc",ex9="abcbbaaabbcbababac",ex10="abbacbba";
        System.out.println(ex1.matches("[abc]"));
        System.out.println(ex2.matches("[^abc]"));
        System.out.println(ex3.matches("[a-z]"));
        System.out.println(ex4.matches("[a-zA-Z]"));
        System.out.println(ex5.matches("[a-z][A-Z]"));
        System.out.println(ex6.matches("[abc]+"));;
        System.out.println(ex7.matches("[abc]*"));
        System.out.println(ex8.matches("[abc]{5}"));
        System.out.println(ex9.matches("[abc]{5,}"));
        System.out.println(ex10.matches("[abc]{5,10}"));
        //EX2
        String test="Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.",aux=test;
        //a
        System.out.println(test.length());
        //b
        test=test.replaceAll("[ ]","");
        test=test.replaceAll("[.]","");
        System.out.println(test.matches("[a-zA-Z]+"));
        //c
        String[] cuv=aux.split("[ ]");
        System.out.println(cuv[cuv.length/2-1]);
        //d
        StringBuilder s=new StringBuilder(aux);
        s=s.reverse();
        System.out.println(s);
    }
}
