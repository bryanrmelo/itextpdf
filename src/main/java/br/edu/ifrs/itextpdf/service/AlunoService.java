package br.edu.ifrs.itextpdf.service;

import java.util.Scanner;
import br.edu.ifrs.itextpdf.model.Aluno;
import br.edu.ifrs.itextpdf.utils.PDFUtil;

public class AlunoService {

	private static final Scanner sc = new Scanner(System.in);

	public void criarAluno() {
		Aluno aluno = new Aluno();

		System.out.println("ID");
		aluno.setId(sc.nextLong());

		System.out.println("Nome");
		aluno.setNome(sc.next());

		System.out.println("Ano de matrícula");
		aluno.setAnoMatricula(sc.next());

		System.out.println("Nota do primeiro ano");
		aluno.setNotaPrimeiroAno(sc.nextDouble());

		System.out.println("Nota do segundo ano");
		aluno.setNotaSegundoAno(sc.nextDouble());

		System.out.println("Nota do terceiro ano");
		aluno.setNotaTerceiroAno(sc.nextDouble());

		System.out.println("Nota do quarto ano");
		aluno.setNotaQuartoAno(sc.nextDouble());

		PDFUtil.aluno = aluno;

	}

	public void getAlunoById() {
		System.out.println("Nome do arquivo");
		String nome = sc.next();

		PDFUtil.lerPdf(nome);

	}

}
