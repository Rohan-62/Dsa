class Solution {
    List<List<String>> res=new ArrayList<>();
    public boolean issafe(List<String> li, int row, int col, int n) {
    for (int r = 0; r < row; r++) {
        if (li.get(r).charAt(col) == 'Q') {
            return false;
        }
    }
    int r = row - 1;
    int c = col - 1;
    while (r >= 0 && c >= 0) {
        if (li.get(r).charAt(c) == 'Q') {
            return false;
        }
        r--;
        c--;
    }
    r = row - 1;
    c = col + 1;

    while (r >= 0 && c < n) {
        if (li.get(r).charAt(c) == 'Q') {
            return false;
        }
        r--;
        c++;
    }
    return true;
}
    public void nqueens(List li,int n,int row,HashSet cols){
            if(row==n){
                    res.add(new ArrayList(li));
                    return;
            }
            StringBuilder sb=new StringBuilder(""+li.get(row));
            String prev=new String(""+li.get(row-1));
            for(int i=0;i<n;i++){
                if(i==0){
                    if(!cols.contains(i) & issafe(li,row,i,n)){
                        cols.add(i);
                        sb.replace(i,i+1,"Q");
                        li.set(row,sb.toString());
                        nqueens(li,n,row+1,cols);
                        cols.remove(i);
                        sb.replace(i,i+1,".");
                        li.set(row,sb.toString());
                    }
                }else if(i==n-1){
                    if(!cols.contains(i) && issafe(li,row,i,n)){
                        cols.add(i);
                        sb.replace(i,i+1,"Q");
                        li.set(row,sb.toString());
                        nqueens(li,n,row+1,cols);
                        cols.remove(i);
                        sb.replace(i,i+1,".");
                        li.set(row,sb.toString());
                    }
                }else{
                    if(!cols.contains(i) && issafe(li,row,i,n)){
                        cols.add(i);
                        sb.replace(i,i+1,"Q");
                        li.set(row,sb.toString());
                        nqueens(li,n,row+1,cols);
                        cols.remove(i);
                        sb.replace(i,i+1,".");
                        li.set(row,sb.toString());
                    }
                }
            }
            
       }

    
    public List<List<String>> solveNQueens(int n) {
        List<String> li=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(".");
            }
            li.add(sb.toString());
        }
        StringBuilder sb=new StringBuilder(""+li.get(0));
        for(int i=0;i<n;i++){
            set.add(i);
            sb.replace(i,i+1,"Q");
            li.set(0,sb.toString());
            nqueens(li,n,1,set);
            set.remove(i);
            sb.replace(i,i+1,".");
            li.set(0,sb.toString());
        }
        return res;
    }
}