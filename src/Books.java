public class Books{
    String title;
    String author;
    String publisher;
    String  ISBNNumber;
    int rating;
    
    public Books(String title, String author, String publisher, String iSBNNumber, int rating) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        ISBNNumber = iSBNNumber;
        this.rating = rating;
    }


    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public String getPublisher() {
        return publisher;
    }


    public String getISBNNumber() {
        return ISBNNumber;
    }


    public int getRating() {
        return rating;
    }


    public Books(){}

    @Override
    public String toString() {
        return "Books [title=" + title + ", author=" + author + ", publisher=" + publisher
                + ", ISBNNumber=" + ISBNNumber + ", rating=" + rating + "]\n";
    }

    

}
