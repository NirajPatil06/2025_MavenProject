package com.creatio.application.test;

import com.creatio.framework.utilities.PDFUtil2;

public class ReadPDFData {

	public static void main(String[] args) {


		String pdfData = PDFUtil2.readPDFData(System.getProperty("user.dir")+"\\Files\\Bike_NOC.pdf");
		System.out.println(pdfData);
	}

}
