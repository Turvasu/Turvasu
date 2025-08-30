class Solution {
    public boolean isValidSudoku(char[][] b) {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(b[i][j]!='.')
                {
                    for(int k=i+1;k<9;k++)
                    {
                        if(b[i][j]==b[k][j])
                            return false;
                    }
                    for(int k=j+1;k<9;k++)
                    {
                        if(b[i][j]==b[i][k])
                            return false;
                    }
                    for(int k=i-i%3;k<i-i%3+3;k++)
                    {
                        for(int l=j-j%3;l<j-j%3+3;l++)
                        {
                            if(k==i && l==j)
                                continue;
                            if(b[i][j]==b[k][l])
                                return false;
                        }
                    }
                }
                
            }
        }
        return true;
    }
}