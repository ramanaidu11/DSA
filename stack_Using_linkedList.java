package Stacks_And_Queues.Implementation;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class StackLL{
    Node top;
    int size;
    StackLL(){
        top=null;
        size=0;
    }
    public void push(int ele){
        Node newNode=new Node(ele);
        newNode.next=top;
        top=newNode;
        size++;
    }
    public int pop(){
        if(top==null){
            System.out.print("Stack underflow");
            return -1;
        }
        Node temp=top.next;
        int ele=top.data;
        top.next=null;
        top=temp;
        size--;
        return ele;
    }
    public void display(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public int peek(){
        if(size==0){
            return -1;
        }
        return top.data;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0)?true:false;
    }
}
public class stack_Using_linkedList {
    public static void main(String[] args){

        StackLL st = new StackLL();

        st.push(10);
        st.push(20);
        st.push(30);

        st.display();
        System.out.println(" ");
        System.out.println(st.pop());

        System.out.println(st.peek());

        System.out.println(st.size());

        System.out.println(st.isEmpty());
    }
}
