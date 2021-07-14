package com.codurance.katalyst.kickstart;

import com.codurance.katalyst.kickstart.exceptions.EmptyStackException;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class StackShould {

    private Object object_1 = new Object();
    private Object object_2 = new Object();
    private Stack myStack;

    @Test
    public void push_an_element(){
        // Given
        Stack myStack = new Stack();
        // When
        myStack.push(object_1);
        // Then
        assertThat(myStack.isEmpty()).isFalse();
    }
    @Before
    public void initialise(){
        myStack = new Stack();
    }

    @Test
    public void pop_an_element() throws EmptyStackException {
        // Given
        Stack myStack = new Stack();
        Object object_1 = new Object();
        myStack.push(object_1);
        // When
        Object result = myStack.pop();
        // Then
        assertThat(result).isEqualTo(object_1);
    }

    @Test
    public void pop_last_element() throws EmptyStackException {
        // Given
        Stack myStack = new Stack();
        myStack.push(object_1);
        myStack.push(object_2);
        // When
        Object result = myStack.pop();
        // Then
        assertThat(result).isEqualTo(object_2);
    }

    @Test (expected = EmptyStackException.class)
    public void pop_an_element_with_empty_stack() throws EmptyStackException {
        // Given
        Stack myStack = new Stack();
        // When
        Object result = myStack.pop();

    }

}
