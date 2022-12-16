package com.bkrva;

// import org.apache.commons.lang3.StringUtils;
// import org.apache.poi.ss.usermodel.Cell;
// // import org.apache.poi.ss.usermodel.CellType;
// import com.microsoft.schemas.office.visio.x2012.main.CellType;

// import org.apache.poi.ss.usermodel.Row;
// import org.apache.poi.xssf.usermodel.XSSFSheet;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class SignIn {
  private static String[] roles = new String[]{
    "Owner",
    "Customer",
    "Deliveryman"
};

public static void main(String[] args) throws IOException {
System.out.println("Please, authorize: ");
chooseUsers();
}

public static String chooseUsers() throws IOException {
Scanner sc = new Scanner(System.in);

System.out.println("Choose your specialty :");
for (int i = 1; i <= roles.length; ++i) {
    System.out.printf("(%d) %s", i, roles[i - 1]);
}
do {
    System.out.print("Your choice: ");
    String choose = sc.nextLine();
    switch (choose) {
        case "owner":
        case "Owner":
        case "1":
            System.out.println("Welcome Owner!");
            System.out.println("Enter your username and password: ");
            directorInputLgPw();
            break;
        case "customer":
        case "Customer":
        case "2":
            System.out.println("Welcome Customer!");
            System.out.println("Enter your username and password: ");
            workerInputLgPw();
            break;
        case "deliveryman":
        case "Deliveryman":
        case "3":
            System.out.println("Welcome Deliveryman");
            System.out.println("Enter your username and password: ");
            deliverymanInputLgPw();
            break;
        default:
            System.out.println("Are you Ms Smith?");
            System.out.print("Wish to exit[1] or repeat[0]? ");
            int ex = sc.nextInt();
            if (ex == 0) {
                chooseUsers();
            } else if (ex == 1) {
                System.exit(0);
            }
    }
    break;
} while (true);
return "";
}

// Авторизация директора
public static void directorInputLgPw() {
Scanner sc = new Scanner(System.in);

ArrayList<String> loginArrayList = new ArrayList<String>();
ArrayList<String> passwordArrayList = new ArrayList<String>();
loginArrayList.add("Zhanylmyrza");
passwordArrayList.add("zhbkrva1108");

loginArrayList.add("Customer");
passwordArrayList.add("Customer1");

loginArrayList.add("Delivery");
passwordArrayList.add("Delivery1");
        
loginArrayList.add("Cus");
passwordArrayList.add("Cus1");

loginArrayList.add("Del");
passwordArrayList.add("Del1");

do {
    System.out.print("Enter your username: ");
    String input_lg = sc.next();
    sc.nextLine();
    System.out.print("Enter your password: ");
    String input_pw = sc.next();
    sc.nextLine();
    int indexArray = 0;
    boolean haveInArray = false;
    while (indexArray < loginArrayList.size()) {
        if (input_lg.equals(loginArrayList.get(indexArray)) &&
                input_pw.equals(passwordArrayList.get(indexArray))) {
            haveInArray = true;
            break;
        } else {
            haveInArray = false;
        }
        indexArray++;
    }
    ;
    if (haveInArray == true) {
        System.out.println("Owner, you successfully entered!");
        directorActions();
        break;
    } else {
        System.out.println("Try again: ");
    }
} while (true);
}

// Авторизация работника
public static void workerInputLgPw() throws IOException {
Scanner sc = new Scanner(System.in);

ArrayList<String> loginArrayList = new ArrayList<String>();
ArrayList<String> passwordArrayList = new ArrayList<String>();
loginArrayList.add("Cus");
passwordArrayList.add("Cus1");


do {
    System.out.print("Enter your username: ");
    String input_lg = sc.next();
    sc.nextLine();
    System.out.print("Enter your password: ");
    String input_pw = sc.next();
    sc.nextLine();
    int indexArray = 0;
    boolean haveInArray = false;
    while (indexArray < loginArrayList.size()) {
        if (input_lg.equals(loginArrayList.get(indexArray)) &&
                input_pw.equals(passwordArrayList.get(indexArray))) {
            haveInArray = true;
            break;
        } else {
            haveInArray = false;
        }
        indexArray++;
    }
    ;
    if (haveInArray == true) {
        System.out.println("Customer, you successfully entered!");
        Menu();
        break;
    } else {
        System.out.println("Try again: ");
    }
} while (true);
}

