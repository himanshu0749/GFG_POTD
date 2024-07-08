class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
       int c=1;
       Node curr=node;
       while(curr!=null){
           if(c==ind){
               return curr.data;
           }
           c++;
           curr=curr.next;
       }
       return -1;
    }
}
