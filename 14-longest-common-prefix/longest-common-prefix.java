class Solution {
    public String longestCommonPrefix(String[] s) {
        if(s[0].isEmpty())
            return "";
        String s1=s[0];
        for(int i=1;i<s.length;i++)
        { 
            if(s[i].isEmpty())
                return "";
            if(s1.isEmpty())
                return "";
            else if(s[i].charAt(0)!=s1.charAt(0))
                return "";
            for(int j=1;j<s1.length();)
            {
                if(j==s[i].length())
                {
                    s1=s[i];
                    break;
                }
                if(s[i].charAt(j)!=s1.charAt(j))
                {
                    s1=s1.substring(0,j);
                    break;
                }
                j++;
            }
        }
        return s1;
    }
}