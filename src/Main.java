import java.util.*;
public class Main {
   int number;
    String firstName;
    String lastName;

    Main(int number, String firstName, String lastName) {
        this.number = number;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    Main(){

    }
    static Main create(Main v, int n, String f, String l) {
        v.number =n;
        v.firstName = f;
        v.lastName = l;
     return v;
    }
    static void read(Main c){
        System.out.print(c);
    }

    static void update(Main b) {
        Scanner i = new Scanner(System.in);
        b.number = i.nextInt();
    }

    static void delete(Main c) {
        c = null;
    }

    public static void main(String[] args) {
        LinkedList<Main> contacts = new LinkedList<Main>();
        Main contact1 = new Main(77777,"Xcho","Vardanyan");
        Main contact2 = new Main(99999,"Gago","Karapetyan");
        Main contact3 = new Main(55555,"Miqayel","Xazaryan");
        Main contact4 = new Main();
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
    }
}
