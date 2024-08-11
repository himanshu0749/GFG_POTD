class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b)-> b.profit-a.profit);
        int max_dead=0;
        for(int i=0;i<arr.length;i++) max_dead=Math.max(max_dead,arr[i].deadline);
        int[] max_time=new int[max_dead+1];
        Arrays.fill(max_time,-1);
        int jobcount=0,maxprofit=0;
        for(Job i:arr){
            for (int j=i.deadline;j > 0; j--) {
                if (max_time[j] == -1) {
                    max_time[j] = i.id;
                    jobcount++;
                    maxprofit += i.profit;
                    break;
                }
            }
        }
        return new int[]{jobcount, maxprofit};
    }
}
