
class library{
    private String[] availBook = new String[100]; 
    private String[] issBook = new String[100];
    private int i = 0;
    library(String ...arr){
    for(String str : arr){
            availBook[i] = str;
            i++;
        }
    }



    public void addBook(String str){
        for(int i = 0;i<availBook.length;i++){
        if(availBook[i] == null){
        availBook[i] = str;
        break;}
    }
    }
    public void issuBook(String str){
        for(int i = 0;i<issBook.length;i++){
        if(issBook[i] == null){
        issBook[i] = str;
        break;}
    }
    }
    public void issueBook(String str){
            issuBook(str);
            for(int i = 0;i<availBook.length;i++){
                if(str == availBook[i]){
                for(int j = i;j<availBook.length - i;j++){
                    availBook[j] = availBook[j+1];
                }
                }
            }
    
    }
    
    public void returnBook(String str){
        addBook(str);
        for(int i = 0;i<issBook.length;i++){
            if(str == issBook[i]){
            for(int j = i;j<issBook.length-1;j++){
                issBook[j] = issBook[j+1];
            }
            }
        }
    }

    public void showAvailableBook(){
        System.out.println("Available Books -: ");
        for(int i = 0;i<availBook.length;i++){
            if(availBook[i] != null)
            System.out.println((i+1) + " : " +availBook[i]);
        }
    }
    public void showIssuedBook(){
        System.out.println("Issued Books -: ");
        if(issBook[0] == null){
            System.out.println("Empty...");
        }
        for(int i = 0;i<issBook.length;i++){
            if(issBook[i] != null)
            System.out.println((i+1) + " : " +issBook[i]);
        }
    }

}

public class Exercise4_onlineLibrary {
    public static void main(String[] args) {
        library lib = new library("a","b","c","d");
        lib.addBook("j");
        lib.showAvailableBook();
        lib.issueBook("d");
        lib.showAvailableBook();
        lib.returnBook("d");
        lib.showAvailableBook();
    }
    }

