package ar.fiuba.tecnicas.rockpaperscissors;

public class Papel implements Enfrentador {
	
	public Papel(){
	}
	
	public Enfrentador vs(Piedra contrincante){
		return this;
	}
	
	public Enfrentador vs(Papel contrincante){
		return this;
	}
	
	public Enfrentador vs(Tijera contrincante){
		return contrincante;
	}
	
}
