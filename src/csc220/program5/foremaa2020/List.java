/*  Anthony Foreman
 *  CSC 220 Program 5
 *  4-29-17
 *  Description: This class contains a remove method which allows you to remove 
    the character from the output and addBefore next method.
   

*/



 
package csc220.program5.foremaa2020;


import csc220.list.AddIterator;
import csc220.list.Node;
import csc220.program5.foremaa2020.List;

public class List<E> extends csc220.list.List<E> { 
       
   @Override
   public AddIterator<E> addIterator(){return new ListAddIterator<>();}
   
   
  
   protected class ListAddIterator<T extends E> extends csc220.list.List<E>.ListAddIterator<E> {
       
       private static final boolean DEBUGGING = true;
       protected Node<E> prevNode = null;
        
        @Override
        public E next() {
            prevNode = nextNode;
            return super.next();
        }

        private void printNodes(String s) {
            if (!DEBUGGING)
                return;
            System.out.print(s);
            
            if( nextNode == null){
                System.out.println(" it's null ");
            }
            System.out.println("");
        }
        
        @Override
        public void remove() {
            printNodes("(foremaa2020)Remove under construction");

        if (prevNode != first && prevNode != null){
            Node<E> tmp = first;
            while (tmp.next != prevNode){
                tmp = tmp.next;
            }
                tmp.next = nextNode;
        }
        else {
            prevNode = prevNode.next;
            first = prevNode;
        }
        prevNode = null;
        
        } 
        
        @Override 
        public void addBeforeNext(E e) {
            printNodes ("(foremaa2020)Add Under Construction");
            Node<E> tmp = new Node<>();
            tmp.data = e;
            
            if (nextNode != null) {
                if(first.data.equals(nextNode.data)){    
                    first.next = tmp;
                    tmp.next = nextNode;
                }
                else{ 
                    prevNode.next = tmp; 
                    tmp.next = nextNode;
                }
            }else{ 
                prevNode.next = tmp;
                tmp.next = nextNode;
            }
        }
        
        
     }
   
   
}

