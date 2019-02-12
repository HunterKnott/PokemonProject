package poke.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import poke.controller.PokedexController;

public class PokedexPanel extends JPanel
{
	private PokedexController app;
	private SpringLayout appLayout;
	
	private JButton changeButton;
	private JComboBox pokedexDropdown;
	
	private JTextField numberField;
	private JTextField nameField;
	private JTextField evolveField;
	private JTextField attackField;
	private JTextField enhancementField;
	private JTextField healthField;
	
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel evolveLabel;
	private JLabel attackLabel;
	private JLabel enhanceLabel;
	private JLabel healthLabel;
	private JLabel imageLabel;
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		this.app = app;
		
		this.appLayout = new SpringLayout();
		
		numberField = new JTextField("0");
		nameField = new JTextField("A Pokemon");
		evolveField = new JTextField("true");
		attackField = new JTextField("0");
		enhancementField = new JTextField("0");
		healthField = new JTextField("0");
		
		healthLabel = new JLabel("Health: ");
		numberLabel = new JLabel("# ");
		
		evolveLabel = new JLabel("This pokemon can evolve");
		attackLabel = new JLabel("Attack: ");
		enhanceLabel = new JLabel("Enhancements: ");
		nameLabel = new JLabel("Name: ");
		imageLabel = new JLabel("Pokemon: ");
		changeButton = new JButton("Change");
		pokedexDropdown = new JComboBox("Click here to see other pokemon");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(1000, 500));
		this.setBackground(Color.WHITE);
		
		this.add(pokedexDropdown);
		this.add(numberField);
		this.add(nameField);
		this.add(evolveField);
		this.add(attackField);
		this.add(enhancementField);
		this.add(healthField);
		
		this.add(healthLabel);
		this.add(numberLabel);
		this.add(evolveLabel);
		this.add(attackLabel);
		this.add(enhanceLabel);
		this.add(nameLabel);
		this.add(imageLabel);
		this.add(changeButton);
		this.add(pokedexDropdown);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
