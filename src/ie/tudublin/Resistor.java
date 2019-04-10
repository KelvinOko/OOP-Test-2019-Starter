package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Resistor
{
    public int value, ones, tens, hundreds;
    PApplet ui;

    public Resistor(Table Row)
    {


    }

    // public Resistor(int value, PApplet ui)
    // {
    //     this.hundreds = (value / 100);
    //     this.tens = (value - (hundreds * 100)) / 10;
    //     this.ones = value - ((hundreds * 100)  + (tens * 10));
    // }

}