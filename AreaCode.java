import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ezekwesili chukwuebuka
 */
public class AreaCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a phone number in the form (555)-555-5555: ");
        String phoneNumber = scanner.nextLine();
        String areaCode = phoneNumber.substring(1, 4);
        System.out.println("The area code is: " + areaCode);
    }

}
    

