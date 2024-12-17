package Test;

import Main.Encyclopedia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EncyclopediaTest {

    @Test
    void getAmountOfVolumes() {
        Encyclopedia encyclopedia = new Encyclopedia(
                "Big encyclopedia ",
                "Gotfrid Lentz ",
                1950,
                2);
        Assertions.assertEquals(2,encyclopedia.getAmountOfVolumes());
    }

    @Test
    void getInfo() {
        Encyclopedia encyclopedia = new Encyclopedia(
                "Big encyclopedia ",
                "Gotfrid Lentz ",
                1950,
                2);
        Assertions.assertEquals("Encyclopedia:" +
                "Name: " + encyclopedia.getName() +
                "Author: " + encyclopedia.getAuthor() +
                "Year of publication: " + encyclopedia.getYearOfPublication() +
                "Amount of volumes: " + encyclopedia.getAmountOfVolumes(),encyclopedia.getInfo());
    }
}