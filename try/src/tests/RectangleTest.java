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
    }

    @Test
    public void getHauteur() {
    }

    @Test
    public void getLargeur() {
    }

    @Test
    public void getNom() {
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