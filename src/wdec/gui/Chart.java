/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wdec.gui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import wdec.decision_utils.DataOut;
import wdec.decision_utils.Stage;

/**
 *
 * @author gladky 
 */
public class Chart extends Canvas
{
	public Chart()
	{
		model = null;
		ryzyko = 50;
	}
	@Override
	public void paint(Graphics g)
	{
		drawCoordinateSystem(g);
		drawPoints(g);
	}
	
	public void setModel(Stage model)
	{
		this.model = model;
	}
	
	public void updateRyzyko(int ryzyko)
	{
		this.ryzyko = ryzyko;
	}
	
	/**
	 * Nanosi na wykres punkty
	 */
	private void drawPoints(Graphics g)
	{
		
		/**
		 * znajdz max zysk aby dostosowac rysowanie wykresu
		 */
		double max = 0;
		for(int m = 0; m <= 100; m++){
			DataOut r = model.findBestData(m);
			if(r.getResult() > max) max = r.getResult();
		}
		System.out.println("max " + max);
		
		double bestResult = -1d;
		boolean zdominejted = false;
		
		for (int i = 0; i <= 100; i++)
		{
			zdominejted = false;
			DataOut r = model.findBestData(i);
			if (r == null)
			{
				continue;
			}
			
			//System.out.println("best for risk " + i + " is " + r.getResult());
			
			int x = (int) ( i * (this.getWidth() - 40) / 100);
			
			
			if(bestResult < r.getResult()){
				bestResult = r.getResult();
				zdominejted= true;
			}
			
			/**
			 * max 				-> 	(this.getHeight - 50)
			 * r.getResult() 	->	y
			 */
			int y = (int) (r.getResult() * (this.getHeight() - 50) /max );
			
			if (i == ryzyko)
			{
				g.setColor(Color.RED);
				g.fillOval(x + 22, 372 - y, 6, 6);
				//g.drawOval(x, y, width, height)
			}
			else
			{
				if(!zdominejted){
					g.setColor(Color.LIGHT_GRAY);
					g.fillOval(x + 22, 372 - y, 3, 3);
				}
				else {
					g.setColor(Color.DARK_GRAY);
					g.fillOval(x + 22, 372 - y, 6, 6);
				}
			}
			
			
			//g.drawOval(x + 22,  y, 5, 5);
		}
	}
	
	private void drawCoordinateSystem(Graphics g)
	{
		int w = this.getSize().width;
		int h = this.getSize().height;

		// Draws x axis
		g.drawLine(25, h-25, w-25, h-25);
		g.drawLine(w-25, h-25, w-30, h-30);
		g.drawLine(w-25, h-25, w-30, h-20);
		g.drawString("Ryzyko", w - 50, h - 10);
		
		//Draws y axis
		g.drawLine(25, h-25, 25, 25);
		g.drawLine(25, 25, 20, 30);
		g.drawLine(25, 25, 30, 30);
		g.drawString("Zysk", 10, 20);
		
	}
	
	
	private Stage model;
	private int ryzyko;
}
