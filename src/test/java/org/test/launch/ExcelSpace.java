package org.test.launch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSpace {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Tamilselvan\\eclipse-workspace\\MavenLaunch\\Excel Sheet\\mavenexcel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet3");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		int count = s.getPhysicalNumberOfRows();
		System.out.println(count);
		int cells = r.getPhysicalNumberOfCells();
		System.out.println(cells);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r1 = s.getRow(i);
			for (int j = 0; j < r1.getPhysicalNumberOfCells(); j++) {
				Cell c1 = r1.getCell(j);
				int type = c1.getCellType();
				System.out.println(type);
				//System.out.println(c1);
			}	}
}
}