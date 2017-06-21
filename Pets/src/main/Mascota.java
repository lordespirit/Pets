package main;


/**
 * Como Mascota es abstracta no podra ser instanciada directamente.
 * Solo vale para ser extendida
 * Las clases que extiendan de esta clase deberan implementar el metodo 
 * getPesoRacion()
 * 
 * 
 * El metod getStadoNutricion() no es abstracto, por lo tanto puede o no ser 
 * redefinido. 
 * 
 */
public abstract  class Mascota { 
	
	private Person propietario; 
	
	private String nombre; 
	private float peso; 
	private float altura; 
	private float largo;
	

	public Mascota(){
		
	}
	
	public Mascota(String nombre,float peso, float altura, float largo){
		this.setNombre(nombre);
		this.peso = peso; 
		this.altura = altura; 
		this.largo = largo; 
	}
	
	public Mascota(String nombre){
		this.setNombre(nombre); 
	}
	

	//metodo que se redefinira 
	public float getStadoNutricion(){
		return 0; 	
	}
	
	/**
	 * Metodo abstracto que debe ser definido en las clases que extienden de 
	 * esta clase (Mascota). 
	 * @return
	 */
	public abstract float getPesoRacion();  
	
	@Override
	public String toString() {
		return "Esto es una mascota"; 
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public float getLargo() {
		return largo;
	}


	public void setLargo(float largo) {
		this.largo = largo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Person getPropietario() {
		return propietario;
	}

	public void setPropietario(Person propietario) {
		this.propietario = propietario;
	}


}
