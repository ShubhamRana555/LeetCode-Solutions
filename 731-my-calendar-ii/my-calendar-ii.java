class MyCalendarTwo {
    public TreeMap<Integer,Integer> bookings;

    public MyCalendarTwo() {
        bookings = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        int count = 0;  // count of active bookings
        
        // take start time as +1 for new event and end time as -1
        bookings.put(start,bookings.getOrDefault(start,0)+1);
        bookings.put(end,bookings.getOrDefault(end,0)-1);
        
        for(Integer events : bookings.values()){
            count += events;
            if(count > 2){
                // remove new booking as it is already added above
                bookings.put(start,bookings.getOrDefault(start,0) - 1);
                bookings.put(end,bookings.getOrDefault(end,0) + 1);
                return false;
            }


        }
        return true;
        
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */