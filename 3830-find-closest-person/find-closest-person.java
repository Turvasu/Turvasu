class Solution {
    public int findClosest(int x, int y, int z) {
        if((int)Math.abs(x-z)>(int)Math.abs(y-z))
            return 2;
        else if((int)Math.abs(x-z)<(int)Math.abs(y-z))
            return 1;
        else 
            return 0;
    }
}