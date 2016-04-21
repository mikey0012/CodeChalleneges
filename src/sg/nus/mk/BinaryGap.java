package sg.nus.mk;

 class BinaryGap {
	
	 int solution(int N) {
        String bs = Integer.toBinaryString(N);
        boolean flag=false;
        //Stack st = new Stack();
        int count=0;
        int max=0;
        for(int i=0;i<bs.length();i++){
            if(bs.charAt(i)=='1'){
            	flag=true;
            	if(count>max) {
            		max=count; 
            		count=0;
            		}
            	count=0;
             }
             else if(flag)
              count++;
            }
            return max;
    }

}