// Авторизация курьера
public static void deliverymanInputLgPw() throws IOException {
Scanner sc = new Scanner(System.in);

ArrayList<String> loginArrayList = new ArrayList<String>();
ArrayList<String> passwordArrayList = new ArrayList<String>();
loginArrayList.add("Del");

passwordArrayList.add("Del1");

do {
    System.out.print("Введите логин: ");
    String input_lg = sc.next();
    sc.nextLine();
    System.out.print("Введите пароль: ");
    String input_pw = sc.next();
    sc.nextLine();
    int indexArray = 0;
    boolean haveInArray = false;
    while (indexArray < loginArrayList.size()) {
        if (input_lg.equals(loginArrayList.get(indexArray)) &&
                input_pw.equals(passwordArrayList.get(indexArray))) {
            haveInArray = true;
            break;
        } else {
            haveInArray = false;
        }
        indexArray++;
    }
    ;
    if (haveInArray == true) {
        System.out.println("Приветствую дорогой доставщик!");
        // deliverymanActions();
        break;
    } else {
        System.out.println("Попытайтесь снова.");
    }
} while (true);
}

// Действия директора
public static void directorActions() {
Scanner sc = new Scanner(System.in);

System.out.println("Меню:");
System.out.println("(1)Показать список всей бытовой техники");
System.out.println("(2)Показать количество бытовой техники");
System.out.println("(3)Максимальное количество бытовой техники");
System.out.println("(4)Минимальное количество бытовой техники");
System.out.println("(5)Отчет по закупкам бытовой техники");
System.out.println("(0)Выход");
do {
    System.out.print("Ваш выбор: ");
    String chooseAction = sc.nextLine();
    switch (chooseAction) {
        case "action1":
        case "Action1":
        case "1":
            System.out.println("Действие 1");
            action1();
            directorActions();
            break;
        case "action2":
        case "Action2":
        case "2":
            System.out.println("Действие 2");
            action2();
            directorActions();
            break;
        case "action3":
        case "Action3":
        case "3":
            System.out.println("Действие 3");
            action3();
            directorActions();
            break;
        case "action4":
        case "Action4":
        case "4":
            System.out.println("Действие 4");
            action4();
            directorActions();
            break;
        case "action5":
        case "Action5":
        case "5":
            System.out.println("Действие 5");
            action5();
            directorActions();
            break;
        default:
            System.out.println("Такого действия нет в программе!");
            directorActions();
            break;
        case "n":
            try {
                chooseUsers();
            } catch (IOException e) {
                e.printStackTrace();
            }
        case "action0":
        case "Action0":
        case "0":
            System.out.println("Выход");
            break;
    }
    break;
} while (true);
}

public static void action1() {
try {
    BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\testProject\\kol.txt"));
    while (br.ready()) {
        System.out.print(br.readLine() + " ");
    }
    System.out.println();
    br.close();
} catch (IOException e) {
    System.out.println(e);
}
}

public static void action2() {
try {
    BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\testProject\\kol.txt"));
    int count = 0;
    while (br.ready()) {
        br.readLine();
        count++;
    }
    BufferedReader br1 = new BufferedReader(new FileReader("D:\\JAVA\\testProject\\zkz.txt"));
    int count1 = 0;
    while (br1.ready()) {
        br1.readLine();
        count1++;
    }
    System.out.println("Всего товаров = " + (int) (count + count1));
    br1.close();
    br.close();
} catch (IOException e) {
    System.out.println(e);
}
}

public static void action3() {
try {
    BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\testProject\\kol.txt"));
    HashMap<String, Integer> d = new HashMap<>();
    while (br.ready()) {
        String line = br.readLine();
        if (d.containsKey(line)) {
            d.put(line, (int) (d.get(line) + 1));
        } else {
            d.put(line, 1);
        }
    }

    System.out.println(d);
    String s = "dsd";
    int m = 0;
    for (String i : d.keySet()) {
        if (d.get(i) > m) {
            m = d.get(i);
            s = i;
        }
    }
    System.out.println("Максимальное количество бытовой техники " + s);
    br.close();
} catch (IOException e) {
    System.out.println(e);
}
}

