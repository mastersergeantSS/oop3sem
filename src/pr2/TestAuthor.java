package oop.pr2;

public class TestAuthor
{
    public static void main(String[] args)
    {
        Author a = new Author("Michael", "AuMic@gmail.com", 'M');

        System.out.println(a.getEmail());
        a.setEmail("AuMic@mail.com");

        System.out.println(a);

    }
}
