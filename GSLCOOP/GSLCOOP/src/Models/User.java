package Models;

public class User extends Model{
	int nim;
	
	public User(int nim, String nama, int id) {
		super();
		this.nim = nim;
		this.nama = nama;
		this.id = id;
	}
}
