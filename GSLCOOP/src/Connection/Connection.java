package Connection;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Connection {
	private static Connection instance;
	    private Connection() {}

	    public static Connection getInstance() {
	        if (instance == null) {
	            instance = new Connection();
	        }
	        return instance;
	    }
	    
	    public ArrayList<String> readCSV(String file) {
	        ArrayList<String> records = new ArrayList<>();
	        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
	            String line;
	            String nama;
	            String id;
	            while ((line = reader.readLine()) != null) {
	                String[] values = line.split(",");
	                id = values[0];
	                nama = values[1];
	                records.add(id+","+nama);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return records;
	    }

	    public static void writeCSV(String file, ArrayList<String> listNama) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
	            for (String record : listNama) {
	                String line = String.join(",", record);
	                System.out.println(line);
	                writer.write(line);
	                writer.newLine();
	            }
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
}
