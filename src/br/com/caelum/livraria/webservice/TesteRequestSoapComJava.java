package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;

public class TesteRequestSoapComJava {

	public static void main(String[] args) throws RemoteException {
		
		LivrariaWS cliente = new LivrariaWSProxy();
		
		Livro[] livros = cliente.getLivrosPeloNome("Server");
		
		for (Livro livro : livros) {
			System.out.println("Livro " + livro.getTitulo());
			System.out.println("Autor "  + livro.getAutor().getNome());
		}

	}

}
