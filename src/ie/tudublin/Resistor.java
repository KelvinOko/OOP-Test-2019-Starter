package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Resistor
{
    public int value, ones, tens, hundreds;
    public float x1, y1, x2, y2, x, y, w, h;
    PApplet ui;

    public Resistor(int value, PApplet ui)
    {
        this.hundreds = (value / 100);
        this.tens = (value - (hundreds * 100)) / 10;
        this.ones = value - ((hundreds * 100)  + (tens * 10));
    }

    public Resistor(TableRow row)
    {

    }

    public Resistor(float x1, float y1, float x2, float y2, 
    float x, float y, float w, float h, PApplet ui)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void render()
    {
        ui.stroke(0);
        ui.line(x1, y1, x2, y2);
        ui.fill(220,220,220);
        ui.rect(x, y, w, h);
    }

}