package com.skk.pdf;

import java.io.FileOutputStream;
import java.io.IOException;
 


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
 
/**
 * First iText example: Hello World.
 */
public class TestHelloWorld {
 
 /** Path to the resulting PDF file. */
 public static final String RESULT
 = "C:\\Kuladeep\\Novatris\\POCs\\pdf\\Test.pdf";
 
 /**
 * Creates a PDF file: hello.pdf
 * @param args no arguments needed
 */
 public static void main(String[] args)
 throws DocumentException, IOException {
 new HelloWorld().createPdf(RESULT);
 }
 
 /**
 * Creates a PDF document.
 * @param filename the path to the new PDF document
 * @throws DocumentException
 * @throws IOException
 */
 public void createPdf(String filename)
 throws DocumentException, IOException {

 Document document = new Document();
 PdfWriter.getInstance(document, new FileOutputStream(filename));
 document.open();
 
 Paragraph paragraph2 = new Paragraph("Managed Access Request Form");

	paragraph2.setSpacingAfter(25);
	paragraph2.setSpacingBefore(25);
	paragraph2.setAlignment(Element.ALIGN_CENTER);
	paragraph2.setIndentationLeft(50);
	paragraph2.setIndentationRight(50);
	//paragraph2.setFont(new Font(bf, size, style));
	document.add(paragraph2);
	
	
//	Paragraph Countryparagraph = new Paragraph("Country");
	
//	Countryparagraph.setAlignment(Element.ALIGN_LEFT);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

 document.close();
 }
}