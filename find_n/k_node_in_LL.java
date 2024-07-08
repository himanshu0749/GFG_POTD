class GfG
{
    public static int nknode(Node head, int k)
    {
       // add your code here
       int c=0;
       Node curr=head;
       while(curr!=null){
           c++;
           curr=curr.next;
       }
       int idx=(c+k-1)/k;
       curr=head;
       for(int i=1;i<idx;i++){
           if(curr!=null){
               curr=curr.next;
           }
       }
       if(curr!=null) return curr.data;
       return -1;
       
    }
}
