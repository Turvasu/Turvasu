class Solution {
    public int numWaterBottles(int nb, int ne) {
        int n=nb;
        while(nb>=ne)
        {
            n=n+nb/ne;
            nb=nb/ne+nb%ne;
        }
        return n;
    }
}