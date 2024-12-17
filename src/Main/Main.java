package Main;

import Main.Handbook;

public class Main{
    public static void main(String[] args){
        Handbook handbook = new Handbook("Engineer's Main.Main.Handbook ","Ivan Gorov ",1990,"Engineering");
        Encyclopedia encyclopedia = new Encyclopedia("Big encyclopedia ","Gotfrid Lentz ", 1950, 2);

        Book[] library = {handbook,encyclopedia};

        for (Book book : library){
            book.getInfo();
            System.out.println();
        }
    }
}