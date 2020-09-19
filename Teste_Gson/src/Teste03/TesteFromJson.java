package Teste03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class TesteFromJson {
	public static void main(String[] args) throws ParseException {

		GsonBuilder builder = new GsonBuilder(); 
		builder.setPrettyPrinting(); 

		Gson gson = builder.create(); 

		// converte objetos Java para JSON e retorna JSON como String

		try {
			//Escreve Json convertido em arquivo chamado "file.json"
			BufferedReader br = new BufferedReader(new FileReader("cliente.json"));

			//Converte String JSON para objeto Java
			Type meuTipo = new TypeToken<ArrayList<Cliente>>(){}.getType();

			ArrayList<Cliente> clientes = gson.fromJson(br, meuTipo);
//			ArrayList<Cliente> clientes = gson.fromJson(br, ArrayList.class);

			for (Cliente cli: clientes) {
				System.out.println((Cliente)cli);
			}  
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}