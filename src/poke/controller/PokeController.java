package poke.controller;

import java.util.ArrayList;

import poke.model.Pokemon;

public class PokeController
{
	private ArrayList<Pokemon> pokemonList;
	private PokeFrame appFrame;
	
	public PokeController()
	{
		pokemonList = new ArrayList<Pokemon>();
		addPokemon();
		appFrame = new PokeFrame(this);
	}
	
	private void addPokemon()
	{
		pokemonList.add(new Charmander());
		pokemonList.add(new Totodile());
		pokemonList.add(new Treecko());
		pokemonList.add(new Chimchar());
		pokemonList.add(new Snivy());
		pokemonList.add(new Froakie());
	}
	
	public void start()
	{
		
	}
}
