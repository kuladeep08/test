package com.skk.pdf;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.lang.*;

import com.itextpdf.text.pdf.codec.Base64.InputStream;

public class TestByteInputStream {
	
	
	
	public static void main(String args[])
	{
		
		
		
		
		StringBuilder newTransactionGroupIdResultRecord = new StringBuilder("kuladeep");
		
		ByteArrayInputStream is = new ByteArrayInputStream(newTransactionGroupIdResultRecord.toString().getBytes());
		
		System.out.print("Test");
		
		
		
	}

}
