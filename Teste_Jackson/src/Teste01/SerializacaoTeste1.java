package Teste01;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import Teste01.Cliente;

public class SerializacaoTeste1 {
    public static void main(String[] args)
    {
        try
        {
    		
    		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    		
    		Cliente cli1 = new Cliente("Pedro Alves", "42145687691", new SimpleDateFormat("dd/MM/yyyy").parse("03/03/1978"), 12345.00);
    		Cliente cli2 = new Cliente("Maria dos Santos", "12345678944", new SimpleDateFormat("dd/MM/yyyy").parse("13/08/1968"));
    		Cliente cli3 = new Cliente("Rita da Silva", "71373678949", new SimpleDateFormat("dd/MM/yyyy").parse("27/06/1980"));
    		Cliente cli4 = new ClienteEspecial("Rita de Cassia", "71373678949", new SimpleDateFormat("dd/MM/yyyy").parse("27/06/1980"), "Um teste");
    		Cliente cli5 = new Cliente("Roberto Carlos", "41373878913", new SimpleDateFormat("dd/MM/yyyy").parse("17/05/1950"));
    	
    	    clientes.add(cli1);
    	    clientes.add(cli2);
    	    clientes.add(cli3);
    	    clientes.add(cli4);
    	    clientes.add(cli5);
    	    
            System.out.println(clientes);
    	    
            FileOutputStream fos = new FileOutputStream("clis.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(clientes);
            oos.flush();
            oos.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}