import java.util.ArrayList;

public class Library{
    private ArrayList<Books> librarys;
    private String name;

    public Library(String name, ArrayList<Books> librarys) {
        this.librarys = librarys;
        this.name = name;
    }

    public ArrayList<Books> getLibrary() {
        return librarys;
    }

    public String getName() {
        return name;
    }

    public void getPopularAuthor(Library librarys){

        

    }

    @Override
    public String toString() {
        return "Library [name=" + name + ", library=" + librarys + "]\n";
    }

    
}