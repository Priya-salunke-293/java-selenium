package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

    //single data
    public static String readExcelData(String sheet, int row, int cell)
            throws EncryptedDocumentException, IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Downloads\\createAdmin.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet(sheet);   
        return sh.getRow(row).getCell(cell).toString();
    }
}