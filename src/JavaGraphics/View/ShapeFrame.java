package JavaGraphics.View;

import javax.swing.*;
import JavaGraphics.Controller.*;

public class ShapeFrame extends JFrame
{
	private GraphicsController baseController;
	private DrawingPanel basePanel;
	
	public ShapeFrame(GraphicsController baseController)
	{
		this.baseController = baseController;
		basePanel = new DrawingPanel(baseController);
		setUpFrame();
	}
	
	private void setUpFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(800, 800);
		this.setResizable(true);
		this.setVisible(true);
	}
	

}
