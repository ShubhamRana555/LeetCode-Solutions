class MyCalendar {

    private TreeMap<Integer,Integer> bookings;
    public MyCalendar() {
        bookings = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer prevBooking = bookings.floorKey(start); // start time of booking which is just previous to my current ooking

        Integer nextBooking = bookings.ceilingKey(start); // start time of booking which is just next to my current Booking

        // check for intersection of current booking with previous booking or next booking
        if((prevBooking == null || bookings.get(prevBooking) <= start) && (nextBooking ==null || end <= nextBooking))
        {
            bookings.put(start,end);
            return true;
        }

        return false;


    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */