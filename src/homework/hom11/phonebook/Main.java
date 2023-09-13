package homework.hom11.phonebook;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Create a phone book object
        Phonebook phonebook = new Phonebook();

        // Add entries to the phonebook
        phonebook.add(new Record("John Smith", "123-456-7890"));
        phonebook.add(new Record("Jane Smith", "987-654-3210"));
        phonebook.add(new Record("Mary Grom", "555-123-4567"));
        phonebook.add(new Record("Boris Johnson", "111-222-3333"));

        // Search for a specific record by name (returns the first one found)
        Record foundRecord = phonebook.find("John Doe");
        if (foundRecord != null) {
            System.out.println("Record found: " + foundRecord.getName() + " - " + foundRecord.getPhone());
        } else {
            System.out.println("No record found.");
        }

        // Search all records by name (return all found)
        List<Record> foundRecords = phonebook.findAll("Mary Grom");
        if (foundRecords != null) {
            System.out.println("Found records by name: 'Mary Grom':");
            for (Record record : foundRecords) {
                System.out.println(record.getName() + " - " + record.getPhone());
            }
        } else {
            System.out.println("No record found.");
        }
    }
}
