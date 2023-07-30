package String;
// https://leetcode.com/problems/string-to-integer-atoi/
public class StringToIntegerAtoi {
    public static void main(String[] args) {

    }

    public int myAtoi(String s) {
        long ans = 0;
        int n = s.length();
        int i = 0;
        int sign = 1;
        while(i<n && s.charAt(i)==' ')
            i++;

        if(i<n && s.charAt(i)=='-')
        {
            sign = -1;
            i++;
        }
        else if(i<n && s.charAt(i)=='+')
            i++;

        while(i<n)
        {
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9')
            {
                ans = ans*10+(ch-'0');
                if(ans>=Integer.MAX_VALUE)
                    break;
            }
            else
                break;
            i++;
        }
        ans = sign*ans;
        if(ans>=Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if(ans<=Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int)ans;
    }
}
