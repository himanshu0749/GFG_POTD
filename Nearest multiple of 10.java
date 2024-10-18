class Solution {

    String roundToNearest(String str) {
        
        if (str.charAt(str.length() - 1) > '5') {
            char[] arr = str.toCharArray();
            for (int i = str.length() - 2; i >= 0; i--) {
                arr[i]++;
                if (arr[i] <= '9') {
                    return new String(arr, 0, i + 1) + "0".repeat(str.length() - i - 1);
                }
            }
        }
        str = str.substring(0, str.length() - 1) + '0';
        return str;
        
        
        
        // int n=Integer.parseInt(str);
        // int lastDigit=n%10;
        // if(lastDigit>5){
        //     n=((n/10)+1)*10;
        // }else{
        //     n=(n/10)*10;
        // }
        // return Integer.toString(n);
        
        
        
        // if (str.length() == 1) {
        //     return str.charAt(0) > '5' ? "10" : "0";
        // }

        // char lastDigit = str.charAt(str.length() - 1);
        // String remaining = str.substring(0, str.length() - 1);

        // if (lastDigit > '5') {
        //     return roundToNearest(remaining) + "0";
        // } else {
        //     return remaining + "0";
        // }
    }
}
