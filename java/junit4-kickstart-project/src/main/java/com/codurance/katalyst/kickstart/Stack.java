package com.codurance.katalyst.kickstart;

import com.codurance.katalyst.kickstart.exceptions.EmptyStackException;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private List<Object> listOfObjects = new ArrayList<>();

    public boolean isEmpty(){
        return listOfObjects.isEmpty();
    }

    public void push(Object obj){
        listOfObjects.add(obj);
    }

    public Object pop() throws EmptyStackException {
        try{
            return listOfObjects.get(listOfObjects.size() - 1);
        }catch(IndexOutOfBoundsException e) {
            throw new EmptyStackException("The list is empty");
        }
    }

}