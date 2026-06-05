package Stacks_And_Queues.Implementation;
class Stack{
    int[] st;
    int top;
    int size;
    Stack(int size){
        this.size=size;
        st=new int[size];
        top=-1;
    }

public void push(int ele){
    if(top>=size){
        System.out.print("Stack Overflow");
    }
    top++;
    st[top]=ele;
}
public void display(){
    for(int i=top;i>=0;i--){
        System.out.print(st[i]+" ");
    }
}
public int pop(){
    if(top==-1){
        System.out.print("stack underflow");
        return -1;
    }
    int ele=st[top];
    top--;
    return ele;
}
public int size(){
    return top+1;
}
public int peek(){
    if(top==-1){
        return -1;
    }
    return st[top];
}
public boolean isEmpty(){
    return (top==-1)?true:false;
}
}
public class stackImplementation {
    public static void main(String[] args){
        Stack st=new Stack(10); 
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        st.peek();
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.size());
    }
}
