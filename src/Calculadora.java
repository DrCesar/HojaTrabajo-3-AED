/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author wadeowen
 */
public class Calculadora {
    

    private iStack<Integer> numbers;
    private String infix;
    private String resultado;
    private Factory fabrica = new Factory();
    private String tipo;
    
    public Calculadora(){
        
    }
    
    public void preCalc(String s){
        infix = s;
        resultado = "4";
        numbers = fabrica.getStack(tipo);
    }
    
    public void infixToPostfix(){
        int i = 0;
        
        while(i< infix.length()){
            switch(infix.charAt(i)){
                case ' ':
                case '(':
                case ')':
                    i++;
                    break;
                case '+':
                    numbers.push( (int)numbers.pop() + (int)numbers.pop() );
                    i++;
                    break;
                case '-':
                    numbers.push( -(int)numbers.pop() + (int)numbers.pop() );
                    i++;
                    break;
                case '*':
                    numbers.push( (int)numbers.pop() * (int)numbers.pop() );
                    i++;
                    break;
                case '/':
                    numbers.push( 1/(int)numbers.pop() + (int)numbers.pop() );
                    i++;
                    break;
                default:
                    numbers.push(Integer.parseInt( Character.toString( infix.charAt(i) ) ));
                    i++;
                    break;
            }
        }
        
        resultado = Integer.toString((int)numbers.pop());
    }
    
    public String getResultado(){
        return resultado;
    }
    
    public String getInfix(){
        return infix;
    }
    
    public void setTipo(String s){
        tipo = s.toLowerCase();
    }
    
    
}
