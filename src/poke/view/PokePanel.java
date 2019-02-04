package poke.view;

import javax.swing.*;
import poke.controller.PokeController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Font;

public class PokePanel extends JPanel
{
	private PokeController appController;
	private SpringLayout appLayout;
	
	public PokePanel(PokeController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.WHITE);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
