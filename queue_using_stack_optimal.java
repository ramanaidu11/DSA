package Stacks_And_Queues.Implementation;

import java.util.Stack;

class QueueUsingStack{

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int x){

        s1.push(x);
    }

    public int pop(){

        if(isEmpty()){

            System.out.println("Queue Underflow");

            return -1;
        }

        while(s1.size() > 1){

            s2.push(s1.pop());
        }

        int removed = s1.pop();

        while(!s2.isEmpty()){

            s1.push(s2.pop());
        }

        return removed;
    }

    public int peek(){

        if(isEmpty()){

            return -1;
        }

        while(s1.size() > 1){

            s2.push(s1.pop());
        }

        int front = s1.peek();

        s2.push(s1.pop());

        while(!s2.isEmpty()){

            s1.push(s2.pop());
        }

        return front;
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

public class queue_using_stack_optimal {

    public static void main(String[] args){

        QueueUsingStack q = new QueueUsingStack();

        q.push(10);
        q.push(20);
        q.push(30);

        q.display();

        System.out.println(q.pop());

        System.out.println(q.peek());

        System.out.println(q.size());

        System.out.println(q.isEmpty());
    }
}