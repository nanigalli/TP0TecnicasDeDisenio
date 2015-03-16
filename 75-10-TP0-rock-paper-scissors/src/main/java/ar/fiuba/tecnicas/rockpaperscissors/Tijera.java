package ar.fiuba.tecnicas.rockpaperscissors;

public class Tijera {
	
	public Tijera(){
	}
	
	public Piedra vs(Piedra contrincante){
		return contrincante;
	}
	
	public Tijera vs(Tijera contrincante){
		return this;
	}
	
	public Tijera vs(Papel contrincante){
		return this;
	}

}
