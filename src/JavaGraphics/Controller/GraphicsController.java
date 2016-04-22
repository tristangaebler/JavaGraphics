package JavaGraphics.Controller;

import JavaGraphics.View.ShapeFrame;


public class GraphicsController
{
	private ShapeFrame baseFrame;

	public void start()
	{
		baseFrame = new ShapeFrame(this);
	}
}
