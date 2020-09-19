package Teste04;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Teste03.Cliente;
import Teste03.Conta;
import Teste03.ContaEspecial;

public class TesteToJson {
	public static void main(String[] args) throws ParseException {

		ArrayList<Conta> contas = new ArrayList<Conta>();

		//		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		Cliente cli1 = new Cliente("Pedro Alves", "42145687691", new SimpleDateFormat("dd/MM/yyyy").parse("03/03/1978"), 12345.00);
		Cliente cli2 = new Cliente("Maria dos Santos", "12345678944", new SimpleDateFormat("dd/MM/yyyy").parse("13/08/1968"));
		Cliente cli3 = new Cliente("Rita da Silva", "71373678949", new SimpleDateFormat("dd/MM/yyyy").parse("27/06/1980"));

		Conta cta1 = new Conta(1,cli1);
		Conta cta2 = new Conta(2,cli2);
		Conta cta3 = new ContaEspecial(3,cli3,200.00);
		cta1.deposita(250.00);

		contas.add(cta1);
		contas.add(cta2);
		contas.add(cta3);

		GsonBuilder builder = new GsonBuilder(); 
		builder.setPrettyPrinting(); 
		Gson gson = builder.create(); 

		// converte objetos Java para JSON e retorna JSON como String
		String json = gson.toJson(contas);

		try {
			//Escreve Json convertido em arquivo chamado "file.json"
			FileWriter writer = new FileWriter("contas.json");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(json);

	}
}