public static void action4() {
try {
    BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\testProject\\kol.txt"));
    HashMap<String, Integer> d = new HashMap<>();
    while (br.ready()) {
        String line = br.readLine();
        if (d.containsKey(line)) {
            d.put(line, (int) (d.get(line) + 1));
        } else {
            d.put(line, 1);
        }
    }
    System.out.println(d);
    String s = "dsd";
    int m = 100;
    for (String i : d.keySet()) {
        if (d.get(i) < m) {
            m = d.get(i);
            s = i;
        }
    }
    System.out.println("Минимальное количество бытовой техники:" + s);
    br.close();
} catch (IOException e) {
    System.out.println(e);
}
}

public static void action5() {
try {
    BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\testProject\\kol.txt"));
    System.out.print("Доставленная бытовая техника ");
    int countLine = 0;
    while (br.ready()) {
        System.out.print(br.readLine() + ", ");
        countLine++;
    }
    System.out.println("Количество = " + countLine);
    BufferedReader br1 = new BufferedReader(new FileReader("D:\\JAVA\\testProject\\zkz.txt"));
    System.out.print("Заказанная бытовая техника ");
    int countline = 0;
    while (br1.ready()) {
        System.out.print(br1.readLine() + ", ");
        countline++;
    }
    System.out.println("Количество = " + countline);
    br1.close();
    br.close();
} catch (FileNotFoundException e) {
    System.out.println(e);
} catch (IOException e) {
    System.out.println(e);
}
}

public static void Menu() throws IOException {
System.out.println("1. Показать весь список бытовой техники в магазине");
System.out.println("2. Искать бытовую технику");
System.out.println("3. Показать отчет по бытовой технике");
System.out.println("4. Выполнить заказ бытовой техники");
System.out.println("5. Посмотреть список заказаной бытовой тенхники");
System.out.println("6. Показать отсутствующие на складе бытовые техники");
System.out.println("7. Показать все бытовые техники, на которых действует скидка");
System.out.println("8. Удалить заказ");
System.out.println("9. Выход");
// ShowMenu();
}

// public static void ShowMenu() throws IOException {
// Scanner input = new Scanner(System.in);
// while (true) {
//     System.out.print("(Чтобы увидеть меню снова, нажмите [0]) Введите-->");
//     var action = input.nextLine();
//     switch (action) {
//         case "0":
//             Menu();
//             break;
//         case "1":
//             ShowFullList();
//             break;
//         case "2":
//             Search();
//             break;
//         case "3":
//             ShowReport();
//             break;
//         case "4":
//             Order();
//             break;
//         case "5":
//             OrderList();
//             break;
//         case "6":
//             Lack();
//             break;
//         case "7":
//             Discount();
//             break;
//         case "8":
//             Delete();
//             break;
//         case "n":
//             try {
//                 chooseUsers();
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//         case "9":
//             exit();
//             break;
//         default:
//             System.out.print("Пожалуйста, введите номера из меню.");
//     }
// }
// }

// private static void ShowFullList() throws FileNotFoundException, IOException {
// try {
//     FileInputStream file = new FileInputStream(new File("C:\\Users\\nurma\\Downloads\\Aki_Store.xlsx"));
//     XSSFWorkbook workbook = new XSSFWorkbook(file);
//     XSSFSheet sheet = workbook.getSheetAt(0);
//     Iterator<Row> rowIterator = sheet.iterator();


//     while (rowIterator.hasNext()) {
//         Row row = rowIterator.next();
//         for (var colIndex = 0; colIndex < 3; colIndex += 2) {
//             Cell cell = row.getCell(colIndex);
//             switch (cell.getCellType()) {
//                 case NUMERIC:
//                     System.out.printf("%.0f", cell.getNumericCellValue());
//                     break;
//                 case STRING:
//                     System.out.print(cell.getStringCellValue() + "\t\t");
//                     break;
//             }
//         }
//         System.out.println();

//     }
//     file.close();
// } catch (Exception e) {
//     System.out.println("Something is wrong!");
// }
// }

