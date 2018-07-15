package Vocabulary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class Dictionary {
    
    private final String XFileVoca = "C:\\Users\\LeDuyHungDepTraihaha\\Documents\\NetBeansProjects\\BTL\\Vocabulary.xls";

    public Dictionary() throws IOException{
        File file = new File(XFileVoca);
        if(!file.exists()){
            file.createNewFile();
        }
    }
    
    private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }
    
    public ArrayList getAllWords() throws FileNotFoundException, IOException{
        
        ArrayList res = new ArrayList();
        HSSFWorkbook wb;
        HSSFSheet worksheet;
        FileInputStream fIps = new FileInputStream(XFileVoca);

        if(fIps.available() >= 512){
            wb = new HSSFWorkbook(fIps);
            worksheet = wb.getSheetAt(0);
        }else{
            wb = new HSSFWorkbook();
            worksheet = wb.createSheet("Dictionary");
        }
        
        int rowIndex = 0;
        HSSFRow row;
        while(rowIndex <= worksheet.getLastRowNum()){
            row = worksheet.getRow(rowIndex);
            
            if(row != null){
                Cell index = row.getCell(0);
                Cell keyword = row.getCell(1);
                Cell meaning = row.getCell(2);
                Cell category = row.getCell(3);
                
                Word word = new Word(keyword.getStringCellValue(), meaning.getStringCellValue(), category.getStringCellValue());
                res.add(word);
                rowIndex++;
            }else
                rowIndex++;
        }
        fIps.close();
        return res;
    }
    
    public Word find(String findingKeyword) throws IOException{
        ArrayList res = new ArrayList();
        HSSFWorkbook wb;
        HSSFSheet worksheet;
        FileInputStream fIps = new FileInputStream(XFileVoca);

        if(fIps.available() >= 512){
            wb = new HSSFWorkbook(fIps);
            worksheet = wb.getSheetAt(0);
        }else{
            wb = new HSSFWorkbook();
            worksheet = wb.createSheet("Dictionary");
        }
        
        int rowIndex = 0;
        HSSFRow row;
        while(rowIndex <= worksheet.getLastRowNum()){
            row = worksheet.getRow(rowIndex);
            if(row != null){
                Cell index = row.getCell(0);
                Cell keyword = row.getCell(1);
                Cell meaning = row.getCell(2);
                Cell category = row.getCell(3);
                
                String keywordVal = keyword.getStringCellValue();
                if(keywordVal.equals(findingKeyword)){
                    Word word = new Word(keyword.getStringCellValue(), meaning.getStringCellValue(), category.getStringCellValue());
                    return word;
                }
                rowIndex++;
            }else
                rowIndex++;
        }
        fIps.close();
        return null;
    }
    
    public Result SaveWord(Word word){
        Result res = new Result();
        try{
            HSSFWorkbook wb;
            HSSFSheet worksheet;
            FileInputStream fIps = new FileInputStream(XFileVoca);
            
            if(fIps.available() >= 512){
                wb = new HSSFWorkbook(fIps);
                worksheet = wb.getSheetAt(0);
            }else{
                wb = new HSSFWorkbook();
                worksheet = wb.createSheet("Dictionary");
            }
            
            int rowIndex = 0;
            HSSFRow row;
            while(true){
                row = worksheet.getRow(rowIndex);
                if(row == null) break;
                
                Cell cell = row.getCell(0);
                if(cell == null)
                    break;
                
                rowIndex++;
            }
            
            row = worksheet.createRow(rowIndex);
            
            if(word.Keyword.equals("") || word.Meaning.equals("") || word.Category.equals("")){
                res.IsSuccess = false;
            }
            else{
                Cell indexCell = row.createCell(0);// so thu tu
                indexCell.setCellValue(rowIndex);

                Cell keywordCell = row.createCell(1);
                keywordCell.setCellValue(word.Keyword);

                Cell meaningCell = row.createCell(2);
                meaningCell.setCellValue(word.Meaning);

                Cell category = row.createCell(3);
                category.setCellValue(word.Category);


                fIps.close();
                FileOutputStream output_file =new FileOutputStream(new File(XFileVoca));  
                wb.write(output_file);
                output_file.close();

                res.IsSuccess = true;
            }
        
        }catch(Exception ex){
            res.IsSuccess = false;
            res.Exception = ex;
        }
        
        return res;
    }
    
    
    public int deleteWord(String delword) throws FileNotFoundException, IOException{

        ArrayList res = new ArrayList();
        HSSFWorkbook wb;
        HSSFSheet worksheet;
        FileInputStream fIps = new FileInputStream(XFileVoca);

        if(fIps.available() >= 512){
            wb = new HSSFWorkbook(fIps);
            worksheet = wb.getSheetAt(0);
        }else{
            wb = new HSSFWorkbook();
            worksheet = wb.createSheet("Dictionary");
        }
        
        int rowIndex = 0;
        HSSFRow row;
        while(rowIndex <= worksheet.getLastRowNum()){
            row = worksheet.getRow(rowIndex);
            if(row != null){
                Cell index = row.getCell(0);
                Cell keyword = row.getCell(1);
                Cell meaning = row.getCell(2);
                Cell category = row.getCell(3);
                
                String keywordVal = keyword.getStringCellValue();
                if(keywordVal.equals(delword)){
                    return rowIndex;
                }
                
                rowIndex++;
            }else
                rowIndex++;
        }
        fIps.close();
        return -1;
    }
}
