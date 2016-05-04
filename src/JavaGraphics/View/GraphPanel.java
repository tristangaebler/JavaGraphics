package JavaGraphics.View;

import java.awt.*;

import javax.swing.*;

public class GraphPanel extends JPanel
{
	private int []graphArray;

	
	public GraphPanel()
	{
		graphArray = new int [] {104, 209, 35, 215, 290, 134};
		setupPanel();
		
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
	}
	

	
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D)currentGraphics;
		
		for(int index = 0; index < graphArray.length; index++)
		{
			int height = this.getHeight()/graphArray.length;
			int width = (int)((graphArray[index] / 200.00) * this.getWidth());
			int xPosition = 0;
			int yPosition = height * index;
			
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int alpha = (int)(Math.random() * 256);
			
			mainGraphics.setColor(new Color(red, green, blue, alpha));
			mainGraphics.fill(new Rectangle(xPosition, yPosition, width, height));
		}
	}
}
