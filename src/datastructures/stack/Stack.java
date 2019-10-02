package datastructures.stack;

import exceptions.OverflowException;
import exceptions.UnderflowException;

public class Stack<T extends Character> {

    public static void main(String [] args) throws OverflowException, UnderflowException {
        Stack augmend = new Stack(10);
        augmend.push('{');
        augmend.push('(');
        augmend.push('[');
        System.out.println(augmend.pop());
        System.out.println(augmend.pop());
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

    /**
     * pops last element in stack`
     * @return
     * @throws UnderflowException
     */
    public Character pop() throws UnderflowException {
        if (pointer < 0)
            throw new UnderflowException("Stack overflow");
        return array[pointer--];
    }


    /**
     * method peeks into last elemnent in stack
     */
    public Character peek() throws UnderflowException {
        if(pointer < 0)
            throw new UnderflowException("Stack overflow");
        return array[pointer];
    }

}
