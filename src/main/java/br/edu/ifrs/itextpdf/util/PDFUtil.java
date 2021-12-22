package br.edu.ifrs.itextpdf.util;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import br.edu.ifrs.itextpdf.model.Aluno;

public class PDFUtil {

	public static Aluno aluno = new Aluno();

	@SuppressWarnings({ "static-access", "unused" })
	public static void salvar() {
		Document document = new Document();

		Calendar calendar = new GregorianCalendar();
		Calendar data = calendar.getInstance();

		try {
			PdfWriter writer = PdfWriter.getInstance(document,
							new FileOutputStream(aluno.getNome() + " " + new SimpleDateFormat("dd-MM-yyyy").format(new Date()) + ".pdf"));
			document.open();

			Image imagem = Image.getInstance("logo_vertical.png");
			imagem.scaleAbsolute(48f, 67.5f);
			imagem.setAlignment(imagem.ALIGN_RIGHT);
			document.add(imagem);

			document.add(new Paragraph("ID do aluno: " + aluno.getId()));
			document.add(new Paragraph("Nome do aluno: " + aluno.getNome()));
			document.add(new Paragraph("Ano da matrícula: " + aluno.getAnoMatricula()));
			document.add(new Paragraph("Nota primeiro ano: " + (float) aluno.getNotaPrimeiroAno()));
			document.add(new Paragraph("Nota segundo ano: " + (float) aluno.getNotaSegundoAno()));
			document.add(new Paragraph("Nota terceiro ano: " + (float) aluno.getNotaTerceiroAno()));
			document.add(new Paragraph("Nota quarto ano: " + (float) aluno.getNotaQuartoAno()));

			document.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Aluno> lerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
