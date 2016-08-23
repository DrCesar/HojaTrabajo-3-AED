/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */
public class Factory extends AbstractFactory {
    


    public iStack getStack(String s) {
        System.out.println(s);
        switch(s){
            case "lista":
                return new StackLista();
            case "array":
                return new StackArray();
            case "vector":
                return new StackVector();
        } 
        return new StackLista();
    }
    
}
