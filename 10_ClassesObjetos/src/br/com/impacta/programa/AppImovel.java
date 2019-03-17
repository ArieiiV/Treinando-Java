package br.com.impacta.programa;

import javax.swing.JOptionPane;

import br.com.impacta.classes.exercicios.Imovel;

public class AppImovel {
	public static void main(String[] args) {
		
		Imovel imovel1 =new Imovel();
		imovel1.area=450.56;
		imovel1.desc="Sobrado com 3 quartos e dois banheiros";
		imovel1.endereco="Av das Flores 1900";
		
		String resp ="Imovel 1 "+
		"\nArea: "+imovel1.area+
		"\nDescrição: "+imovel1.desc+
		"\nEndereço: "+imovel1.endereco;				
		
		JOptionPane.showMessageDialog(null,resp);
		System.out.println("--------------------------------------------");
		
		Imovel imovel2 = new Imovel();//variavel local pq esta declarado dentro do metodo
		imovel2.area=200.00;
		imovel2.desc="Apartamento 200m² , 2 quartos sala e cozinha";
		imovel2.endereco="Av Getulio 300";
		
		resp ="Imovel 2 "+
		"\nArea: "+imovel2.area+
		"\nDescrição: "+imovel2.desc+
		"\nEndereço: "+imovel2.endereco;
		
		
		JOptionPane.showMessageDialog(null,resp);
	}
}
