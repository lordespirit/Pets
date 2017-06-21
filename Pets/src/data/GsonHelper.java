package data;

import com.google.gson.Gson;

import main.ListaMascotas;

public class GsonHelper {

	
	public static String listaMascotasToJson(ListaMascotas list){
		Gson gson = new Gson(); 
		String strList = gson.toJson(list, ListaMascotas.class);	
		return strList;
	} 
	
	public static ListaMascotas jsonFromlistaMascotasToJson(String strJson){  
		Gson gson = new Gson(); 
		ListaMascotas list = gson.fromJson(strJson,ListaMascotas.class); 
		return list;
	}
	
}
