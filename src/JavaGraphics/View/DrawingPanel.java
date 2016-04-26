package JavaGraphics.View;

import JavaGraphics.Controller.GraphicsController;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DrawingPanel extends JPanel
{
	private GraphicsController baseController;
	private SpringLayout baseLayout;
	private JButton drawRectangle;
	private ArrayList<Rectangle> rectangleList;
	private ShapePanel shapePanel;
	
	public DrawingPanel(GraphicsController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		drawRectangle = new JButton("Rectangle");
		rectangleList = new ArrayList<Rectangle>();
		shapePanel = new ShapePanel();
		
		//====Calling the methods====
		setUpPane();
		setUpPanel();
		setUpLayout();
		setUpListeners();
	}
	
	private void setUpPane()
	{
		
	}
	
	/*
	 * GUI Components
	 */
	private void setUpPanel()
	{
		this.add(drawRectangle);
	}
	
	/*
	 * Garbage Code
	 */
	private void setUpLayout()
	{
		
	}
	
	
	private void setUpListeners()
	{
		drawRectangle.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent click)
			{
		
				shapePanel.addTriangle();
				repaint();	
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D)currentGraphics;
		mainGraphics.setColor(Color.GREEN);
		mainGraphics.setStroke(new BasicStroke(15));
		mainGraphics.draw(new Rectangle(10, 10, 20, 40));
		
		for(Rectangle current : rectangleList)
		{
			int randomStroke = (int)(Math.random() * 7);
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			mainGraphics.fill(current);
		}
		
	}
	
	
}
