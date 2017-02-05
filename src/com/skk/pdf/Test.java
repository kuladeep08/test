package com.skk.pdf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import com.itextpdf.text.pdf.codec.Base64.InputStream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	StringBuilder newTransactionGroupIdResultRecord = new StringBuilder("Kuladeep");
		byte[] buffer = new byte[200];
		buffer = newTransactionGroupIdResultRecord.toString().getBytes();
		java.io.InputStream bis= new ByteArrayInputStream(buffer);
		
		*/
		ByteArrayOutputStream  bytStram = new ByteArrayOutputStream(1000);
		 
		//bytStram= new String("kuladeep").getBytes();
		  
		byte[] buffer = new byte[1000];
		   buffer = bytStram.toByteArray();
		  // is= new ByteArrayInputStream(buffer);
		   
		   
		
	}

}
