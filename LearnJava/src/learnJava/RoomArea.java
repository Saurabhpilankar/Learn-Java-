package learnJava;

public class RoomArea {
	public static void main(String[] args) {
		float roomArea;

		Room room =new Room();
		room.getroom(10, 5);
		roomArea=room.length*room.breadth;
		System.out.println("roomArea is: " +roomArea);

	}

}
