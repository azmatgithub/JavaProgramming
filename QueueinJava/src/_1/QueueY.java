package _1;
//creation of Queue using Array
public class QueueY{
    static class Queue{
          static int arr[];
          static int size;
          static int rear=-1;


        Queue(int n){
               arr=new int[n];
              this.size= n;
          }
        public  static boolean isEmpty(){
              return  rear==-1;
        }
        //queue add elements
        public static void add(int data){
              if (rear==size-1){
                  System.out.println("full queue");
              return;
              }
              rear++;
              arr[rear]=data;
        }
        //remove an element from queue
        public static int remove(){
              if (isEmpty()){
                  return -1;
              }
              int front=arr[0];
              for (int i=0;i<rear;i++){
                  arr[i]=arr[i+1];
              }
              rear--;
              return front;
        }
        public static int peek(){
              return arr[0];
        }
    }
    public static void main(String[] args) {
            Queue q=new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);
            if (!q.isEmpty()){
                System.out.println(q.peek());

            }

    }

}
