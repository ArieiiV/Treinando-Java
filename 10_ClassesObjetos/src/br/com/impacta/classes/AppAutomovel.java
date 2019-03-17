package br.com.impacta.classes;

public class AppAutomovel {
	public static void main(String[] args) {
//variavel de instancia   >    criando um obejto 
		Automovel auto1 = new Automovel();
		auto1.marca ="Pegeout";
		auto1.modelo="Passion";
		auto1.ano=2018;
		
		System.out.println("auto1");
		System.out.println("marca: "+auto1.marca);
		System.out.println("modelo: "+auto1.modelo);
		System.out.println("ano: "+auto1.ano);
		System.out.println("-----------------------------------");
		
		Automovel auto2 = new Automovel();
		auto2.marca="VW";
		auto2.modelo="Fusca";
		auto2.ano=1970;
		
		System.out.println("auto2");
		System.out.println("marca: "+auto2.marca);
		System.out.println("modelo: "+auto2.modelo);
		System.out.println("ano: "+auto2.ano);
		System.out.println("-----------------------------------");
		
		//Criamos outra variavel de instancia que aponta para o mesmo objeto de auto1.
		//mudamos o valor do atributo ano da variavel auto3 mudando assim o valor do objeto de referencia.
		
		Automovel auto3 = auto2;
		auto3.ano=2046;
		
		auto1=null;//cortando a referencia com o objeto
		
		
//		System.out.println("auto1");
//		System.out.println("marca: "+auto1.marca);
//		System.out.println("modelo: "+auto1.modelo);
//		System.out.println("ano: "+auto1.ano);
//		System.out.println("-----------------------------------");
		
	} 
}
