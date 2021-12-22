package br.edu.ifrs.itextpdf.utils;

import java.util.Scanner;
import br.edu.ifrs.itextpdf.service.AlunoService;

public class MenuUtil {

	private static final Scanner sc = new Scanner(System.in);

	private static AlunoService alunoService = new AlunoService();

	public static void mostrarMenu() {

		while (true) {
			System.out.println("REGISTRO");
			System.out.println("(1) - Criar aluno");
			System.out.println("(2) - Mostrar aluno");
			System.out.println("(0) - Salvar e sair");

			int op = sc.nextInt();

			if (op == 1) {
				alunoService.criarAluno();
			} else
				if (op == 2) {
					alunoService.getAlunoById();
				} else
					if (op == 0) {
						PDFUtil.salvar();
						break;
					}
		}
	}
}
