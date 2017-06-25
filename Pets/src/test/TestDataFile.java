package test;
import org.junit.Assert;
import org.junit.Test;
import data.GsonHelper;
import main.Ave;
import main.Canido;
import main.Felino;
import main.ListaMascotas;
import main.Mascota;
import main.Person;
import main.Roedor;

public class TestDataFile {
	
/*
	
	@Test
	public void testListaMascotas(){
		
		ListaMascotas list = new ListaMascotas();
		
		list.add(new Canidos("Firulais", 40, 0.4f , 0.65f));
		list.add(new Felinos("Garfield", 15, 0.2f , 0.40f));
		list.add(new Aves("Piolin", 0.22f, 0.1f , 0.1f));
		
		
	Assert.assertNotNull(list.get(0));
	Assert.assertNotNull(list.get(1));
	Assert.assertNotNull(list.get(2));
		
		for(int i=0;i< list.size();i++){
			System.out.println("Mascota: " +  list.get(i).getNombre() +
					" | Estado Nutrición: " + list.get(i).getEstadoNutricion() +
					" | Peso Racion Comida: " + list.get(i).getPesoRacion() );
		}
		
	}
	
	@Test
	public void testListaMascotas2(){
		
		ListaMascotas list = new ListaMascotas();
		
		list.add(new Canidos("Firulais", 40, 0.4f , 0.65f));
		list.add(new Felinos("Garfield", 15, 0.2f , 0.40f));
		list.add(new Aves("Piolin", 0.22f, 0.1f , 0.1f));
		list.add(new Roedores("Tambor", 0.35f , 0.1f , 0.24f));
		
		
		for(int i=0;i< list.size();i++){
			if(list.get(i).getClass().isAssignableFrom(Canidos.class)){
				Canidos canido = (Canidos) list.get(i);
				System.out.println("Canido: " +  canido.getNombre() +
						" | Estado Nutrición: " + canido.getEstadoNutricion() +
						" | Calidad de Colmillos: " +canido.getCalidadColmillo() +
						" | Peso Racion Comida: " + canido.getPesoRacion() );
			}else if(list.get(i).getClass().isAssignableFrom(Felinos.class)){
				Felinos felino = (Felinos) list.get(i);
				System.out.println("Felino: " +  felino.getNombre() +
						" | Estado Nutrición: " + felino.getEstadoNutricion() +
						" | Calidad de Garras: " + felino.getCalidadGarras() +
						" | Peso Racion Comida: " + felino.getPesoRacion() );
			}else if(list.get(i).getClass().isAssignableFrom(Aves.class)){
				Aves ave = (Aves) list.get(i);
				System.out.println("Ave: " +  ave.getNombre() +
						" | Estado Nutrición: " + ave.getEstadoNutricion() +
						" | Calidad de Plumas: " + ave.getCalidadPlumas() +
						" | Peso Racion Comida: " + ave.getPesoRacion() );
			}else if(list.get(i).getClass().isAssignableFrom(Roedores.class)){
				Roedores roedor = (Roedores) list.get(i);
				System.out.println("Roedor: " +  roedor.getNombre() +
						" | Estado Nutrición: " + roedor.getEstadoNutricion() +
						" | Calidad de Pelaje: " + roedor.getCalidadPelaje() +
						" | Peso Racion Comida: " + roedor.getPesoRacion() );
			}
		}
		
	}
	*/
	
	@Test
	public void testListaMascotasPropietario(){
		
		ListaMascotas list = new ListaMascotas();

		Canido can1 = new Canido("Firulais", 40, 0.4f , 0.65f);
		Person per1 = new Person("Edu Valles;00346664585;edu@edu.com;Av.Madrid");
		list.add(can1);
		can1.setPropietario(per1);
		
		Canido can2 = new Canido("Rex", 20, 1f , 1.5f);
		Person per2 = new Person("Fredy Campino;00346617845;fredy@cam.com;Calle Marina");
		list.add(can2);
		can2.setPropietario(per2);
		
		Ave ave1 = new Ave("Piolin", 0.1f, 0.1f , 0.1f);
		Person per3 = new Person("Jose Rodriguez;00345854211;jose@rodr.es;Callejon Verde 12");
		list.add(ave1);
		ave1.setPropietario(per3);
		
		Roedor roedor1 = new Roedor("Mordisquitos", 0.3f, 0.2f , 0.25f);
		list.add(roedor1);
		roedor1.setPropietario(per1);
		
		Mascota[] busqueda1 = list.findByOwnerEmail("jose@");
		Mascota[] busqueda = list.findByOwnerName("Edu");
		
		Assert.assertEquals(1, busqueda1.length);
		Assert.assertEquals(2, busqueda.length);

		for(int i=0;i< list.size();i++){
			if(list.get(i).getClass().isAssignableFrom(Canido.class)){
				Canido canido = (Canido) list.get(i);
				System.out.println("Canido: " +  canido.getNombre() +
						" | Estado Nutrición: " + canido.getEstadoNutricion() +
						" | Calidad de Colmillos: " +canido.getCalidadColmillo() +
						" | Peso Racion Comida: " + canido.getPesoRacion() +
						" | Dueño : " + canido.getPropietario().getFullName());
				
			}else if(list.get(i).getClass().isAssignableFrom(Felino.class)){
				Felino felino = (Felino) list.get(i);
				System.out.println("Felino: " +  felino.getNombre() +
						" | Estado Nutrición: " + felino.getEstadoNutricion() +
						" | Calidad de Garras: " + felino.getCalidadGarras() +
						" | Peso Racion Comida: " + felino.getPesoRacion() +
						" | Dueño : " + felino.getPropietario().getFullName());
				
			}else if(list.get(i).getClass().isAssignableFrom(Ave.class)){
				Ave ave = (Ave) list.get(i);
				System.out.println("Ave: " +  ave.getNombre() +
						" | Estado Nutrición: " + ave.getEstadoNutricion() +
						" | Calidad de Plumas: " + ave.getCalidadPlumas() +
						" | Peso Racion Comida: " + ave.getPesoRacion()  +
						" | Dueño : " + ave.getPropietario().getFullName());
			}else if(list.get(i).getClass().isAssignableFrom(Roedor.class)){
				
				Roedor roedor = (Roedor) list.get(i);
				System.out.println("Roedor: " +  roedor.getNombre() +
						" | Estado Nutrición: " + roedor.getEstadoNutricion() +
						" | Calidad de Pelaje: " + roedor.getCalidadPelaje() +
						" | Peso Racion Comida: " + roedor.getPesoRacion()  +
						" | Dueño : " + roedor.getPropietario().getFullName());
			}
		}
	}
	
}
		

