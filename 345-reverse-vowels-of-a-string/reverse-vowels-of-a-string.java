class Solution {   
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] res=s.toCharArray();
        while(i<j){
            if(res[i] == 'a' || res[i]=='e' || res[i]=='i' || res[i]== 'o' || res[i]=='u' || res[i]== 'A' || res[i]=='E' || res[i]== 'I' || res[i]=='O' || res[i]=='U' ){
                if(res[j]=='a' || res[j]=='e' || res[j]== 'i' || res[j]=='o' || res[j]=='u' || res[j]=='A' || res[j]=='E' || res[j]=='I' || res[j]=='O' || res[j]=='U' ){
                    char temp=res[i];
                    res[i]=res[j];
                    res[j]=temp;
                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }else{
                i++;
            }
            
        }
    return new String(res);
    }   
}