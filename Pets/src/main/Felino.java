package main;

public class Felino extends Mascota {

	private float calidadGarras;
	
	/*
	// Llamada al método constructor del padre - #1
	public Felinos(String nombre) {
		super(nombre);
	}
	*/
	
	// Llamada al método constructor del padre - #2
	public Felino(String nombre, float peso, float altura, float largo){
		super(nombre, peso, altura, largo);
		this.calidadGarras = 1;
	}

	@Override
	public float getPesoRacion() {
		return 0.2f*getPeso()*(2f-calidadGarras);
	}
	
	@Override
	public float getEstadoNutricion(){
		return getPeso()/(getAltura()*getLargo());
	}

	public float getCalidadGarras() {
		return calidadGarras;
	}

	public void setCalidadGarras(float calidadGarras) {
		this.calidadGarras = calidadGarras;
	}

}
