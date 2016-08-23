
import java.util.ArrayList;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */
public class StackVector<T> implements iStack<T> {
    
    
    private int sp;
    private  Vector<T> stack;
    
    
    public StackVector(){
        stack = new Vector<>(500);
        sp = 0;
    }
    
    @Override
    public void push(T c){
        stack.add(sp,c);
        sp++;
    }
    
    
    @Override
    public T pop(){
        sp--;
        return stack.get(sp);
    }
    
    
    @Override
    public T top(){
        return stack.get(sp -1);
    }
    
    @Override
    public boolean empty(){
        if(sp == 0){
            return true;
        } else{
            return false;
        }
    }
    
}
