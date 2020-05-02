package entities;

public class Room {

	private int room;
	private String name;
	private String email;
	
	public Room(int room, String name, String email) {
		super();
		this.room = room;
		this.name = name;
		this.email = email;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Room # " + room + ": " + name + ", " + email;
	}

	

	
	
}
