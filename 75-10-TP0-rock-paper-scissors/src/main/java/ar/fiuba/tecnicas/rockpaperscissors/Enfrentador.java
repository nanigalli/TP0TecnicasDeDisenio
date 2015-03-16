package ar.fiuba.tecnicas.rockpaperscissors;

public interface Enfrentador {

	public Enfrentador vs(Piedra contrincante);
	
	public Enfrentador vs(Papel contrincante);
	
	public Enfrentador vs(Tijera contrincante);
	
}
