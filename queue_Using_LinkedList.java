package Stacks_And_Queues.Implementation;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class queueLL{
    Node start;
    Node end;
    int size;
    queueLL(){
        start=null;
        end=null;
        size=0;
    }
    public void push(int ele){
        Node newNode=new Node(ele);
        if(size==0){
            start=newNode;
            end=newNode;
            size++;
            return;
        }
        end.next=newNode;
        end=newNode;
        size++;
    }
    public int pop(){
        if(size==0){
            System.out.print("queue overflow");
        }
        Node temp=start.next;
        int ele=start.data;
        start.next=null;
        start=temp;
        size--;
        if(size==0){
            start=null;
            end=null;
        }
        return ele;
    }
    public void display(){
        Node temp=start;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public int peek(){
        if(end==null){
            return -1;
        }
        return start.data;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0)?true:false;
    }
}
public class queue_Using_LinkedList {
    public static void main(String[] args){

        queueLL q = new queueLL();

        q.push(10);
        q.push(20);
        q.push(30);

        q.display();
        System.out.println(" ");
        System.out.println(q.pop());

        System.out.println(q.peek());

        System.out.println(q.size());

        System.out.println(q.isEmpty());
    }
}