// private static void Search() throws FileNotFoundException, IOException {
// Scanner input = new Scanner(System.in);
// FileInputStream file = new FileInputStream(new File("C:\\Users\\nurma\\Downloads\\Aki_Store.xlsx"));
// XSSFWorkbook workbook = new XSSFWorkbook(file);
// XSSFSheet sheet = workbook.getSheetAt(0);
// System.out.print("Введите название техники или серийный номер-->");
// String search = input.nextLine();
// Iterator<Row> rowIterator = sheet.iterator();
// while (rowIterator.hasNext()) {
//     Row row = rowIterator.next();
//     Cell name = row.getCell(0);
//     Cell serialNum = row.getCell(1);
//     if (name != null && name.getCellType() == CellType.STRING && name.getStringCellValue().equalsIgnoreCase(search)) {
//         System.out.print(name.getStringCellValue() + "\t\t\n");
//         break;
//     }
//     int numericValue = -1;
//     try {
//         numericValue = Integer.parseInt(search);
//     } catch (Exception e) {
//         e.printStackTrace();
//         continue;
//     }
//     if (serialNum != null && serialNum.getCellType() == CellType.NUMERIC && serialNum.getNumericCellValue() == numericValue) {
//         System.out.printf("%s, %d\n", name.getStringCellValue(), numericValue);
//         break;
//     }
// }
// file.close();
// }

// private static void ShowReport() {
// try {
//     FileInputStream file = new FileInputStream(new File("C:\\Users\\nurma\\Downloads\\Aki_Store.xlsx"));
//     XSSFWorkbook workbook = new XSSFWorkbook(file);
//     XSSFSheet sheet = workbook.getSheetAt(0);
//     Iterator<Row> rowIterator = sheet.iterator();

//     while (rowIterator.hasNext()) {
//         Row row = rowIterator.next();
//         for (var colIndex = 0; colIndex <= row.getLastCellNum(); colIndex++) {
//             Cell cell = row.getCell(colIndex);
//             if (cell == null) break;
//             switch (cell.getCellType()) {
//                 case NUMERIC:
//                     System.out.printf("%.0f", cell.getNumericCellValue());
//                     System.out.print("\t\t");
//                     break;
//                 case STRING:
//                     System.out.print(cell.getStringCellValue() + "\t\t");
//                     break;
//             }
//         }
//         System.out.println();
//     }
//     file.close();
// } catch (Exception e) {
//     e.printStackTrace();
//     System.out.println("Something is wrong!");
// }
// }

// private static void Order() {
// String path = "C:\\Users\\nurma\\OneDrive\\Desktop\\Home-shop1.txt";
// try {
//     BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
//     Scanner input = new Scanner(System.in);

//     do {
//         System.out.print("Введите название техники, которую вы бы хотели заказать-->");
//         String thing = input.nextLine();
//         if (thing == null || StringUtils.isEmpty(thing.trim())) {
//             break;
//         } else {
//             writer.newLine();
//             writer.write(thing);
//         }

//     } while (true);
//     writer.close();
// } catch (IOException e) {
//     e.printStackTrace();
//     System.out.println(e);
// } finally {
//     System.out.println("Заказ сделан.");
// }
// }

// private static void OrderList() {
// String path = "D:\\JAVA\\testProject\\zkz.txt";
// try {
//     BufferedReader reader = new BufferedReader(new FileReader(path));
//     while (reader.ready()) {
//         System.out.println(reader.readLine());
//     }
//     reader.close();
// } catch (IOException e) {
//     System.out.println(e);
// } finally {
//     System.out.println("Был показан список заказанной техники на данный момент.");
// }
// }

// private static void Lack() throws FileNotFoundException, IOException {
// FileInputStream file = new FileInputStream(new File("C:\\Users\\nurma\\Downloads\\Aki_Store.xlsx"));
// XSSFWorkbook workbook = new XSSFWorkbook(file);
// XSSFSheet sheet = workbook.getSheetAt(0);
// Iterator<Row> rowIterator = sheet.iterator();
// while (rowIterator.hasNext()) {
//     Row row = rowIterator.next();
//     var amount = row.getCell(2);
//     if (amount != null && amount.getNumericCellValue() == 0) {
//         Cell name = row.getCell(0);
//         Cell serialN = row.getCell(1);
//         if (name == null || serialN == null) break;
//         System.out.print(name.getStringCellValue() + "\t" + serialN.getNumericCellValue() + "\n");
//     }
// }
// file.close();
// }

