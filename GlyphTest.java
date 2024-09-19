package com.mycompany.app;

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    public Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

public class GlyphTest extends Glyph {
    private int radius = 1;

    GlyphTest(int r) {
        radius = r;
        System.out.println("GlyphTest.GlyphTest(), radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("GlyphTest.draw(), radius = " + radius);
    }
}
