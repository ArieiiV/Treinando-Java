package bc.com.impacta.interfaces;

public interface Figura {
	// Em java n„o existe variavel global
	// variavel statica n„o pertence a classe
	// todo atributo em uma interface È constante (final) public e static , por
	// default
	public static final String DESCRICAO = "Interface Figura: deve ser implementada";

	// todos os metodos de uma interface s„o publicos e abstratos por default
	double calcularArea();

	default String exibirFigura() {
		String resposta = "Classe: "+this.getClass().getSimpleName()+
				"\n¡rea da figura: " + this.calcularArea();
		return resposta;
		
	}
}
