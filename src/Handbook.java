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
    public void getInfo(){
        System.out.println("Handbook:");
        System.out.println("Name: " + getName());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of publication: " + getYearOfPublication());
        System.out.println("Theme: " + getTheme());
    }
}
