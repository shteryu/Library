import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       

        ArrayList<Books> books = new ArrayList<>();
        ArrayList<Books> books1 = new ArrayList<>();
        ArrayList<Library> libraries = new ArrayList<>();
        
        books.add(new Books("title_1", "author_1", "publisherNew", "960-425-059-0", 3));
        books.add(new Books("title_2", "author_1", "publisher", "960-425-059-1", 2));
        books.add(new Books("title_3", "author_3", "publisher_2", "960-425-059-3", 5));
        books.add(new Books("title_4", "author_1", "publisher_3", "960-425-059-5", 3));
        books.add(new Books("title_5", "author_2", "publisher_4", "960-425-059-7", 1));

        books1.add(new Books("title_6", "author_1", "publisher", "960-425-059-0", 1));
        books1.add(new Books("title_7", "author_1", "publisher", "960-425-059-1", 3));
        books1.add(new Books("title_8", "author_3", "publisher_2", "960-425-059-3", 4));
        books1.add(new Books("title_9", "author_1", "publisher_3", "960-425-059-5", 5));
        books1.add(new Books("title_10", "author_2", "publisher_4", "960-425-059-7", 3));


        libraries.add(new Library("test1", books));
        libraries.add(new Library("test2", books1));

        // System.out.println(libraries);
        
        System.out.println(libraries.get(0).getLibrary().get(0).getRating());

    }
}
