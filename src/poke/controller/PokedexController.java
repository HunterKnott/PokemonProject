package poke.controller;

import java.util.ArrayList;
import poke.model.Pokemon;
import poke.model.Charmander;
import poke.model.Totodile;
import poke.model.Treecko;
import poke.model.Chimchar;
import poke.model.Snivy;
import poke.model.Froakie;
import poke.view.PokedexFrame;

public class PokedexController
{
	private ArrayList<Pokemon> pokemonList;
	private PokedexFrame appFrame;
	
	public PokedexController()
	{
		pokemonList = new ArrayList<Pokemon>();
		addPokemon();
		appFrame = new PokedexFrame(this);
	}
	
	private void addPokemon()
	{
		/*pokemonList.add(new Charmander());
		pokemonList.add(new Totodile());
		pokemonList.add(new Treecko());
		pokemonList.add(new Chimchar());
		pokemonList.add(new Snivy());
		pokemonList.add(new Froakie());*/
	}
	
	public void start()
	{
		
	}
}
