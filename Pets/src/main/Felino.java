package main;

public class Felino extends Mascota{
	private float calidadGarras; 

	public Felino(String nombre, float peso, float altura, float largo) {
		super(nombre, peso, altura, largo);
		this.calidadGarras = 1;
	
	}
	
	public Felino() { 
		super(); 
	}


	public float getCalidadGarras() {
		return calidadGarras;
	}


	public void setCalidadGarras(float calidadGarras) {
		this.calidadGarras = calidadGarras;
	}


	@Override
	public float getStadoNutricion() { 
		// Peso/(altura * largo)
		return  getPeso()/(getAltura()*getLargo()); 
	}
	
	@Override
	public float getPesoRacion() {
		//0.1*Peso*(2-CalidaGarras)
		return 0.1f*getPeso()*(2f-calidadGarras);
	}
	

}