// private static void Discount() throws FileNotFoundException, IOException {
// FileInputStream file = new FileInputStream(new File("C:\\Users\\nurma\\Downloads\\Aki_Store.xlsx"));
// XSSFWorkbook workbook = new XSSFWorkbook(file);
// XSSFSheet sheet = workbook.getSheetAt(0);
// Iterator<Row> rowIterator = sheet.iterator();
// while (rowIterator.hasNext()) {
//     Row row = rowIterator.next();
//     var amount = row.getCell(3);
//     amount.setCellType(CellType.STRING);
//     if (amount.getStringCellValue().equals("0%")) {
//         continue;
//     } else {
//         for (var colIndex = 0; colIndex < 4; colIndex++) {
//             if (colIndex == 1) {
//                 continue;
//             }
//             Cell cell = row.getCell(colIndex);
//             switch (cell.getCellType()) {
//                 case NUMERIC:
//                     System.out.printf("%.0f", cell.getNumericCellValue());
//                     System.out.print("\t\t");
//                     break;
//                 case STRING:
//                     System.out.print(cell.getStringCellValue() + "\t\t");
//                     break;
//             }
//         }
//         System.out.println();
//     }
// }
// file.close();
// }

// private static void Delete() {
// String path = "D:\\JAVA\\testProject\\zkz.txt";
// try {
//     BufferedReader reader = new BufferedReader(new FileReader(path));
//     int count = 0;
//     String letter = "";
//     Scanner input = new Scanner(System.in);
//     System.out.print("Введите-->");
//     String delThing = input.next();
//     Scanner scanner = new Scanner(new File("D:\\JAVA\\testProject\\zkz.txt"));
//     boolean haveIt = false;
//     while (scanner.hasNextLine()) {
//         String line = scanner.nextLine();
//         count++;
//         if (line.contains(delThing)) {
//             haveIt = true;
//             break;
//         }
//     }
//     if (haveIt == false) {
//         System.out.println("Такой техники нет в файле.");
//         System.out.print("Желаете выйти[0] или повторить[1]?-->");
//         int ask = input.nextInt();
//         if (ask == 1) {
//             Delete();
//         } else if (ask == 0) {
//             Menu();
//         }
//     }
//     var skipIndex = 0;
//     while (reader.ready()) {
//         skipIndex++;
//         if (skipIndex != count) {
//             letter += reader.readLine() + "\n";
//         } else {
//             reader.readLine();
//         }
//     }
//     System.out.println(letter);
//     reader.close();
// } catch (IOException e) {
//     System.out.println(e);
// } finally {
//     System.out.println("Был показан обновленный список заказанной техники на данный момент.");
// }
// }

// private static void exit() {
// System.exit(0);
// }

// public static void deliverymanActions() throws IOException {
// {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Меню:");
//     System.out.println("(1)Список бытовой техники для доставки.");
//     System.out.println("(2)Доставленная бытовая техника.");
//     System.out.println("(3)Доставить бытовую технику.");
//     System.out.println("(4)Количество доставленной бытовой.");
//     System.out.println("(5)Количество заказанной бытовой техники.");
//     System.out.println("(6)Мой заработок.");
//     System.out.println("(0)Выход");
//     do {
//         System.out.print("Ваш выбор: ");
//         String chooseAction = sc.nextLine();
//         switch (chooseAction) {
//             case "n":
//                 try {
//                     SignIn.chooseUsers();
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//             case "action1":
//             case "Action1":
//             case "1":
//                 //СПИСОК ЗАКАЗАННОЙ ТЕХНИКИ.
//                 try (BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\testProject\\kol.txt"))) {
//                     String line = null;
//                     while ((line = br.readLine()) != null) {
//                         System.out.println(line);
//                     }
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//                 deliverymanActions();
//                 break;

//             case "action2":
//             case "Action2":
//             case "2":
//                 //СПИСОК ДОСТАВЛЕННОЙ ТЕХНИКИ.
//                 try (BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\testProject\\kol.txt"))) {
//                     String line = null;
//                     while ((line = br.readLine()) != null) {
//                         System.out.println(line);
//                     }
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//                 deliverymanActions();
//                 break;

