//  Authors: Martin Vaughan - 16158431;
//           Brian Shanahan - 17218829;
//           Daniel Clarke  - 18249736;

public class SheetsDriver {
    public static void main(String[] args) {
        
        Sheets myWorkBook = new Sheets();
        System.out.println("Current Contents...");
        System.out.println("");
        myWorkBook.display();
        
        System.out.println("");
        System.out.println("Adding Items");
        myWorkBook.add();
        System.out.println("Current Contents...");
        System.out.println("");
        myWorkBook.display();
        
        System.out.println("");
        System.out.println("Removing Items");
        myWorkBook.remove("Sheet1");
        System.out.println("Current Contents...");
        System.out.println("");
        myWorkBook.display();
        
        System.out.println("");
        System.out.println("Adding Items");
        myWorkBook.add();
        System.out.println("Current Contents...");
        System.out.println("");
        myWorkBook.display();
        
        System.out.println("");
        System.out.println("Removing Items");
        myWorkBook.remove(2);
        System.out.println("Current Contents...");
        System.out.println("");
        myWorkBook.display();
        
        System.out.println("");
        System.out.println("Sheet Name at Position N is...");
        myWorkBook.SheetName(2);
        System.out.println("");
        System.out.println("Array Length is...");
        myWorkBook.length();
        
        System.out.println("");
        System.out.println("Moving Sheet");
        myWorkBook.move("Sheet2", "Sheet5", true);
        System.out.println("Current Contents...");
        System.out.println("");
        myWorkBook.display();
        
        System.out.println("");
        System.out.println("Moving Sheet");
        myWorkBook.move( 0, 2, false);
        System.out.println("Current Contents...");
        System.out.println("");
        myWorkBook.display();
        
        System.out.println("");
        System.out.println("Renaming Sheet");
        myWorkBook.rename("Sheet5","Sheet10");
        System.out.println("Current Contents...");
        System.out.println("");
        myWorkBook.display();
        
        System.out.println("");
        System.out.println("Adding Items");
        myWorkBook.add();
        System.out.println("Current Contents...");
        System.out.println("");
        myWorkBook.display();
        
        System.out.println("");
        System.out.println("Adding Items");
        myWorkBook.add();
        System.out.println("Current Contents...");
        System.out.println("");
        myWorkBook.display();
        
        System.out.println("");       
        System.out.println("Moving to End");
        myWorkBook.moveToEnd(0);
        System.out.println("Current Contents...");
        System.out.println("");
        myWorkBook.display();
        
        System.out.println("");       
        System.out.println("Adding Items");
        myWorkBook.add();
        System.out.println("Current Contents...");
        System.out.println("");
        myWorkBook.display();
        
        System.out.println("");       
        System.out.println("Moving to End");
        myWorkBook.moveToEnd("sheet6");
        System.out.println("Current Contents...");
        myWorkBook.display();
        System.out.println("");
    }
}