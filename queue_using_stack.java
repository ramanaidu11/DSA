package Stacks_And_Queues.Implementation;

import java.util.Stack;

class QueueUsingStack{

    Stack<Integer> s1 = new Stack<>();

    Stack<Integer> s2 = new Stack<>();

    public void push(int ele){

        while(!s1.isEmpty()){

            s2.push(s1.pop());
        }

        s1.push(ele);

        while(!s2.isEmpty()){

            s1.push(s2.pop());
        }
    }

    public int pop(){

        if(s1.isEmpty()){

            System.out.println("Stack Underflow");

            return -1;
        }

        return s1.pop();
    }

    public int peek(){

        if(s1.isEmpty()){

            return -1;
        }

        return s1.peek();
    }

    public int size(){

        return s1.size();
    }

    public boolean isEmpty(){

        return s1.isEmpty();
    }

    public void display(){

        System.out.println(s1);
    }
}

public class queue_using_stack {

    public static void main(String[] args){

        QueueUsingStack st = new QueueUsingStack();

        st.push(10);

        st.push(20);

        st.push(30);

        st.display();

        System.out.println(st.pop());

        System.out.println(st.peek());

        System.out.println(st.size());

        System.out.println(st.isEmpty());
    }
}