class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void combination(int k,int n,List<Integer> li,int sum,int idx){
        if(sum==n && li.size()==k){
            res.add(new ArrayList(li));
            return;
        }
        for(int i=idx+1;i<10;i++){
            if(i>n ||k==0) break;
            li.add(i);
            combination(k,n,li,sum+i,i);
            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> li=new ArrayList<>();
            combination(k,n,li,0,0);
       
        return res;
    }
}