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
	private JButton drawSquare;
	private JButton drawTriangle;
	private JButton drawEllipse;
	private JButton drawPolygo;
	private JButton drawCircle;
	private JButton clearButton;
	private ArrayList<Rectangle> rectangleList;
	private ShapePanel shapePanel;
	
	public DrawingPanel(GraphicsController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		rectangleList = new ArrayList<Rectangle>();
		shapePanel = new ShapePanel();
		clearButton = new JButton("Clear the list");
		drawCircle = new JButton("Draw Circle");
		drawRectangle = new JButton("Rectangle");


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
		this.setLayout(baseLayout);
		this.add(shapePanel);
		this.add(clearButton);
		this.add(drawRectangle);
		this.add(drawCircle);
	}
	
	/*
	 * Garbage Code
	 */
	private void setUpLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel, -46, SpringLayout.NORTH, clearButton);
		baseLayout.putConstraint(SpringLayout.NORTH, clearButton, 566, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, clearButton, 39, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, clearButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, clearButton, 163, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, drawRectangle, 0, SpringLayout.NORTH, clearButton);
		baseLayout.putConstraint(SpringLayout.WEST, drawRectangle, 25, SpringLayout.EAST, drawCircle);
		baseLayout.putConstraint(SpringLayout.NORTH, drawCircle, 0, SpringLayout.NORTH, clearButton);
		baseLayout.putConstraint(SpringLayout.WEST, drawCircle, 6, SpringLayout.EAST, clearButton);
		baseLayout.putConstraint(SpringLayout.NORTH, shapePanel, 24, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, shapePanel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, shapePanel, -10, SpringLayout.EAST, this);
	}
	
	
	private void setUpListeners()
	{
		drawRectangle.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addRectangle();
				repaint();	
			}
		});
		
		drawCircle.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addCircle();
				repaint();
			}
		});
		
		clearButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.clear();
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
