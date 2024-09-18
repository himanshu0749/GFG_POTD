class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String arr[]=str.split( "\\." );
        String tr="";
        for(int i=arr.length-1;i>=0;i--){
            if(tr.length()==0){
                tr+=arr[i];
            }else{
                tr+="."+arr[i];
            }
        }
        return tr;
    }
}
