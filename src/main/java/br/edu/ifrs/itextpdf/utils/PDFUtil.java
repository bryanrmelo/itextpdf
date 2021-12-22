package br.edu.ifrs.itextpdf.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;
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
							new FileOutputStream(aluno.getNome() + "-" + new SimpleDateFormat("dd-MM-yyyy").format(new Date()) + ".pdf"));
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

	public static void lerPdf(String nome) {
		try {
			PdfReader pdfReader = new PdfReader(nome + ".pdf");
			PdfReaderContentParser parser = new PdfReaderContentParser(pdfReader);
			TextExtractionStrategy strategy;

			for (int i = 1; i <= pdfReader.getNumberOfPages(); i++) {
				strategy = parser.processContent(i, new SimpleTextExtractionStrategy());
				System.out.println(strategy.getResultantText());

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
