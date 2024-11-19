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
    public void getInfo(){
        System.out.println("Encyclopedia:");
        System.out.println("Name: " + getName());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of publication: " + getYearOfPublication());
        System.out.println("Amount of volumes: " + getAmountOfVolumes());
    }


}
