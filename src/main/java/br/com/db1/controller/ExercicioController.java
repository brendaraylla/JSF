package br.com.db1.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ExercicioController implements Serializable{

	private static final long serialVersionUID = 1L;
	private Double resultado;
	private Double valor1;
	private Double valor2;
	private Integer dinheiro;
	private String texto;
	private String textoFormatado;
	private String dinheiroFormatado;
	private String opcao;
	
	public String getOpcao() {
		return opcao;
	}

	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDinheiroFormatado() {
		return dinheiroFormatado;
	}

	public void setDinheiroFormatado(String dinheiroFormatado) {
		this.dinheiroFormatado = dinheiroFormatado;
	}

	public Integer getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(Integer dinheiro) {
		this.dinheiro = dinheiro;
	}

	public String getTextoFormatado() {
		return textoFormatado;
	}

	public void setTextoFormatado(String textoFormatado) {
		this.textoFormatado = textoFormatado;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public void exibirSoma() {
		resultado = valor1 + valor2;
	}

	public void exibirSubtrair() {
		resultado = valor1 - valor2;
	}

	public void exibirMultiplicacao() {
		resultado = valor1 * valor2;
	}

	public void exibirDivisao() {
		resultado = valor1 / valor2;
	}

	public String exibirMaiusculo() {
		return textoFormatado = texto.toUpperCase();
	}

	public String exibirMinusculo() {
		return textoFormatado = texto.toLowerCase();
	}
	
	public void formatarDinheiro() {
		dinheiroFormatado = ("R$ " + dinheiro + ",00");
	}
}
