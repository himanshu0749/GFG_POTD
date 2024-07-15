class Solution {
    public String smallestNumber(int s, int d) {
        // code here
        if(s==0){
            if(d==1) return "0";
            else{
                return "-1";
            }
        }
        if(s>9*d) return "-1";
        int[] digits=new int[d];
        for (int i = 0; i < d; i++) digits[i] = 0;
        s--;
        for (int i = d - 1; i >= 0; i--) {
            if (s > 9) {
                digits[i] = 9;
                s -= 9;
            } else {
                digits[i] = s;
                s = 0;
            }
        }
        digits[0] += 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d; i++) {
            sb.append(digits[i]);
        }
        
        return sb.toString();
    }
}
