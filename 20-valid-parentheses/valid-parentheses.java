class Solution {
    public boolean isValid(String s) {
        int p=0,c=0,b=0;
        String o="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
                o=o+ch;
            else if(ch==')')
            {
                if(o.length()==0)
                    return false;
                if(o.charAt(o.length()-1)!='(')
                    return false;
                o=o.substring(0,o.length()-1);
            }
            else if(ch=='}')
            {
                if(o.length()==0)
                    return false;
                if(o.charAt(o.length()-1)!='{')
                    return false;
                o=o.substring(0,o.length()-1);
            }
            else if(ch==']')
            {
                if(o.length()==0)
                    return false;
                if(o.charAt(o.length()-1)!='[')
                    return false;
                o=o.substring(0,o.length()-1);
            }
        }
        if(o.equals(""))
            return true;
        return false;
    }
}