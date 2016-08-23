/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */
public interface iStack<T>{
    
    public void push(T c);
    public T pop();
    public T top();
    public boolean empty();
    
}
