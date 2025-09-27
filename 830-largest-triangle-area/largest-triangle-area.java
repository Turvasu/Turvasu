class Solution {
    public double largestTriangleArea(int[][] p) {
        double b=0.0;
        for(int i=0;i<p.length-2;i++)
        {
            for(int j=0;j<p.length-1;j++)
            {
                for(int k=0;k<p.length;k++)
                {
                    double x=Math.sqrt((p[i][0]-p[j][0])*(p[i][0]-p[j][0])+(p[i][1]-p[j][1])*(p[i][1]-p[j][1]));
                    double y=Math.sqrt((p[j][0]-p[k][0])*(p[j][0]-p[k][0])+(p[j][1]-p[k][1])*(p[j][1]-p[k][1]));
                    double z=Math.sqrt((p[k][0]-p[i][0])*(p[k][0]-p[i][0])+(p[k][1]-p[i][1])*(p[k][1]-p[i][1]));
                    double s=(x+y+z)/2;
                    double a=Math.sqrt(s*(s-x)*(s-y)*(s-z));
                    b=b<a?a:b;
                }
            }
        }
        return b;
    }
}