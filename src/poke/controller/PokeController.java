package poke.controller;

import java.util.ArrayList;

public class PokeController
{
	private ArrayList<Pokemon> pokemonList;
	private PokedexFrame appFrame;
	
	public PokeController()
	{
		pokemonList = new ArrayList<Pokemon>();
		addPokemon();
		appFrame = new PokedexFrame(this);
	}
	
	private void addPokemon()
	{
		PokemonList.add(new Charmander());
		PokemonList.add(new Totodile());
	}
	
	public void start()
	{
		
	}
}
