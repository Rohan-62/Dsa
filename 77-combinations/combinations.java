class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void gencombine(int n,int k,List<Integer> li,int idx){
    
        if(k==0){
            res.add(new ArrayList(li));
            return;
        }
         for(int i=idx;i<=n-k+1;i++){
                li.add(i);
                gencombine(n,k-1,li,i+1);
                li.remove(li.size()-1);
            }
        }

        
    
    public List<List<Integer>> combine(int n, int k) {
            List<Integer>li=new ArrayList<>();
            gencombine(n,k,li,1);
            
        return res;
    }
}
