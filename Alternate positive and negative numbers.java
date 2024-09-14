class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i:arr){
            if(i>=0) pos.add(i);
            else{
                neg.add(i);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        int posidx=0,negidx=0;
        while(posidx<pos.size() || negidx<neg.size()){
            if(posidx<pos.size()) res.add(pos.get(posidx++));
            if(negidx<neg.size()) res.add(neg.get(negidx++));
        }
         arr.clear();
        arr.addAll(res);
    }
}
