package org.test.launch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelprint {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Tamilselvan\\eclipse-workspace\\MavenLaunch\\Excel Sheet\\mavenexcel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Data");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				 int type = c.getCellType();
				// System.out.println(type);
			//	System.out.println(c);
				if (type==1) {
				String name = c.getStringCellValue();
				System.out.println(name);
			}if (type==0) {
				if (DateUtil.isCellDateFormatted(c)) {
				Date date = c.getDateCellValue();
				SimpleDateFormat dateformat=new SimpleDateFormat("dd-MMM-yy");
				String format = dateformat.format(date);
				System.out.println(format);}
				else {
				double d = c.getNumericCellValue();
				long l=(long)d;
				String name = String.valueOf(l);
				System.out.println(name);
				
			}
		}}

	}
}
}