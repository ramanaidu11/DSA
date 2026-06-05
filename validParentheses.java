package Stacks_And_Queues.Implementation;
public class validParentheses {
    public static boolean isValid(String s) {
        int n=s.length();
        java.util.Stack<Character> st = new java.util.Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='['||ch=='('||ch=='{'){
                st.push(ch);
            }else{
                if(st.isEmpty())return false;
                if((ch==')'&&st.peek()=='(')||(ch=='}'&&st.peek()=='{')||(ch==']'&&st.peek()=='[')){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }
        return (st.isEmpty())?true:false;
    }
    public static void main(String[] args) {
        String s = "()[]{}";
        boolean isvalid=isValid(s);
        System.out.print(isvalid);
    }
}
