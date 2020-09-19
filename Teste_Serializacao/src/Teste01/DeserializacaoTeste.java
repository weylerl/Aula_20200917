package Teste01;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import Teste01.Cliente;

public class DeserializacaoTeste {
    public static void main(String[] args)
    {
		ArrayList<Cliente> clientes = null;

		try
        {
            FileInputStream fis = new FileInputStream("clis.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            clientes = (ArrayList<Cliente>)ois.readObject();
            ois.close();
        }
        catch (Exception e) 
        {
            e.printStackTrace(); }
        for (Cliente cli: clientes)
            System.out.println(cli);
        }

}