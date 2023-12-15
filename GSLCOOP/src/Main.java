import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	public Main() {
		while(true) {
			System.out.println("Which table to insert? 1. User, 2. Team");
			
			int menu = scan.nextInt();
			scan.nextLine();
			
			switch(menu) {
				case 1:
					Insert();
					break;
				case 2:
					View();
					break;
					
			}
			
		}
	}
	
	public void Insert() {
		String nama, team;
		int nim;
		
		System.out.println("add name: ");
		nama = scan.nextLine();
		System.out.println("add nim: ");
		nim = scan.nextInt();
		System.out.println("add team: ");
		team = scan.nextLine();
		
	}
	
	public void View() {
		String nama, team;
		int IP;
		
			System.out.println("Which table to show? 1. User, 2. Team.");
			IP = scan.nextInt();
			scan.nextLine();
			System.out.println("Want to filter by condition? 1. Yes, 2. No. ");
			scan.nextLine();
	}
	
	public void menu() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
		
		Connection connection = Connection.getInstance();
		
		String fileTeams = "src\\teams.csv";
		List<String[]> readDataTeams = connection.readCSV(fileTeams);
		for(String[] record : readDataTeams) {
			System.out.println(String.join(", ", record));
		}
		
		List<String[]> writeDataTeams = new ArrayList<>();
		writeDataTeams.add(new String[]{id, nama});
		connection.writeCSV(fileTeams, writeDataTeams);
		
		
		String fileUser = "src\\user.csv";
		List<String[]> readDataUser = connection.readCSV(fileUser);
		for(String[] record : readDataUser) {
			System.out.println(String.join(", ", record));
		}
		
		List<String[]> writeDataUser = new ArrayList<>();
		writeDataUser.add(new String[]{nim, nama, idteam});
		connection.writeCSV(fileUser, writeDataUser);
	}

}
