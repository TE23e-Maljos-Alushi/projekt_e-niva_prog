package ma;

public class Books extends Bibliotek{
    private String author ; 
    private String genre ; 
    private int pages;


    public Books(int id, String title, String isAvalible, String author, String genre, int pages){
    super(id, title, isAvalible);

    this.author = author;
    this.genre = genre;
    this.pages = pages;


    }


}
