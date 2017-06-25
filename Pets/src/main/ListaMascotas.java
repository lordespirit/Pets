package main;

public class ListaMascotas {

	private Mascota[] arrayMascotas;
	
	public ListaMascotas(){
		arrayMascotas = new Mascota[0];
	}
	
	public ListaMascotas(String[] vetContacts){
		iniContact(vetContacts); 
	}
	
	private void iniContact(String[] vetContacts) {
		arrayMascotas =  new Mascota[vetContacts.length];
		  
		/*  for(int i=0; i<vetContacts.length; i++){
			  
			  // FALTA CREAR METODO PARA CONVERTIR EN OBJETO (String, float, float, float)
		
			  String mascotaActual = vetContacts[i];
			  
			  if(mascotaActual.getClass().isAssignableFrom(Roedores.class)){
				  Roedores newRoedor = new Roedores(mascotaActual);
				  arrayMascotas[i] = newRoedor; 
				  
			  }else if(mascotaActual.getClass().isAssignableFrom(Aves.class)){
				  Aves newAve = new Aves(mascotaActual);
				  arrayMascotas[i] = newAve; 
				  
			  }else if(mascotaActual.getClass().isAssignableFrom(Canidos.class)){
				  Canidos newCan = new Canidos(mascotaActual);
				  arrayMascotas[i] = newCan; 
				  
			  }else{
				  Felinos newFelino = new Felinos(mascotaActual);
				  arrayMascotas[i] = newFelino; 
				  
			  }
			  
		  }*/
	}

	public Mascota get(int index){
		return arrayMascotas[index];
	}
	
	public int size(){
		return arrayMascotas.length;
	}
	
	public void add(Mascota mascota){
		Mascota[] copyMascotas = new Mascota[arrayMascotas.length+1];
		for(int i=0;i<arrayMascotas.length;i++){
			copyMascotas[i]=arrayMascotas[i];
		}
		copyMascotas[copyMascotas.length-1]=mascota;
		arrayMascotas = copyMascotas;
	}
	
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
		if(index<0||index>arrayMascotas.length){
			System.out.println("Índice incorrecto...");
			return;
		}else{
			Mascota[] copyMascotas = new Mascota[arrayMascotas.length-1];
			int j=0;
			for(int i=0;i<arrayMascotas.length;i++){
				if(i!=index){
					copyMascotas[j++]=arrayMascotas[i];
				}
			}
			arrayMascotas = copyMascotas;
		}
	}
	
	public Mascota[] findByOwnerName(String name){
		Mascota findNameArrayMascotas[];  
		int counter = 0;
		for(int i = 0; i<arrayMascotas.length;i++){
			if(arrayMascotas[i].getPropietario().getFullName().startsWith(name))
				counter++;
		}
		findNameArrayMascotas = new Mascota[counter];  
		for(int i=0,k=0; i<findNameArrayMascotas.length; i++){
			if(arrayMascotas[i].getPropietario().getFullName().startsWith(name))
				findNameArrayMascotas[k++]=arrayMascotas[i];
		}
		return findNameArrayMascotas;
	}
	
	public Mascota[] findByOwnerEmail(String email){
		Mascota findEmailArrayMascotas[];  
		int counter = 0;
		for(int i = 0; i<arrayMascotas.length;i++){
			if(arrayMascotas[i].getPropietario().getEmail().startsWith(email))
				counter++;
		}
		findEmailArrayMascotas = new Mascota[counter];  
		for(int i=0,k=0; i<findEmailArrayMascotas.length; i++){
			if(arrayMascotas[i].getPropietario().getEmail().startsWith(email))
				findEmailArrayMascotas[k++]=arrayMascotas[i];
		}
		return findEmailArrayMascotas;
	}
	
	
}

