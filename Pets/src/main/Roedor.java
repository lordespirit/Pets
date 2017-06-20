package main;

public class Roedor extends Mascota{
	private float calidadPelaje; 


	public Roedor(String nombre, float peso, float altura, float largo) {
		super(nombre, peso, altura, largo);
		this.calidadPelaje = 1;
	}
	
	

	@Override
	public float getStadoNutricion() { 
		// Peso/(altura * largo)
		return  getPeso()/(0.3f*getAltura()*getLargo()); 
	}
	
	@Override
	public float getPesoRacion() {
		//0.1*Peso*(2-CalidaGarras)
		return 0.15f*getPeso()*(2f-calidadPelaje);
	}
	
	
	
	
	
	public float getCalidadPelaje() {
		return calidadPelaje;
	}

	public void setCalidadPelaje(float calidadPelaje) {
		this.calidadPelaje = calidadPelaje;
	}
	

}
