package poos3_semana14_ex_junior.entities;


public class Produto{
	
	private Integer codigo;
	private String nome;
	private Double preco;
	
	public Produto(Integer codigo, String nome, Double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public Integer getCodigo() {
		return codigo;
	}


	public String getNome() {
		return nome;
	}


	public Double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
	


	
	

}
