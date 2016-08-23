
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 * @param <T>
 */
public class StackLista<T> implements iStack<T>{
    
    
    private LinkedList raiz;
    
    
    public StackLista(){
        raiz = new LinkedList();
    }
    
    @Override
    public void push(T c){
        raiz.addLast(c);
    }
    
    
    @Override
    public T pop(){
        return (T)raiz.removeLast();
    }
    
    
    @Override
    public T top(){
        return (T)raiz.getLast();
    }
    
    @Override
    public boolean empty(){
        if(raiz.size() == 0){
            return true;
        } else{
            return false;
        }
    }
    
    
}
