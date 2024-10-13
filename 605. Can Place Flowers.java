class Solution{   
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int pos=0;
        boolean haveOne = false;
        if(flowerbed.length==1&&flowerbed[0]==0){
            count=1;
        }
        if(flowerbed[0]==0){
            for(int i=0;i<flowerbed.length;i++){
                if(flowerbed[i]==0){
                    pos++;
                }
                if(flowerbed[i]==1){
                    haveOne = true;
                    break;
                }
            }
            if(haveOne)
                count+=Math.floor(pos/2.0);
            else
                count+=Math.ceil(pos/2.0);
        }
        int zeroTimes = 0;
        for(int i=pos;i<flowerbed.length;i++){
            if(flowerbed[i]==1){
                if(zeroTimes%2!=0&&zeroTimes>2)
                    count+=Math.floor(zeroTimes/2);
                if(zeroTimes%2==0&&zeroTimes>2)
                    count+=zeroTimes/2-1;
                zeroTimes=0;
            }
            else if(flowerbed[i]==0){
                zeroTimes++;
            }
        }
        
        if(zeroTimes>0);
            count+=Math.floor(zeroTimes/2);

        if(count>=n)
            return true;
        return false;
    }
}