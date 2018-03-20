package com.jtechies;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.IOException;

public class PdfReaderExample {

    private static final String FILE_NAME = "pdf.pdf";

    public String readPdf() {

        PdfReader reader;
        String textFromPage = null;
        try {

            reader = new PdfReader("pdf.pdf");

            // pageNumber = 1
            textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);

            System.out.println(textFromPage);

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return textFromPage;

    }
    public static void main(String[] args) {
    	PdfReaderExample pdf=new PdfReaderExample();
    	pdf.readPdf();
	}

}
