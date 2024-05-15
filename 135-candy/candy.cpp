class Solution {
public:
    int candy(vector<int>& ratings) {
        int n=ratings.size();
        if(n==1)
           return 1;
        vector<int> cand(n,1);
        for(int i=1;i<n;i++)
        {
            if(ratings[i]>ratings[i-1] && cand[i]<=cand[i-1])
                cand[i]=cand[i-1]+1;
        }
        for(int i=n-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1] && cand[i]<=cand[i+1])
               cand[i]=cand[i+1]+1;
        }
        int sum=accumulate(cand.begin(),cand.end(),0);
        return sum;
    }
};