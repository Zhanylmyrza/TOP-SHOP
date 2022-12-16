// package com.bkrva;
// import org.apache.poi.ss.usermodel.*;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// import com.microsoft.schemas.office.visio.x2012.main.CellType;
// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.util.Iterator;

// public class ApachePOIExcelRead {
//   private static final String FILE_NAME = "D:\\JAVA\\Top-Shop\\src\\main\\resources\\static\\datas\\garments.xlsx";

//   public static void main(String[] args) {

//       try {

//           FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
//           Workbook workbook = new XSSFWorkbook(excelFile);
//           Sheet datatypeSheet = workbook.getSheetAt(0);
//           Iterator<Row> iterator = datatypeSheet.iterator();
//           System.out.println(workbook);

//           while (iterator.hasNext()) {

//               Row currentRow = iterator.next();
//               Iterator<Cell> cellIterator = currentRow.iterator();

//               while (cellIterator.hasNext()) {

//                   Cell currentCell = cellIterator.next();
                  
//                   if (currentCell.getCellType() == CellType.NOT_EQUAL) {//STRING
//                       System.out.print(currentCell.getStringCellValue() + "--");
//                   } else if (currentCell.getCellType() == CellType.EQUAL) {//NUMERIC
//                       System.out.print(currentCell.getNumericCellValue() + "--");
//                   }

//               }
//               System.out.println();

//           }
//         } catch (FileNotFoundException e) {
//           e.printStackTrace();
//       } catch (IOException e) {
//           e.printStackTrace();
//       }

//   }
// }
