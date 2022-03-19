// building my own mapper while waiting on my team mates to communicate with me

import java.util.Scanner;

public class tylerMapper {

	List<List<String>> records = new ArrayList<>();
	try (BufferedReader br = new BufferedReader(new FileReader("input.csv"))) {
	    String line;
	    while ((line = br.readLine()) != null) {
	        String[] values = line.split(COMMA_DELIMITER);
	        records.add(Arrays.asList(values));
	    }
	}
	
	List<List<String>> records = new ArrayList<>();
	try (Scanner scanner = new Scanner(new File("input.csv"));) {
	    while (scanner.hasNextLine()) {
	        records.add(getRecordFromLine(scanner.nextLine()));
	    }
	}
	
	private List<String> getRecordFromLine(String line) {
	    List<String> values = new ArrayList<String>();
	    try (Scanner rowScanner = new Scanner(line)) {
	        rowScanner.useDelimiter(COMMA_DELIMITER);
	        while (rowScanner.hasNext()) {
	            values.add(rowScanner.next());
	        }
	    }
	    return values;
	}
	
	List<List<String>> records = new ArrayList<List<String>>();
	try (CSVReader csvReader = new CSVReader(new FileReader("book.csv"));) {
	    String[] values = null;
	    while ((values = csvReader.readNext()) != null) {
	        records.add(Arrays.asList(values));
	    }
	}
	
}
