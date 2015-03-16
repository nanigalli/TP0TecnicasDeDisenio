package ar.fiuba.tecnicas.rockpaperscissors;

public class Tijera implements Enfrentador {
	
	public Tijera(){
	}
	
	public Enfrentador vs(Piedra contrincante){
		return contrincante;
	}
	
	public Enfrentador vs(Tijera contrincante){
		return this;
	}
	
	public Enfrentador vs(Papel contrincante){
		return this;
	}

}
