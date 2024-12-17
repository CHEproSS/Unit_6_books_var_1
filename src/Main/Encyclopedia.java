package Main;

public class Encyclopedia extends Book {
    private int amountOfVolumes;

    public Encyclopedia(String name, String author, int year, int amountOfVolumes){
        super(name, author, year);
        this.amountOfVolumes = amountOfVolumes;
    }

    public int getAmountOfVolumes(){
        return amountOfVolumes;
    }

    @Override
    public String getInfo(){
        return ("Encyclopedia:" +
                "Name: " + getName() +
                "Author: " + getAuthor() +
                "Year of publication: " + getYearOfPublication() +
                "Amount of volumes: " + getAmountOfVolumes());
    }


}
