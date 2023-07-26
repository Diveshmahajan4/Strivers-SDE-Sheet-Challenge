package Stack;

import java.util.Stack;
// https://www.codingninjas.com/studio/problems/the-celebrity-problem_8230781?challengeSlug=striver-sde-challenge&leftPanelTab=1
public class CelibrityProblem {
    // Demo class just to hide the errors read the question
    // for more reference
    static class Runner{
        int a;
        int b;

        public static boolean knows(int a, int b){
            return true;
        }
    }

    public static void main(String[] args) {

    }

    public static int findCelebrity(int n) {
        Stack<Integer> s = new Stack<Integer>();
        for( int i = 0; i < n; i++)
        {
            s.add(i);
        }

        while( s.size()>1)
        {
            int a = s.pop();
            int b = s.pop();

            if( Runner.knows(a,b))
            {
                // a is not a celebrity
                s.push(b);
            }
            else
            {
                if(Runner.knows(b,a))
                {
                    // b is not a celebrity
                    s.push(a);
                }
            }
        }
        if(s.size() == 0)
        {
            return -1;
        }
        int get  = s.pop();
        for( int i = 0; i< n ; i++)
        {
            if( i != get)
            {
                if(Runner.knows(i,get) == false || Runner.knows(get,i) == true)
                {
                    return -1;
                }
            }
        }
        return get;

    }

}
