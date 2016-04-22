package JavaGraphics.View;

import javax.swing.*;

import JavaGraphics.Controller.GraphicsController;

public class ShapePanel extends JPanel
{
	private GraphicsController baseController;
	private SpringLayout baseLayout;
	
	public ShapePanel(GraphicsController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
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
