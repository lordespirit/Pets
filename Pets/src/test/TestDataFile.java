package test;

import org.junit.Assert;
import org.junit.Test;

import data.GsonHelper;
import main.Ave;
import main.Canido;
import main.Felino;
import main.ListaMascotas;
import main.Person;
import main.Roedor;

public class TestDataFile {
	
	@Test
	public void testSaveToFile(){
		
		ListaMascotas list = getMockListMascotas();
		String strJson = GsonHelper.listaMascotasToJson(list); 
		Assert.assertNotNull(strJson);
		ListaMascotas results=null;
		
		try{
		   results = GsonHelper.jsonFromlistaMascotasToJson(strJson);  
		}catch (Exception e) {
			e.printStackTrace(); 
		}
		
		//TODO Test is failing  fix it by to custom the GSON object 
		 
		Assert.assertEquals(list.get(0), results.get(0));
		Assert.assertEquals(list.get(1), results.get(1));
		Assert.assertEquals(list.get(2), results.get(2));
		Assert.assertEquals(list.get(3), results.get(3));
	}
	
	 
	public ListaMascotas getMockListMascotas(){
		
		ListaMascotas list = new ListaMascotas();  
		
		Felino fe = new Felino(); 
		
		// Mascotas 
		Canido can      = new Canido("Firulais", 40, 0.50f,0.50f);
		Felino felino   =new Felino("Garffiel", 20, 0.20f,0.30f); 
		Ave parrot 		= new Ave("Parro", 0.5f, 0.10f,0.15f); 
		Roedor miki   = new Roedor("Miki", 0.2f, 0.5f,0.1f); 
		
		//Propietarios 
		Person propieCan = new Person("Fredy Campino;0034656000000;fredy@poo.com;Calle Campino"); 
		Person propieFelino = new Person("Alex  Guix;0034656000001; jordi@poo.com;Calle Guix");
		Person propieParrot = new Person("Josep Cardona;0034656000002;josep@poo.com;Calle Cardona");
		Person propieMiki = new Person("Marc  Font;0034656000003;marc@poo.com;Calle font");
		
		// iniciar el propietario a cada mascota
		can.setPropietario(propieCan);
		felino.setPropietario(propieFelino); 	
		parrot.setPropietario(propieParrot); 	
		miki.setPropietario(propieMiki); 
		
		//add a la lista 
		list.add(can);
		list.add(felino);
		list.add(parrot);
		list.add(miki);
		
		return list; 
		
		
	}
	
	

}
