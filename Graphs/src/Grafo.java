

import java.util.Hashtable;

public class Grafo{

	private Hashtable <Integer,Integer>posiciones_prohibidas;
	private String []initial_postion;
	private String []forbidenPositions;
	public Grafo(String forbidden_positions[],String initial_position[]){
		this.initial_postion=initial_position;
		this.forbidenPositions=forbidden_positions;

	}



}
