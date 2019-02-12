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
	private JComboBox<String> pokedexDropdown;
	
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
		appLayout.putConstraint(SpringLayout.EAST, numberField, -421, SpringLayout.EAST, this);
		nameField = new JTextField("A Pokemon");
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 14, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 510, SpringLayout.WEST, this);
		evolveField = new JTextField("true");
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 26, SpringLayout.SOUTH, evolveField);
		attackField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 15, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, numberField);
		enhancementField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, 15, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 0, SpringLayout.WEST, numberField);
		healthField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 22, SpringLayout.SOUTH, enhancementField);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, numberField);
		healthLabel = new JLabel("Health: ");
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, healthField);
		numberLabel = new JLabel("# ");
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, numberField);
		
		evolveLabel = new JLabel("This pokemon can evolve");
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, -5, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 21, SpringLayout.EAST, evolveLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 64, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, evolveLabel, 353, SpringLayout.WEST, this);
		attackLabel = new JLabel("Attack: ");
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, 0, SpringLayout.EAST, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -14, SpringLayout.WEST, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 5, SpringLayout.NORTH, attackField);
		enhanceLabel = new JLabel("Enhancements: ");
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 5, SpringLayout.NORTH, enhancementField);
		appLayout.putConstraint(SpringLayout.EAST, enhanceLabel, -14, SpringLayout.WEST, enhancementField);
		nameLabel = new JLabel("Name: ");
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -18, SpringLayout.WEST, nameField);
		imageLabel = new JLabel("Pokemon: ");
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 246, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, imageLabel, -198, SpringLayout.SOUTH, this);
		changeButton = new JButton("Change");
		appLayout.putConstraint(SpringLayout.NORTH, changeButton, -4, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, changeButton, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, changeButton, 46, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, changeButton, 101, SpringLayout.WEST, this);
		pokedexDropdown = new JComboBox<String>();
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 1, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 182, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -61, SpringLayout.WEST, evolveLabel);
		
		setupDropdown();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(app.buildPokedexText());
		pokedexDropdown.setModel(temp);
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(1000, 500));
		this.setBackground(Color.WHITE);
		
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
