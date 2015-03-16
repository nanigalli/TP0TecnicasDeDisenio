package ar.fiuba.tecnicas.rockpaperscissors;

public class Piedra implements Enfrentador {

	public Piedra(){
	}
	
	public Enfrentador vs(Piedra contrincante){
		return this;
	}
	
	public Enfrentador vs(Tijera contrincante){
		return this;
	}
	
	public Enfrentador vs(Papel contrincante){
		return contrincante;
	}
	
}
