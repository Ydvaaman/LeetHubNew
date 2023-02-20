class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char []temp=stones.toCharArray();
        int ans=0;
        for(int i=0;i<temp.length;i++){
            if(jewels.indexOf(temp[i])!=-1){
                ans++;
            }
        }
        return ans;
    }
}