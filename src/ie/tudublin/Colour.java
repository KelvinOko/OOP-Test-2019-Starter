package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Colour
{
    private String colour;
    public float r, g, b, value;
    PApplet ui;

    public Colour(TableRow row)
    {
        this.colour = row.getString("colour");
        this.r = row.getFloat("r");
        this.g = row.getFloat("g");
        this.b = row.getFloat("b");
        this.value = row.getFloat("value");
    }

    /**
     * @return the colour
     */
    public String getColour() 
    {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) 
    {
        this.colour = colour;
    }

    /**
     * @return the r
     */
    public float getR() 
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(float r) 
    {
        this.r = r;
    }

    /**
     * @return the g
     */
    public float getG() 
    {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(float g) 
    {
        this.g = g;
    }

    /**
     * @return the b
     */
    public float getB() 
    {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) 
    {
        this.b = b;
    }

    public String toString()
    {
        return colour + "\t" + r + "\t" + g + "\t" + b + "\t" + value;  
    }

}