package JavaGraphics.View;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

import javax.swing.*;

import JavaGraphics.Controller.GraphicsController;

public class ShapePanel extends JPanel
{
	private GraphicsController baseController;
	private SpringLayout baseLayout;
	
	private ArrayList<Rectangle> rectangleList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Ellipse2D> circleList;
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	
	
	public ShapePanel()
	{
		baseLayout = new SpringLayout();
		rectangleList = new ArrayList<Rectangle>();
		ellipseList = new ArrayList<Ellipse2D>();
		circleList = new ArrayList<Ellipse2D>();
		triangleList = new ArrayList<Polygon>();
		polygonList = new ArrayList<Polygon>();
		
		
		//====Calling the methods====
		setUpPane();
		setUpPanel();
		setUpLayout();
		setUpListeners();
	}
	
	public void addPolygon()
	{
		int numOfSides = (int)(Math.random() * 248) + 3;
		int [] xpoints = new int [numOfSides];
		int [] ypoints = new int [numOfSides];
		for(int sides = 0; sides < numOfSides; sides++)
		{
			xpoints[sides] = (int)(Math.random() * 300);
			ypoints[sides] = (int)(Math.random() * 300);
		}
		
		Polygon myPolygon = new Polygon(xpoints, ypoints, numOfSides);
		polygonList.add(myPolygon);
		repaint();
	}
	
	
	public void addCircle()
	{
		int xposition = (int)(Math.random() * 1000);
		int yposition = (int)(Math.random() * 1000);
		int diameter = (int)(Math.random() * 100);
		
		Ellipse2D circle = new Ellipse2D.Double(xposition, yposition, diameter, diameter);
		circleList.add(circle);
		
	}
	
	public void addRectangle()
	{
		
	}
	
	public void addTriangle()
	{
		int [] xpoints = new int [3];
		int [] ypoints = new int [3];
		xpoints = new int []{(int)(Math.random() * 250), (int)(Math.random() * 250), (int)(Math.random() * 250)};
		ypoints = new int []{(int)(Math.random() * 250), (int)(Math.random() * 250), (int)(Math.random() * 250)};
		
		Polygon triangle = new Polygon(xpoints, ypoints, 3);
		triangleList.add(triangle);
		repaint();
	}
	
	public void addSquare()
	{
		
	}
	
	public void addElipse()
	{
		
	}
	
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D)currentGraphics;
		for(Polygon triangle : triangleList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			
			int pencilSize = (int) (Math.random() * 15);
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(pencilSize));
			mainGraphics.draw(triangle);
		}
		
		for(Polygon current : polygonList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.fill(current);

		}
		
		for(Ellipse2D ellipse: circleList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue));
			int pencilSize = (int) (Math.random() * 15);
			mainGraphics.setStroke(new BasicStroke(pencilSize));
			mainGraphics.draw(ellipse);
		}
	}
	
	public void clear()
	{
		polygonList.clear();
		circleList.clear();
		triangleList.clear();
		ellipseList.clear();
		repaint();
	}
	
	private void setUpPane()
	{
		
	}
	
	/*
	 * GUI Components
	 */
	private void setUpPanel()
	{
		
	}
	
	/*
	 * Garbage Code
	 */
	private void setUpLayout()
	{
		
	}
	
	private void setUpListeners()
	{
		
	}
	
}
