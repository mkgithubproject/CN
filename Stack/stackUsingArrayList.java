package genericstack;
import java.util.ArrayList;
public  class GenericStackException extends RuntimeException{
    private String message;
    public GenericStackException() {
        this.message = "Underflow Error.";
    }
    public String getMessage() {
        return this.message;
    }
}

    public class GenericStack<T> {
        private ArrayList<T> list=new ArrayList<T>();
        private int top;
        // constructor
        public GenericStack(){
            top=0;

        }
        // push the element in to the stack and increment the value of top
        public void push(T x){
            top++;
            list.add(x);
        }
        // pop the value of the stack and return poped value and also decrement the top value
        public T pop(){
            if(isEmpty()){// if stack is empty just throw an exception
              throw new GenericStackException();
            }// else pop element and return it.
            T popedElement=list.get(top-1);
            top--;
            return popedElement;
        }
        public boolean isEmpty(){
            // top==0 means stack is empty return true else it will return false.
            return top==0;
        }

        public static void main(String[] args) {
            // create object of GenericStack class
            GenericStack<Integer> obj=new GenericStack<Integer>();
            obj.push(1);
            obj.push(2);
            obj.push(3);
            obj.push(4);
            try{
                System.out.println(obj.pop());
                System.out.println(obj.pop());
                System.out.println(obj.pop());
                System.out.println(obj.pop());
                System.out.println(obj.pop());
            }
            catch(GenericStackException e){
                System.out.println(e.getMessage());
            }
        }
    }
