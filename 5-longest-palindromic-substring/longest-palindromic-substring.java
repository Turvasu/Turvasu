class Solution 
{
    public String longestPalindrome(String s)
    {
        String b="";
        if(s.length()==1)
            return s;
        for(int i=1;i<s.length();i++)
        {
            char c=s.charAt(i);
            for(int j=0;j<i;j++)
            {
                char c1=s.charAt(j);
                if(c==c1)
                {
                    int f=j+1,l=i-1;
                    int a=0;
                    while(f<l)
                    {
                        if(s.charAt(f)!=s.charAt(l))
                        {
                            a=1;
                            break;
                        }
                        f++;
                        l--;
                    }
                    if(a==0)
                        b=b.length()<(i-j+1)?s.substring(j,i+1):b;
                }
            }
        }
        if(b=="")
            return (s.charAt(0)+"");
        return b;
    }
}