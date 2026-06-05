package Stacks_And_Queues.Implementation;
class Queue{
    int[] q;
    int start;
    int end;
    int size;
    int currsize;
    Queue(int size){
        this.size=size;
        q=new int[size];
        start=-1;
        end=-1;
        currsize=0;
    }
    public void push(int ele){
        if(currsize==size){
            System.out.print("Over Flow");
            return;
        }
        if(start==-1&&end==-1){
            start++;
            end++;
            q[end]=ele;
            currsize++;
            return;
        }
        end = (end + 1) % size;
        q[end]=ele;
        currsize++;
    }
public void display(){
    if(currsize == 0){
        System.out.println("Queue Empty");
        return;
        }
    for(int i=start;i<=end;i++){
        System.out.print(q[i]+" ");
    }
}
public int pop(){
    if(start==-1){
        System.out.print("stack underflow");
        return -1;
    }
    int ele=q[start];
    start = (start + 1) % size;
    currsize--;
    if(currsize == 0){
    start = -1;
    end = -1;
    }
    return ele;
}
public int size(){
    return currsize;
}
public int peek(){
    if(currsize==0){
        return -1;
    }
    return q[start];
}
public boolean isEmpty(){
    return (currsize==0)?true:false;
}
}

public class queueUsingArrays {
    public static void main(String[] args){
        Queue q=new Queue(10); 
        
        q.push(20);
        q.push(30);
        q.display();
        System.out.println("\n"+q.peek());
        System.out.println(q.pop());
        System.out.println(q.size());
    }
}
