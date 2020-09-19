package Teste03;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TesteToJson {
	public static void main(String[] args) throws ParseException {

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cli1 = new Cliente("Pedro Alves", "42145687691", new SimpleDateFormat("dd/MM/yyyy").parse("03/03/1978"), 12345.00);
		Cliente cli2 = new Cliente("Maria dos Santos", "12345678944", new SimpleDateFormat("dd/MM/yyyy").parse("13/08/1968"));
		Cliente cli3 = new Cliente("Rita da Silva", "71373678949", new SimpleDateFormat("dd/MM/yyyy").parse("27/06/1980"));
		Cliente cli5 = new Cliente("Roberto Carlos", "41373878913", new SimpleDateFormat("dd/MM/yyyy").parse("17/05/1950"));
	
	    clientes.add(cli1);
	    clientes.add(cli2);
	    clientes.add(cli3);
	    clientes.add(cli5);
	
	    GsonBuilder builder = new GsonBuilder(); 
	    builder.setPrettyPrinting(); 

	    Gson gson = builder.create(); 

		// converte objetos Java para JSON e retorna JSON como String
		String json = gson.toJson(clientes);

		try {
			//Escreve Json convertido em arquivo chamado "file.json"
			FileWriter writer = new FileWriter("cliente.json");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(json);

	}
}