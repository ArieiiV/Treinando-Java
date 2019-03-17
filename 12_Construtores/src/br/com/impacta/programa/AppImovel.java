package br.com.impacta.programa;

import br.com.impacta.classes.exercicios.Imovel;

public class AppImovel {
	public static void main(String[] args) {
		
		Imovel imovel = new Imovel();
		
		imovel.setDesc("Apartamento com janela nos quartos");
		imovel.setEndereco("Av Paulista 1009");	
		
		imovel.setPreco(500000);
		imovel.setArea(100);
		
		System.out.println("Descrição: "+imovel.getDesc()+
				"\nEndereço: "+imovel.getEndereco()+
				"\nPreço: "+imovel.getPreco()+
				"\nArea: "+imovel.getArea()				
				);
		
	}
}
