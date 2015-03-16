package ar.fiuba.tecnicas.rockpaperscissors;

public class Piedra {

	public Piedra(){
	}
	
	public Piedra vs(Piedra contrincante){
		return this;
	}
	
	public Piedra vs(Tijera contrincante){
		return this;
	}
	
	public Papel vs(Papel contrincante){
		return contrincante;
	}
	
}
