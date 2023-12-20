public class Elevator{
    private int currentFloor;
    private int capacity;
    private int maxFloor;

    public Elevator(int currentFloor, int maxFloor, int capacity) {
        this.currentFloor = currentFloor;
        this.maxFloor = maxFloor;
        this.capacity = capacity;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public boolean isAllowableWeight(int weight){
        return weight <= capacity && weight > 0;

    }

    public boolean isAllowableFloor(int floor){
        return floor >= 1 && floor <= maxFloor;
    }

//    public void move(int toFloor){
//        if (isAllowableFloor(toFloor)){
//            System.out.println("Elevator is moving..");
//            int startFloor = currentFloor;
//            int step = (toFloor > currentFloor) ? 1 : -1;
//            while (currentFloor != toFloor) {
//                currentFloor += step;
//                System.out.println("Floor " + currentFloor + " reached.");
//            }
//
//            System.out.println("Elevator has reached the destination floor " + toFloor);
//            System.out.println("Floors passed: " + getFloorsPassed(startFloor, toFloor));
//        } else {
//            System.out.println("Invalid floor number. Please enter a valid floor.");
//        }
//    }
//
//    private String getFloorsPassed(int startFloor, int endFloor) {
//        StringBuilder floorsPassed = new StringBuilder();
//        int step = (endFloor > startFloor) ? 1 : -1;
//
//        for (int floor = startFloor; floor != endFloor; floor += step) {
//            floorsPassed.append(floor).append(", ");
//        }
//        floorsPassed.append(endFloor);
//
//        return floorsPassed.toString();
//    }
}