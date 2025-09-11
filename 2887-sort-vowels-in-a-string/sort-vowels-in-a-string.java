class Solution {
    public String sortVowels(String s) {
        char a[]=new char[s.length()];
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                a[i]=c;
            else
                a[i]=(char)123;
        }
        Arrays.sort(a);
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                t=t+a[j];
                j++;
            }
            else
                t=t+c;
        }
        return t;
    }
}