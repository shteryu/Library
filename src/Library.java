import java.util.ArrayList;

public class Library{
    private ArrayList<Books> library;
    private String name;

    public Library(String name, ArrayList<Books> library) {
        this.library = library;
        this.name = name;
    }

    public ArrayList<Books> getLibrary() {
        return library;
    }

    public String getName() {
        return name;
    }

    public void getPopularAuthor(Library library){

        

    }

    @Override
    public String toString() {
        return "Library [name=" + name + ", library=" + library + "]\n";
    }

    
}