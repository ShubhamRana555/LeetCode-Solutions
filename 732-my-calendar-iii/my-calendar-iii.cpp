class MyCalendarThree {
public:
        map<int,int>m;
    MyCalendarThree() {
    }
    
    int book(int startTime, int endTime) {
        m[startTime]++,m[endTime]--;
        int res=0,curr=0;
        for(auto [a,b]:m)curr+=b,res=max(res,curr);
        return res;
    }
};

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree* obj = new MyCalendarThree();
 * int param_1 = obj->book(startTime,endTime);
 */