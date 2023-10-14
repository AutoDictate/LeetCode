class Solution {
    public int[] plusOne(int[] digits) {
        //Sint[] digits = {1,2,3,4,4,5,6,7};
		String temp="";
		int rem=0;
		for(int i=digits.length-1;i>=0;i--){
		    if(i==digits.length-1){
		        int v = digits[i]+1;
		        if(v>9){
		            temp+=""+(v%10);
		            rem = v%9;
		        }
		        else{
		            temp+=""+v;
		        }
		    }else{
		        if(rem>0){
		            int x = digits[i]+rem;
		            if(x>9){
                        temp+=""+(x%10);
		                rem = x%9;
                    }else{
                        temp+=""+x;
                        rem = 0;
                    }
		        }else{
		            temp+=""+digits[i];
		        }
		    }
		}
        if(rem>0){
            temp+=""+rem;
        }
		StringBuilder sb1 = new StringBuilder(temp);
		sb1.reverse();
        String sb = sb1.toString();
		int[] res = new int[sb.length()];
        for(int i=0;i<sb.length();i++){
            res[i] = Integer.parseInt(""+sb.charAt(i));
        }
        return res;
    }
}
