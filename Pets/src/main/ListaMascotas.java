package main;

public class ListaMascotas {
	
	private Mascota[] arrayMascotas;
	
	
	public ListaMascotas(){
		arrayMascotas = new Mascota[0];
	}
	
	public void add(Mascota mascota){
		Mascota[] tem = new Mascota[arrayMascotas.length + 1]; 
		int i=0;
		for(i=0; i< arrayMascotas.length; i++)
			tem [i]=arrayMascotas[i]; 	
		tem [i]= mascota;
		
		arrayMascotas=tem; 
	}
	
	public  Mascota get(int index){
		return arrayMascotas[index]; 
	}
	

	/**
	 * Retorna el index del objeto person 
	 * @param mascota
	 * @return
	 */
	public int indexOf(Mascota mascota){
		int index = -1; 
		for(int i=0; i<arrayMascotas.length; i++){
			if(arrayMascotas[i].equals(mascota)){
				index = i;
				 break; 
			}
		}	
		return index; 
	}
	
	public void remove(Mascota mascota) {
		int index = indexOf(mascota);
		remove(index);
	}	
	
	
	
	public void remove(int index){
		Mascota copyMascotas[]= new Mascota[arrayMascotas.length-1];
			int j=0;
			for(int i=0;i<arrayMascotas.length;i++){
				if(i!=index){
					copyMascotas[j++]=arrayMascotas[i];
				}
			}
	 arrayMascotas = copyMascotas;
	}

	public int size() {
		return arrayMascotas.length;
	}
	
	
	/**
	 *   
	 *  
	 * @param name
	 * @return
	 */
	public Mascota[] findByOwnerName(String name){
		return arrayMascotas;
		
	}

    public Mascota[] findByOwnerEmail(String email){
		return arrayMascotas; 
	}

}
