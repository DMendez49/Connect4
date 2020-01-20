package connect;

import java.awt.Color;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * * * * * * * Team Project - CS1410 * * * * * * * 
 * * 											 *
 * 					Spring 2019 			     * 
 * 												 *
 * 					David Mendez 				 *
 * 				                				 *
 * * * * * * * * * * * * * * * * * * * * * * * * *
 */

public class colorWheel {
	
	private String call;
	private Color[] colors = new Color[16];
	private String[] colorWheelie = new String[16];
	private File colorFile;

	@SuppressWarnings("resource")
	public colorWheel(String Goku) throws FileNotFoundException {

		Scanner rainBow = new Scanner(new File("src/connect/color.txt"));

		for (int x = 0; x < 16; x++) {
					colorWheelie[x] = rainBow.nextLine();
					colors[x] = Color.decode(colorWheelie[x]);
			}
		call = Goku;
	}

	public colorWheel(File fireFlames, String name_1) throws FileNotFoundException {

			colorFile = fireFlames;
			Scanner CLR = new Scanner(colorFile);
			for (int x = 0; x < 16; x++) {
					colorWheelie[x] = CLR.nextLine();
					colors[x] = Color.decode(colorWheelie[x]);
			}
	}

	public String[] getColorWheelie() {
		return colorWheelie;
	}

	public void setColorWheelie(String[] colorWheelie) {
		this.colorWheelie = colorWheelie;
	}

	public Color[] getColors() {
		return colors;
	}

	public void setColors(Color[] colors) {
		this.colors = colors;
	}

	public Color getColor(int i) {
		return null;
	}

	public int nextInt() {
		return 0;
	}
}
