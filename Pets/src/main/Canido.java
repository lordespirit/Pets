package main;

public class Canido extends Mascota{

	private float calidaColmillo; 


	public Canido(String nombre,float peso, float altura, float largo){
		super(nombre,peso,altura, largo);
		this.calidaColmillo =1; 
	}
	
	
	public Canido(){
		super(); 
	}
	

	@Override
	public float getStadoNutricion() { 
		// Peso/(altura * largo)
		return  getPeso()/(getAltura()*getLargo()); 
	}
	
	@Override
	public float getPesoRacion() {
		// 0.3*Peso*(2-CalidaColmillos)
		return 0.3f*getPeso()*(2f-calidaColmillo);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Esto es un perro"; 
	}

	public float getCalidaColmillo() {
		return calidaColmillo;
	}


	public void setCalidaColmillo(float calidaColmillo) {
		this.calidaColmillo = calidaColmillo;
	}

	
	
	
	
	
}
