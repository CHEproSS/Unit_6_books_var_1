package Test;

import Main.Handbook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HandbookTest {

    @Test
    void getTheme() {
        Handbook handbook = new Handbook(
                "Engineer's Main.Main.Handbook ",
                "Ivan Gorov ",
                1990,
                "Engineering");
        //String theme = handbook.getTheme();
        Assertions.assertEquals("Engineering",handbook.getTheme());
    }

    @Test
    void getInfo() {
        Handbook handbook = new Handbook(
                "Engineer's Main.Main.Handbook ",
                "Ivan Gorov ",
                1990,
                "Engineering");
        Assertions.assertEquals(
                "Handbook:" +
                "Name: " + handbook.getName() +
                "Author: " + handbook.getAuthor() +
                "Year of publication: " + handbook.getYearOfPublication() +
                "Theme: " + handbook.getTheme(),  handbook.getInfo());
    }
}