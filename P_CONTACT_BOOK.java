import java.util.ArrayList;
import java.util.Scanner;

public class P_CONTACT_BOOK {



    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> names = new ArrayList<>();
    static ArrayList<String> phones = new ArrayList<>();




//--------------------------------------------------------------------------------------------------------------------------------------------------


    public static void main(String[] args) {

        names.add("NISHANT DHANANI");
        phones.add("9797979797");

        names.add("HELLO");
        phones.add("4444444444444");


        System.out.println("____________WELCOME,THIS IS CONTACT BOOK CLI____________");
        while (true) {
            System.out.println("""
                    -----------------------------------------------
                    WHAT DO YOU WANT??
                    1-ADD CONTACT
                    2-SEARCH CONTACT
                    3-COUNT CONTACTS
                    4-SHOW ALL CONTACTS
                    5-DELETE CONTACT
                    6-EXIT
                    
                    ENTER YOUR CHOICE : """);


            byte enteredChoice = sc.nextByte();
            sc.nextLine();

            switch (enteredChoice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    searchContact();
                    break;
                case 3:
                    countContact();
                    break;
                case 4:
                    showAllContact(0);
                    break;
                case 5:
                    deleteContact();
                    break;
                case 6:
                    sc.close();
                    System.out.println("GOOD BYE");
                    return;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------
    public static void addContact(){

        System.out.print("ENTER CONTACT HERE : ");
        String name = sc.nextLine();


        System.out.print("ENTER NUMBER HERE : ");
        String phone = sc.nextLine();
        names.add(name);
        phones.add(phone);

        System.out.println("YOUR CONTACT SAVED SUCCESSFULLY");
        System.out.println();
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------


//--------------------------------------------------------------------------------------------------------------------------------------------------
    public static void showAllContact(int index){

        if(names.isEmpty()){
            System.out.println("NO CONTACT FOUND!");
            return;
        }
        if(index==0) {
            System.out.println("ALL CONTACT LIST");
        }
        if ((index>=names.size())){
            return;
        }
        System.out.println((index+1) + ". "+ names.get(index) +"-"+ phones.get(index));
        showAllContact(index+1);
        System.out.println();

    }
//--------------------------------------------------------------------------------------------------------------------------------------------------


//--------------------------------------------------------------------------------------------------------------------------------------------------
    public static void searchContact(){

        System.out.print("SEARCH CONTACT : ");
        String searchName = sc.nextLine();
        boolean found = false;

        for (int i=0;i< names.size();i++){
            if (names.get(i).equalsIgnoreCase(searchName)){
                System.out.println("FOUNDED CONTACT : "+names.get(i)+" - "+phones.get(i));
                found = true;
            }
        }
        if(!found) {
            System.out.println("NO CONTACT FOUND!");
        }
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------------------------------------------------
    public static void countContact(){

        System.out.print("COUNTED CONTACT : "+ names.size());
        System.out.println();
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------------------------------------------------
    public static void deleteContact(){

        System.out.print("ENTER CONTACT FOR DELETE : ");
        String deleteName = sc.nextLine();

        boolean found=false;
        for (int i =0;i< names.size();i++){
            if (names.get(i).equalsIgnoreCase(deleteName)){
                names.remove(i);
                phones.remove(i);
                System.out.println("CONTACT DELETED SUCCESSFULLY.!");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("NO CONTACT FOUND!");
        }



    }
//--------------------------------------------------------------------------------------------------------------------------------------------------





}
