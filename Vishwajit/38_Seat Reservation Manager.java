// Seat Reservation Manager
// https://leetcode.com/problems/seat-reservation-manager
class SeatManager {
    public PriorityQueue<Integer> queue = new PriorityQueue<>();
    int start = 1;
    public SeatManager(int n) {
        queue.add(1);
    }
    public int reserve() {
        if(queue.isEmpty()) queue.add(++start);
        return queue.poll();
    }
    public void unreserve(int seatNumber) {
        queue.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
