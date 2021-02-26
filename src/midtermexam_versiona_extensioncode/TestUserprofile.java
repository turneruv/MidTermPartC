/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author ruvon
 */
import java.util.Scanner;
public class TestUserprofile{   
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name=in.nextLine();
        System.out.println("Enter your favourite genre? "
                + "Comedy,Drama,Action,Mystery");
        String genre=in.nextLine();
        UserProfile user=new UserProfile(name,genre);
        System.out.println("Your user profile was created");
    
    
    
    
    
    
    }
}
