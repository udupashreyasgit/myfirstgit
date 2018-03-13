package completemaven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xcel {

	
	FileInputStream fis ;
	XSSFWorkbook w;
	
	public xcel(String p) throws Exception
	{
		fis = new FileInputStream(p);
	}
	
	public XSSFSheet getsheet(String sheetn)
	{
		XSSFSheet s = w.getSheet(sheetn);
		return s;
	}
	
	public int getrowcount(String sheetn)
	{
		return w.getSheet(sheetn).getLastRowNum();
	}
	
	public int getcolcount(String sheetn,int r)
	{
		return w.getSheet(sheetn).getRow(r).getLastCellNum();
	}
	
	public String readexcel(String sheetn,int rno,int cno)
	{
		XSSFCell cc = w.getSheet(sheetn).getRow(rno).getCell(cno);
		String celltext ="";
		if(cc.getCellType()==Cell.CELL_TYPE_STRING)
		{
			celltext = cc.getStringCellValue();
		}
		else
			if(cc.getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				celltext = String.valueOf(cc.getNumericCellValue());
			}
			else
				celltext="";
		
		return celltext;
		
	}
	public String readexcel(String sheetn,int rno, String cno)
	{
		int coli =0;
		int col = getcolcount(sheetn,rno);
		for(int i =0;i<col ;i++)
			if(w.getSheet(sheetn).getRow(0).getCell(i).getStringCellValue().trim().equalsIgnoreCase(cno))
			{
				coli = i;
				
			}
	return readexcel(sheetn,rno,coli);
	
	}
	
	
}
