package Stacks_And_Queues.Implementation;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue{

    Queue<Integer> q = new LinkedList<>();

    public void push(int x){

        q.offer(x);

        int size = q.size();

        for(int i = 0; i < size - 1; i++){

            q.offer(q.poll());
        }
    }

    public int pop(){

        if(q.isEmpty()){

            System.out.println("Stack Underflow");

            return -1;
        }

        return q.poll();
    }

    public int peek(){

        if(q.isEmpty()){

            return -1;
        }

        return q.peek();
    }

    public int size(){

        return q.size();
    }

    public boolean isEmpty(){

        return q.isEmpty();
    }

    public void display(){

        System.out.println(q);
    }
}

public class stack_using_queue {

    public static void main(String[] args){

        StackUsingQueue st = new StackUsingQueue();

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