package com.creatio.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFUtil2 {
	public static String readPDFData(String filepath) {
		String text ="";
		 
		try {
			FileInputStream fis = new FileInputStream(filepath);
			
			PDDocument doc = PDDocument.load(fis);
			
			PDFTextStripper pdf = new PDFTextStripper();
			
			text = pdf.getText(doc);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return text;
		
		
		
		
		
		
	}

}
