class Solution {
    public int minMaxDifference(int num) {
        String s=String.valueOf(num);
        String tar="";
        String first=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')!=9){
                tar=""+s.charAt(i);
                break;
            }
        }
        
        // for(int i=0;i<s.length();i++){
        //     if((s.charAt(i)-'0') > 0){
        //         first=""+s.charAt(i);
        //         break;
        //     }
        // }
        // System.out.println(first);
       String max = s.replaceAll(tar,"9");
       String min =s.replaceAll(first,"0");
        // System.out.println(max+" "+min);
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        if(tar == ""){
            maximum = num;
            minimum = 0;
        }else{
        maximum =Integer.valueOf(max);
        minimum=Integer.valueOf(min);
        }
        
        return maximum-minimum;
        
    }
}