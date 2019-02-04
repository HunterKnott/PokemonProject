package poke.view;

import javax.swing.JFrame;
import poke.controller.PokeController;

public class PokeFrame extends JFrame
{
	private PokeController appController;
	private PokePanel appPanel;
	
	public PokeFrame(PokeController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new PokePanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Pokedex");
		this.setSize(1000, 500);
		this.setResizable(false);
		this.setVisible(true);
	}
}
