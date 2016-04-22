package JavaGraphics.View;

import JavaGraphics.Controller.GraphicsController;
import javax.swing.*;
import java.awt.*;

public class DrawingPanel extends JPanel
{
	private GraphicsController baseController;
	private SpringLayout baseLayout;
	
	public DrawingPanel(GraphicsController baseController)
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
