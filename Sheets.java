//  Authors: Martin Vaughan - 16158431;
//           Brian Shanahan - 17218829;
//           Daniel Clarke  - 18249736;

public class Sheets {
    private String[] tabs;   
    private int nextPosition;  
    private int tabN;          

    public Sheets() {
        tabs = new String[256];
        
        for(int i=0; i < 3; i++) {
            tabs[i] = new String("Sheet"+(i+1));
        }
        nextPosition = 3;
        tabN = 4;         
    }

    public Sheets(int capacity) {
        if(capacity < 3) {
            capacity = 3;
        }
        tabs = new String[capacity];
        for(int i=0; i < 3; i++) {  
            tabs[i] = new String("Sheet"+(i+1));
        }
        nextPosition = 3;
        tabN = 4;         
    }

    public boolean add() {
        if(nextPosition < tabs.length) {
            while(indexOf("Sheet"+tabN) != -1) {
                tabN++;
            }
            tabs[nextPosition] = "Sheet" + tabN;
            nextPosition++;
            return true;
        }
        return false;
    }

    public void display() {
        for(int i=0; i < nextPosition; i++) {
            System.out.println("Position " + i + " is named " + tabs[i]);
        }
    }

    public int indexOf(String searchName) {
        int i;
        
        for(i=0; i < nextPosition ; i++) {
            if(tabs[i].compareToIgnoreCase(searchName) == 0) {
                return i;
            }
        }
        return -1;
    }
    
    public int move(String from, String to, boolean before) {
        int fromIndex = indexOf(from);
        int toIndex = indexOf(to);
        String temp = tabs[fromIndex];
        
        if (before == true) {
            for (int i = fromIndex; i < toIndex; i++) {
                tabs[i] = tabs[i + 1];
            }
            tabs[toIndex - 1] = temp;
        }
        if (before == false) {
            for (int i = fromIndex; i < toIndex; i++) {
                tabs[i] = tabs[i + 1];
            }
            tabs[toIndex++] = temp;
        }
        return -1;
    }

    public String move(int from, int to, boolean before) {
        int fromIndex = from;
        int toIndex = to;
        String temp = tabs[fromIndex];

        if (before == true) {
            for (int i = fromIndex; i < toIndex; i++) {
                tabs[i] = tabs[i + 1];
            }
            tabs[toIndex - 1] = temp;
        }
        if (before == false) {
            for (int i = fromIndex; i < toIndex; i++) {
                tabs[i] = tabs[i + 1];
            }
            tabs[toIndex++] = temp;
        }
        return null;
    }
   
    public int remove(String SearchName) {
        int indexPos = 0;
        int x = 0;
        
        for(x=0; x < nextPosition ; x++) {
            if(tabs[x].compareToIgnoreCase(SearchName) == 0) {
                indexPos = x;
            }
        }
        for(int i  = indexPos; i< nextPosition - 1; i ++)
        {
            tabs[i] = tabs[i+1];   
        }
        nextPosition--; 
        return -1;
    }

    public String remove(int SheetNumber) {
        String SheetName = "Sheet"+SheetNumber;
        int d = SheetNumber;
        String target = "Sheet"+ d;
        
        for(String i = target; d < nextPosition - 1; d ++){
        
            tabs[d] = tabs[d+1];
        }
        nextPosition--;
        return SheetName;
    }
    
    public void SheetName(int i) {
        System.out.println(tabs[i]);
    }

    public void length() {
        int Index = 0;
        
        for (int x=0; x<=tabs.length-1; x++) {
            if (tabs[x]!=null) {
                Index = x;
            } 
        }
        System.out.println(Index);
    }
    
    public int rename(String oldName,String newName){    
        int var = -1;
        
        for(int i = 0;i < nextPosition;i++) {
            if(tabs[i].compareToIgnoreCase(oldName) == 0) {
                var = i;
                tabs[i] = newName;
            }            
        }
        return var;
    }
    
    public String moveToEnd(int target){   
        tabs[nextPosition] = tabs[target];
        int fromIndex = target;
        int toIndex = nextPosition;
        String temp = tabs[fromIndex];  
        
        for (int i = fromIndex; i < toIndex; i++) {
                tabs[i] = tabs[i + 1];
        }
        tabs[toIndex - 1] = temp;
        return tabs[target];
    }
    
    public int moveToEnd(String target){    
        int targetIndex = 0;
        int toIndex = nextPosition;
    
        for(int i=0; i < nextPosition ; i++) {
            if(tabs[i].compareToIgnoreCase(target) == 0) {
                targetIndex = i;
            }
        }
        String temp = tabs[targetIndex];
        for (int i = targetIndex; i < toIndex; i++) {
                tabs[i] = tabs[i + 1];
            }
        tabs[toIndex - 1] = temp;           
        return -1;
    }
}
