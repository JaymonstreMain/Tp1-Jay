package tests;

import formes.Rectangle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    private Rectangle rectangle1, rectangle2, rectangle3, rectangle4, rectangle5, rectangle6;



    @Before
    public void setUp() throws Exception {
        rectangle1 = new Rectangle(1, 2);
        rectangle2 = new Rectangle(11, 9);
        rectangle3 = new Rectangle(14, 27);
        rectangle4 = new Rectangle(6, 12);
        rectangle5 = new Rectangle(13, 8);
        rectangle6 = new Rectangle(14, 9);
    }

    @Test
    public void calculerPerimetre() {

    }

    @Test
    public void calculerSurface() {
    }

    @Test
    public void testEquals() {
    }

    @Test
    public void getCouleur() {
        assertEquals(rectangle1.getCouleur(), "rouge");
        assertEquals(rectangle2.getCouleur(), "rouge");
        assertEquals(rectangle3.getCouleur(), "rouge");
        assertEquals(rectangle4.getCouleur(), "rouge");
        assertEquals(rectangle5.getCouleur(), "rouge");
        assertEquals(rectangle6.getCouleur(), "rouge");

    }

    @Test
    public void getHauteur() {
        assertEquals(rectangle1.getHauteur(), 1);
        assertEquals(rectangle2.getHauteur(), 11);
        assertEquals(rectangle3.getHauteur(), 14);
        assertEquals(rectangle4.getHauteur(), 6);
        assertEquals(rectangle5.getHauteur(), 13);
        assertEquals(rectangle6.getHauteur(), 14);
    }

    @Test
    public void getLargeur() {
        assertEquals(rectangle1.getLargeur(), 2);
        assertEquals(rectangle2.getLargeur(), 9);
        assertEquals(rectangle3.getLargeur(), 27);
        assertEquals(rectangle4.getLargeur(), 12);
        assertEquals(rectangle5.getLargeur(), 8);
        assertEquals(rectangle6.getLargeur(), 9);
    }

    @Test
    public void getNom() {
        assertEquals(rectangle1.getNom(), "Rectangle");
        assertEquals(rectangle2.getNom(), "Rectangle");
        assertEquals(rectangle3.getNom(), "Rectangle");
        assertEquals(rectangle4.getNom(), "Rectangle");
        assertEquals(rectangle5.getNom(), "Rectangle");
        assertEquals(rectangle6.getNom(), "Rectangle");
    }

    @Test
    public void setCouleur() {

    }

    @Test
    public void setHauteur() {
    }

    @Test
    public void setLargeur() {
    }

    @Test
    public void testToString() {
    }
}
