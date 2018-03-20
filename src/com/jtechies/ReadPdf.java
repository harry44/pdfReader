package com.jtechies;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

/**
 * Servlet implementation class ReadPdf
 */
@WebServlet("/ReadPdf")
public class ReadPdf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadPdf() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PdfReaderExample pdf=new PdfReaderExample();
    	pdf.readPdf();
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PdfReaderExample pdf=new PdfReaderExample();
    	//pdf.readPdf();
		PdfReader reader;
        String textFromPage = null;
        try {
        	String path=this.getServletContext().getRealPath(File.separator);
           File f=new File(request.getServletContext().getRealPath(File.separator)+"/pdf.pdf");
System.out.println("path:"+path);
            reader = new PdfReader(f.getAbsolutePath());
            
            // pageNumber = 1
            textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);

            System.out.println(textFromPage);

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
		
		//return textFromPage;
	//	doGet(request, response);
		
	}

}
