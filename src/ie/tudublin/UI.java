package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	
	
	private ArrayList<Colour> colours = new ArrayList<Colour>();
	private ArrayList<Resistor> resistors = new ArrayList<Resistor>();
	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
	}
	
	public void loadColours()
	{
		Table table = loadTable("colours.csv", "header");
        for (TableRow row : table.rows()) 
        {
            Colour colour = new Colour(row);
            colours.add(colour);
        }
	}

	public void printColours()
	{
		for(int i = 0; i < colours.size(); i++)
		{
			System.out.println(colours.get(i).toString());
		}
	}

	// public Colour findColour(int value)
	// {
	// 	colours.get(value).toString();
	// }

	public void loadResistors()
	{
		Table table = loadTable("resistors.csv");
        for (TableRow row : table.rows()) 
        {
            Resistor resistor = new Resistor(row);
            resistors.add(resistor);
        }
	}

	public void draw()
	{			
	}
}
