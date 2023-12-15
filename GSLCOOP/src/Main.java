import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Connection.Connection;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<String>listNama = new ArrayList<>();
	ArrayList<String>listTeams = new ArrayList<>();
	ArrayList<String>listRead = new ArrayList<>();
	Connection connection = Connection.getInstance();
	
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
					Ins();
					break;
					
			}
			
		}
	}
	
	public void Insert() {
		String nama, nim, team, id, namatim, read;
		int total = 0;	
		listRead = connection.readCSV("./src/teams.csv");
		
		System.out.println("add name: ");
		nama = scan.nextLine();
		System.out.println("add nim: ");
		nim = scan.nextLine();
		System.out.println("add team: ");
		team = scan.nextLine();
		for(int i = 0; i < listRead.size(); i++) {
			read = listRead.get(i);
			String[] values = read.split(",");
            id = values[0];
            namatim = values[1];
            if(namatim.equals(team)) {
            	total = i;
            	System.out.println(total);
            }
//			System.out.println(listRead.get(i));
		}
		listNama.add(String.format("%s,%s,%d", nim, nama, total));
		System.out.println("User Created!");
		
		Connection.writeCSV("./src/user.csv", listNama);
		
//		for(int i = 0; i < listNama.size(); i++) {
//			System.out.printf("%s,%s,%s", nama, nim, team);
//		}
		
		
	}
	
	public void Ins() {
		String nama;
		int id;
		
		System.out.println("add name: ");
		nama = scan.nextLine();
		System.out.println("add nim: ");
		id = scan.nextInt();
		listNama.add(String.format("%d,%s", id, nama));
		System.out.println("User Created!");
		
		Connection.writeCSV("./src/teams.csv", listTeams);
		
//		for(int i = 0; i < listNama.size(); i++) {
//			System.out.printf("%s,%s,%s", nama, nim, team);
//		}
		
		
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
		
//		Connection connection = Connection.getInstance();
//		
//		String fileTeams = "src\\teams.csv";
//		for(String[] record : readDataTeams) {
//			System.out.println(String.join(", ", record));
//		}
//		
//		ArrayList<String> writeDataTeams = new ArrayList<>();
//		connection.writeCSV(fileTeams, writeDataTeams);
//		
//		
//		String fileUser = "src\\user.csv";
//		List<String[]> readDataUser = connection.readCSV(fileUser);
//		for(String[] record : readDataUser) {
//			System.out.println(String.join(", ", record));
//		}
//		
//		ArrayList<String> writeDataUser = new ArrayList<>();
//		connection.writeCSV(fileUser, writeDataUser);
	}

}
