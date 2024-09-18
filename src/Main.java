

import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Java Programming", 400, "John Doe", 2022);
        Books book2 = new Books("Effective Java", 300, "Joshua Bloch", 2021);
        Books book3 = new Books("Clean Code", 250, "Robert C. Martin", 2020);
        Books book4 = new Books("Head First Java", 600, "Kathy Sierra", 2019);
        Books book5 = new Books("Design Patterns", 450, "Erich Gamma", 2018);

        TreeSet<Books> books = new TreeSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        System.out.println("Book sorted by Book Name\n" );

        for (Books book : books){

            System.out.println(book +"\n");
        }
    TreeSet<Books> booksByPageNumber = new TreeSet<>(new PageNumberComparator());

        booksByPageNumber.addAll(books);

        System.out.println("Books sorted by page number\n");

        for (Books book : booksByPageNumber){
            System.out.println(book + "\n");

        }




    }
}