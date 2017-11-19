class Solution {
    	public int factorielle1(int n) {
    		if (n== 1 || n == 0){
    			return 1;
    		}
    		else {
    			return n * factorielle1(n-1);
    		}
         }
    	
    	public int factorielle2(int n) {
           int res = 1;
           for (int i = 1; i <= n; i++ ) {
        	   res = res * i;
           }
           return res;
         }
    	
    	public int addition(int a, int b) {
    		return a + b;
    	}
    	
}