package _2;
//Queue using circulur array
public class CirculurQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;
        Queue(int n){
            arr=new int[n];
            this.size= n;
        }
        public  static boolean isEmpty(){//if queue is empty
            if (front==-1&&rear==-1){
                return true;
            }

            return false;
        }
        public static boolean isFull(){//of queue is full
            return rear+1%size==front;
        }
        //queue add elements
        public static void add(int data){
            if (isFull()){//if queue is full
                System.out.println("full queue");
                return;
            }
            //for add first element in queue
            if (front==-1){
                front=0;
            }
            rear=rear+1%size;
            arr[rear]=data;
        }
        //remove an element from queue
        public static int remove(){
            if (isEmpty()){
                return -1;
            }
            int result=arr[front];
            //if there is single element
            if (rear==front){
                rear=front=-1;
            }
            else {
                front=front+1%size;
            }
            rear--;
            return front;
        }
        public static int peek(){
            return arr[front-1];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }}
