class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item arr[], int n) {
        // Your code here
        double[][] ratio=new double[n][2];
        for(int i=0;i<n;i++){
            ratio[i][0]=(double) arr[i].value/(double) arr[i].weight;
            ratio[i][1]=i;
        }
        Arrays.sort(ratio,(a,b)->Double.compare(b[0],a[0]));
        double totalValue= 0.0;
        for (int i = 0; i < n; i++) {
            int idx = (int) ratio[i][1];
            if (w >= arr[idx].weight) {
                w -= arr[idx].weight;
                totalValue += arr[idx].value;
            } else {
                totalValue += (double) arr[idx].value * w / arr[idx].weight;
                break;
            }
        }

        return totalValue;
        
    }
