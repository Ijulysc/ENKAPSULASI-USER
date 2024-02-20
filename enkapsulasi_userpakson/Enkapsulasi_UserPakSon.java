package enkapsulasi_userpakson;

public class Enkapsulasi_UserPakSon {
    
    
    public static void main(String[] args) {
        // membuat objek dari class User
User ijul = new User("Ijul","yupy",2,false);

// menggunakan method setter
//ijul.setUsername("rafael");
//ijul.setPassword("ryuki");
//ijul.setID(3);
//ijul.setStatus(false);

// menggunakan method getter
System.out.println("Username: " + ijul.getUsername());
System.out.println("Password: " + ijul.getPassword());
        System.out.println("Id: " + ijul.getID());
        System.out.println("Status: " + ijul.getStatus());
        
    }
    
}
