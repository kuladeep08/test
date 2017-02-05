package com.skk.pdf;

import java.io.FileOutputStream;
import java.io.IOException;
 


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
 
/**
 * First iText example: Hello World.
 */
public class HelloWorld {
 
 /** Path to the resulting PDF file. */
 public static final String RESULT
 = "C:\\Kuladeep\\Novatris\\POCs\\pdf\\hello.pdf";
 
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
 // step 1
 Document document = new Document();
 // step 2
 PdfWriter.getInstance(document, new FileOutputStream(filename));
 // step 3
 document.open();
 // step 4
 
 Paragraph MainMARFparagraph = new Paragraph("Managed Access Request Form");
 
 Font font1 = new Font(Font.FontFamily.HELVETICA  , 50, Font.BOLD);

	 MainMARFparagraph.setSpacingAfter(25);
	 MainMARFparagraph.setSpacingBefore(25);
	 MainMARFparagraph.setAlignment(Element.ALIGN_CENTER);
	 MainMARFparagraph.setIndentationLeft(40);
	 MainMARFparagraph.setIndentationRight(40);
	 MainMARFparagraph.setFont(font1);
	 document.add(MainMARFparagraph);
 
	 

	Font font2 = new Font(Font.FontFamily.HELVETICA  , 20, Font.BOLD);
	 
	Paragraph CountryParagraph = new Paragraph("Country");
	CountryParagraph.setAlignment(Element.ALIGN_LEFT);
	CountryParagraph.setSpacingBefore(15);
	CountryParagraph.setSpacingAfter(15);
	CountryParagraph.setFont(font2);
	document.add(CountryParagraph);
	
	
	
	Paragraph IdentityParagraph = new Paragraph("Identity");
	IdentityParagraph.setAlignment(Element.ALIGN_LEFT);
	IdentityParagraph.setSpacingBefore(10);
	IdentityParagraph.setSpacingAfter(10);
	document.add(IdentityParagraph);
	
	
 
	
	Paragraph TitleParagraph = new Paragraph("Title");
	TitleParagraph.setAlignment(Element.ALIGN_LEFT);
	TitleParagraph.setIndentationLeft(40);
	TitleParagraph.setSpacingAfter(10);
	document.add(TitleParagraph);
	
	
	Paragraph NameParagraph = new Paragraph("Name");
	NameParagraph.setAlignment(Element.ALIGN_LEFT);
	NameParagraph.setIndentationLeft(40);
	NameParagraph.setSpacingAfter(10);
	document.add(NameParagraph);
	
	
	
	Paragraph EMailParagraph = new Paragraph("E-Mail");
	EMailParagraph.setAlignment(Element.ALIGN_LEFT);
	EMailParagraph.setIndentationLeft(40);
	EMailParagraph.setSpacingAfter(10);
	document.add(EMailParagraph);
	
	Paragraph instituteParagraph = new Paragraph("Name of institute/hospital/practice");
	instituteParagraph.setAlignment(Element.ALIGN_LEFT);	
	instituteParagraph.setIndentationLeft(40);
	instituteParagraph.setSpacingAfter(10);
	document.add(instituteParagraph);
	
	Paragraph DepartmentParagraph = new Paragraph("Department (if applicable)");
	DepartmentParagraph.setAlignment(Element.ALIGN_LEFT);
	DepartmentParagraph.setIndentationLeft(40);
	DepartmentParagraph.setSpacingAfter(10);
	document.add(DepartmentParagraph);
	
	Paragraph AddressParagraph = new Paragraph("Address");
	AddressParagraph.setAlignment(Element.ALIGN_LEFT);
	AddressParagraph.setIndentationLeft(40);
	AddressParagraph.setSpacingAfter(10);
	document.add(AddressParagraph);
	
	Paragraph PostCodeParagraph = new Paragraph("Post Code");
	PostCodeParagraph.setAlignment(Element.ALIGN_LEFT);
	PostCodeParagraph.setIndentationLeft(40);
	PostCodeParagraph.setSpacingAfter(10);
	document.add(PostCodeParagraph);
	
	Paragraph CityParagraph = new Paragraph("City and State");
	CityParagraph.setAlignment(Element.ALIGN_LEFT);
	CityParagraph.setIndentationLeft(40);
	CityParagraph.setSpacingAfter(10);
	document.add(CityParagraph);
	
	Paragraph PhoneNumberParagraph = new Paragraph("Phone Number");
	PhoneNumberParagraph.setAlignment(Element.ALIGN_LEFT);
	PhoneNumberParagraph.setIndentationLeft(40);
	PhoneNumberParagraph.setSpacingAfter(10);
	document.add(PhoneNumberParagraph);
	
	
	Paragraph SubMARParagraph = new Paragraph("Managed Access Request");
	SubMARParagraph.setAlignment(Element.ALIGN_LEFT);
	SubMARParagraph.setSpacingBefore(10);
	SubMARParagraph.setSpacingAfter(10);
	document.add(SubMARParagraph);
	
	Paragraph DrugParagraph = new Paragraph("Drug or treatment");
	DrugParagraph.setAlignment(Element.ALIGN_LEFT);
	DrugParagraph.setIndentationLeft(40);
	DrugParagraph.setSpacingAfter(10);
	document.add(DrugParagraph);
	
	Paragraph DiseaseParagraph = new Paragraph("Disease / Condition of patient");
	DiseaseParagraph.setAlignment(Element.ALIGN_LEFT);
	DiseaseParagraph.setIndentationLeft(40);
	DiseaseParagraph.setSpacingAfter(10);
	document.add(DiseaseParagraph);
	
	Paragraph AdditionalParagraph = new Paragraph("Additional Info (e.g. previously used treatments, summary of patient’s history) ");
	AdditionalParagraph.setAlignment(Element.ALIGN_LEFT);
	AdditionalParagraph.setIndentationLeft(40);
	AdditionalParagraph.setSpacingAfter(10);
	document.add(AdditionalParagraph);
	
	
	Paragraph SencodLastPara = new Paragraph("Please provide specific information to aid decision making, however do not include any patient identifier.");
	SencodLastPara.setAlignment(Element.ALIGN_LEFT);
	SencodLastPara.setSpacingBefore(40);
	SencodLastPara.setSpacingAfter(25);
	document.add(SencodLastPara);
	
	Paragraph DisclaimerPara = new Paragraph("Disclaimer on data privacy");
	DisclaimerPara.setAlignment(Element.ALIGN_LEFT);
	document.add(DisclaimerPara);
	
	
 
 // step 5
 document.close();
 }
}