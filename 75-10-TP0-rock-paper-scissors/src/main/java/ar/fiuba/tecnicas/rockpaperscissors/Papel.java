package ar.fiuba.tecnicas.rockpaperscissors;

public class Papel {
	
	public Papel(){
	}
	
	public Papel vs(Piedra contrincante){
		return this;
	}
	
	public Papel vs(Papel contrincante){
		return this;
	}
	
	public Tijera vs(Tijera contrincante){
		return contrincante;
	}
	
}
