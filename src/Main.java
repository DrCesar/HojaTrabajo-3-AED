/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;

/**
 *
 * @author wadeowen
 */
public class Main {
    
    
    public static void main(String[] args) throws UnsupportedEncodingException{
        String path = Main.class.getResource("Main.class").getFile();
        path = URLDecoder.decode(path, "UTF-8");
        Calculadora calc = new Calculadora();;
        Scanner scan = new Scanner(System.in);
        

        try(BufferedReader buff = new BufferedReader(new FileReader(path.substring(0,path.indexOf("Main"))+"/expresion.txt"))) {
            
            String linea ;
            
            while ((linea = buff.readLine()) != null){
                System.out.println("Ingrese el tipo de Stack que desea usar.(Lista, Array, Vector)");
                calc.setTipo(scan.nextLine());
                calc.preCalc(linea);
                calc.infixToPostfix();
                System.out.println(calc.getInfix());
                System.out.println("El resultado es: "+calc.getResultado());
            }
            
        } catch(IOException e){
            e.printStackTrace();
        }

    }
    
}
