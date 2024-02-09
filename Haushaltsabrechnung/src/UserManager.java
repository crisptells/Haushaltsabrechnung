import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    BufferedReader bf;
    BufferedWriter pw;

    public UserManager() throws IOException {
        
    }

    public boolean loginUser(String username, String password) throws IOException {
        bf = new BufferedReader(new FileReader("/Users/I539230/Documents/VS Code projects/Haushaltsabrechnung_private/Users.txt"));
        String line = bf.readLine();

        while (line != null) {
            String[] array = line.split(":");
            if (array[0].equals(username) && array[1].equals(password)) {
                return true;
            } 
            line = bf.readLine();
        }
        return false;
    }

    public void createUser(String username, String password) throws IOException {
        pw = new BufferedWriter(new FileWriter("Users.txt", true));
        bf = new BufferedReader(new FileReader("/Users/I539230/Documents/VS Code projects/Haushaltsabrechnung_private/Users.txt"));
        //get current users
        List<String> lines = new ArrayList<String>();
        String line = bf.readLine();
        while (line != null) {
            lines.add(line);
            line = bf.readLine();
        }
        //add new user
        lines.add(username + ":" + password);
        //save new user
        for (String row:lines) {
            pw.write(row);
            pw.newLine();
        }
        pw.close();
        System.out.println(ConsoleColors.RED + "Benutzer angelegt!" +ConsoleColors.RESET + "✅");
    }

    public void deleteUser(String username, String password) throws IOException {
        pw = new BufferedWriter(new FileWriter("Users.txt", true));
        bf = new BufferedReader(new FileReader("/Users/I539230/Documents/VS Code projects/Haushaltsabrechnung_private/Users.txt"));
         //get current users
         List<String> lines = new ArrayList<String>();
         String line = bf.readLine();
         while (line != null) {
            if (line.contains(username) && line.contains(password)) {
                System.out.println("User deleted");
            } else {
                lines.add(line);
            }
         }
         //save remaining users
         for (String row:lines) {
             pw.write(row);
             pw.newLine();
         }
         pw.close();
    }
}
