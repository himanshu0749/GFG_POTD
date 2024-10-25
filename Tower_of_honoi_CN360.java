public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) 
    {
        //    Write your code here.
        ArrayList<ArrayList<Integer>> moves=new ArrayList<>();
        recurs(n,1,3,2,moves);
        return moves;
    }
    private static void recurs(int n, int from,int to,int aux,ArrayList<ArrayList<Integer>>moves){
        if(n==1) {
            ArrayList<Integer>move=new ArrayList<>();
            move.add(from);
            move.add(to);
            moves.add(move);
            return;
        }
        recurs(n-1,from,aux,to,moves);
        ArrayList<Integer>move=new ArrayList<>();
        move.add(from);
        move.add(to);
        moves.add(move);
        recurs(n-1,aux,to,from,moves);
    }