//             case "action3":
//             case "Action3":
//             case "3":
//                 System.out.println("Действие 3");
//                 //--ДОСТАВИТЬ ЗАКАЗ--
//                 ArrayList<String> appliances = new ArrayList<String>(); // Для доставки
//                 try (BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\testProject\\zkz.txt"))) {
//                     String line = null;
//                     while ((line = br.readLine()) != null) {
//                         appliances.add(line);
//                     }
//                     System.out.println(appliances);
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }

//                 try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JAVA\\testProject\\zkz.txt", true))) {
//                     String i = "";
//                     bw.write(i);
//                     if (i.equals(i)) {
//                         bw.close();
//                     }
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//                 try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JAVA\\testProject\\kol.txt", true))) {
//                     int i = 0;
//                     while (i <= appliances.size()) {
//                         if (i == appliances.size()) {
//                             bw.close();
//                             System.out.println("Доставлено!");
//                             break;
//                         } else {
//                             bw.newLine();
//                             bw.write(appliances.get(i));
//                             i++;
//                         }
//                     }
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//                 deliverymanActions();
//                 break;

//             case "action4":
//             case "Action4":
//             case "4":
//                 //--КОЛ-ВО ДОСТАВЛЕННОЙ БЫТ.ТЕХНИКИ--
//                 try {

//                     File myFile = new File("D:\\JAVA\\testProject\\kol.txt");
//                     FileReader fileReader = new FileReader(myFile);
//                     LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

//                     int lineNumber = 0;

//                     while (lineNumberReader.readLine() != null) {
//                         lineNumber++;
//                     }

//                     System.out.println(lineNumber);

//                     lineNumberReader.close();

//                     String lineNumber1 = String.valueOf(lineNumber);
//                     File newFile = new File("C:\\Users\\nurma\\OneDrive\\Desktop\\mid-tehnika-kol.txt");
//                     FileWriter fileWriter = new FileWriter(newFile);
//                     fileWriter.write(lineNumber1 + " Строк в файле: " + "D:\\JAVA\\testProject\\kol.txt");
//                     fileWriter.close();
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//                 deliverymanActions();
//                 break;


//             case "action5":
//             case "Action5":
//             case "5":
//                 //--КОЛ-ВО ЗАКАЗАННОЙ БЫТ.ТЕХНИКИ--
//                 try {

//                     File myFile = new File("D:\\JAVA\\testProject\\zkz.txt");
//                     FileReader fileReader = new FileReader(myFile);
//                     LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

//                     int lineNumber = 0;

//                     while (lineNumberReader.readLine() != null) {
//                         lineNumber++;
//                     }

//                     System.out.println(lineNumber);

//                     lineNumberReader.close();

//                     String lineNumber1 = String.valueOf(lineNumber);
//                     File newFile = new File("C:\\Users\\nurma\\OneDrive\\Desktop\\mid-tehnika-kol.txt");
//                     FileWriter fileWriter = new FileWriter(newFile);
//                     fileWriter.write(lineNumber1 + " Строк в файле: " + "C:\\D:\\JAVA\\testProject\\zkz.txt");
//                     fileWriter.close();
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//                 deliverymanActions();
//                 break;

//             case "action6":
//             case "Action6":
//             case "6":
//                 int count = 0;

//                 try {
//                     // create a new file object
//                     File file = new File("D:\\JAVA\\testProject\\kol.txt");

//                     // create an object of Scanner
//                     // associated with the file
//                     Scanner mn = new Scanner(file);

//                     // read each line and
//                     // count number of lines
//                     while (mn.hasNextLine()) {
//                         mn.nextLine();
//                         count++;
//                     }
//                     System.out.println("Total Number of Delivered techniques: " + count);
//                     System.out.println("Your Earnings: " + count * 2000);
//                     // close scanner
//                     mn.close();
//                 } catch (Exception e) {
//                     e.getStackTrace();
//                 }

//                 deliverymanActions();
//                 break;

//             default:
//                 System.out.println("Такого действия нет в программе!");
//                 deliverymanActions();
//                 break;

//             case "action0":
//             case "Action0":
//             case "0":
//                 System.out.println("Выход");
//                 break;

//         }
//         break;
//     } while (true);
//   }
//}
}
