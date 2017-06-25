package main;

public class Ave extends Mascota {
	
	private float calidadPlumas;
	/*
	// Llamada al método constructor del padre - #1
	public Aves(String nombre){
		super(nombre);
	}
	*/
		
	// Llamada al método constructor del padre - #2
	public Ave(String nombre, float peso, float altura, float largo){
		super(nombre, peso, altura, largo);
		this.calidadPlumas = 1;
	}

	@Override
	public float getPesoRacion() {
		return 0.1f*getPeso()*(2f-calidadPlumas);
	}
	
	@Override
	public float getEstadoNutricion(){
		return getPeso()/((0.5f*getAltura())*getLargo());
	}

	public float getCalidadPlumas() {
		return calidadPlumas;
	}

	public void setCalidadPlumas(float calidadPlumas) {
		this.calidadPlumas = calidadPlumas;
	}

}
