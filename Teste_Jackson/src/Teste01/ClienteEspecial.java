package Teste01;

import java.io.Serializable;
import java.util.Date;

public class ClienteEspecial extends Cliente implements Serializable {
	
	private String teste;

	public ClienteEspecial(String nome, String cPF, Date dataNasc, String teste) {
		super(nome, cPF, dataNasc);
		this.teste = teste;
		// TODO Auto-generated constructor stub
	}


	public String toString() {
		return "ClienteEspecial [teste=" + teste + ", toString()=" + super.toString() + "]";
	}

}
