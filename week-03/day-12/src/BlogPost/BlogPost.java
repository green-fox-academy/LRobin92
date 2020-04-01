package BlogPost;

public class BlogPost {
    //Create a BlogPost class that has
    //an authorName
    //a title
    //a text
    //a publicationDate
    public String authorName;
    public String title;
    public String text;
    public String publicationDate;
    public BlogPost(String authorName, String title, String text, String publicationDate){
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }
}
