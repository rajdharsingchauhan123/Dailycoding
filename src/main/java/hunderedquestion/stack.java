package hunderedquestion;

import java.util.ArrayList;
import java.util.List;

public class stack {
    @Override
    public String toString() {
        return "stack{}";
    }
    List<String>elements=new ArrayList<>();
    public String peek(){
        if(elements.isEmpty()){
            return null;
        }
        else
            return elements.get(elements.size()-1);
    }
    public String pop(){
        if(elements.isEmpty()) {
            return null;
        }
            String top=elements.get(elements.size()-1);
            elements.remove(elements.size()-1);
            return top;
        }
    public void push(String element){
       elements.add(element);

    }
    public  int size(){
        return elements.size();
    }
    public boolean isEmpty(){
        return elements.isEmpty();
    }


    public static void main(String[] args) {
        stack stack=new stack();
        System.out.println("Is Stack Empty:"+stack.isEmpty());
        stack.push("Gyan");
        stack.push("Vivek");
        stack.push("Rochit");
        stack.push("Panda");
        System.out.println("Is Stack Empty:"+stack.isEmpty());
        System.out.println(stack);
        System.out.println("Stack Size:"+stack.size());
        System.out.println("Peek Top Element:"+stack.peek());
        System.out.println("After peek:"+stack);
        System.out.println("Pop Top Element:"+stack.pop());
        System.out.println("After pop:"+stack);
        System.out.println("Stack Size now:"+stack.size());

    }
}
