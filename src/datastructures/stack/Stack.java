package datastructures.stack;

import exceptions.OverflowException;

import java.lang.reflect.Array;

public class Stack<T extends Character> {

    public static void main(String [] args) throws OverflowException {
        Stack augmend = new Stack(10);
        augmend.push('{');
        if(augmend.isEmpty())
            System.out.println("Stack is currently unfilled");
    }

    private int max = 1000;
    private Character[] array;
    private int pointer = -1;

    public Stack(int max){
        array = new Character[max];
    }

    /**
     *Checks if stack is empty
     * @return
     */
    public boolean isEmpty(){
        return pointer < 0;
    }

    /**
     * method push adds elmement to the top
     * of the stack
     */
    public void push(T element) throws OverflowException {
            if (array.length - 1 == pointer)
                throw new OverflowException("Stack overflow");
            array[++pointer] = element;
    }





}
