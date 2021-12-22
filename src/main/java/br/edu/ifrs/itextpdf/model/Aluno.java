package br.edu.ifrs.itextpdf.model;

public class Aluno {

	private long id;

	private String nome;

	private String anoMatricula;

	private double notaPrimeiroAno;

	private double notaSegundoAno;

	private double notaTerceiroAno;

	private double notaQuartoAno;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAnoMatricula() {
		return anoMatricula;
	}

	public void setAnoMatricula(String anoMatricula) {
		this.anoMatricula = anoMatricula;
	}

	public double getNotaPrimeiroAno() {
		return notaPrimeiroAno;
	}

	public void setNotaPrimeiroAno(double notaPrimeiroAno) {
		this.notaPrimeiroAno = notaPrimeiroAno;
	}

	public double getNotaSegundoAno() {
		return notaSegundoAno;
	}

	public void setNotaSegundoAno(double notaSegundoAno) {
		this.notaSegundoAno = notaSegundoAno;
	}

	public double getNotaTerceiroAno() {
		return notaTerceiroAno;
	}

	public void setNotaTerceiroAno(double notaTerceiroAno) {
		this.notaTerceiroAno = notaTerceiroAno;
	}

	public double getNotaQuartoAno() {
		return notaQuartoAno;
	}

	public void setNotaQuartoAno(double notaQuartoAno) {
		this.notaQuartoAno = notaQuartoAno;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + "]";
	}

}
