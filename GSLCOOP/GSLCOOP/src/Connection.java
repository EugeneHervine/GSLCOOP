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
	    
	    public List<String[]> readCSV(String file) {
	        List<String[]> records = new ArrayList<>();
	        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] values = line.split(",");
	                records.add(values);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return records;
	    }

	    public void writeCSV(String file, List<String[]> data) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
	            for (String[] record : data) {
	                String line = String.join(",", record);
	                writer.write(line);
	                writer.newLine();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
}
