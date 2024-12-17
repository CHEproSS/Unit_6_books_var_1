package Main;

public class Handbook extends Book {
    private String theme;

    public Handbook(String name, String author, int year,String theme){
        super(name,author,year);
        this.theme = theme;
    }

    public String getTheme(){
        return theme;
    }

    @Override
    public String getInfo(){
        return ("Handbook:" +
                "Name: " + getName() +
                "Author: " + getAuthor() +
                "Year of publication: " + getYearOfPublication() +
                "Theme: " + getTheme());
    }
}
