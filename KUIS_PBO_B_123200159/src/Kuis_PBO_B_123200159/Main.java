/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis_PBO_B_123200159;

/**
 * Bahar Prawira Nugraha | 123200159
 * @author Lenovo
 */
public class Main {
    public static void printhewan(Animal animal) {      
        System.out.print(animal.getName() + " adalah " + animal.getType() + " dengan bunyi ");animal.sound();  
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Animals ml = new Animals ("ml", "macan", "p");
        Animals ml2 = new Animals ("ml", "macan", "pp");
        Animals k =  new Animals ("k", "kambing", "k");
        Animals a =  new Animals ("a", "ayam", "a");
        printhewan(ml);
        printhewan(ml2);
        printhewan(k);
        printhewan(a);
    }
    
}
