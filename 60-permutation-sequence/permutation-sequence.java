class Solution {
    int combination=0;
    String res="";
    boolean isfound=false;
    public String permutation(int n,int k,StringBuilder sb,int count,HashSet set){
        int len=sb.length();
        if(count==n){
            combination++;
            if(combination==k){
                res=sb.toString();
            }
            return res;
            
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                set.add(i);
                count++;
                sb.append(i);
                permutation(n,k,sb,count,set);
                if(!res.equals("")){
                    return res;
                }
                count--;
                sb.setLength(len);
                set.remove(i);
            }
        }
        return res;
    }
    public String getPermutation(int n, int k) {
        StringBuilder sb=new StringBuilder();
        int len=sb.length();
        int count=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=1;i<=n;i++){
            sb.append(i);
            set.add(i);
            count++;
            permutation(n,k,sb,count,set);
            if(!res.equals("")){
                    break;
                }
            sb.setLength(len);
            count--;
            set.remove(i);
        }
        return res;
    }
}