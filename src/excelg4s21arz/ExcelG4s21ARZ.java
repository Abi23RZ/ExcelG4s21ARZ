/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelg4s21arz;

import java.io.FileOutputStream;
import java.io.OutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
/**
 *
 * @author ABITA
 */
public class ExcelG4s21ARZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Workbook wb = new HSSFWorkbook();
        try (OutputStream fileOut=new FileOutputStream("miarchivo.xls")) {
            Sheet sheet1 = wb.createSheet("Primer Hoja");
            Sheet sheet2 = wb.createSheet("Segunda Hoja");
            Sheet sheet = wb.createSheet("Tercer Hoja");
            Row row = sheet.createRow(0);                           
            row.createCell(0).setCellValue("Num");  
  row.createCell(1).setCellValue("Nombre");  
            row.createCell(2).setCellValue("Edad");  
            row.createCell(3).setCellValue("Correo"); 

            row = sheet.createRow(1); 
            row.createCell(0).setCellValue(1);  
            row.createCell(1).setCellValue("Abigail Ramirez");   
            row.createCell(2).setCellValue(19);  
  row.createCell(3).setCellValue("abigailrz@gmail.com");  
            
            row = sheet.createRow(2); 
            row.createCell(0).setCellValue(2); 
            row.createCell(1).setCellValue("Jair Rmirez");    
            row.createCell(2).setCellValue(20); 
 row.createCell(3).setCellValue("jairrzgmail.com"); 
            
            row = sheet.createRow(3); 
            row.createCell(0).setCellValue(3);  
            row.createCell(1).setCellValue("Diana Degante");
            row.createCell(2).setCellValue("19");
            row.createCell(3).setCellValue("dianadg@gmail.com");
            wb.write(fileOut);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

