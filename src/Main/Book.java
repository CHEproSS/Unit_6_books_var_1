package Main;

public abstract class Book implements IPublication {
    private String name;
    private String author;
    private int yearOfPublication;

    public Book(String name,String author, int yearOfPublication){
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getAuthor(){
        return author;
    }

    @Override
    public int getYearOfPublication(){
        return yearOfPublication;
    }

    public abstract String getInfo();
}
