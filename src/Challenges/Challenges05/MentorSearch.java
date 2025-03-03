package Challenges.Challenges05;

import java.io.*;
import java.util.*;

public class MentorSearch {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Public\\Documents\\Java_Exercises\\MyFirstProject\\src\\Challenges\\Challenges05\\mentee.csv";

        Map<String, String> menteeMentorMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String mentee = parts[0].trim();
                    String mentor = parts[1].trim();
                    if (!mentee.isEmpty() && !mentor.isEmpty()) {
                        menteeMentorMap.put(mentee, mentor);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter search string: ");
        String searchString = scanner.nextLine().toLowerCase();
        scanner.close();

        Set<String> matchedMentors = new LinkedHashSet<>(); // Maintain order, remove duplicates

        for (Map.Entry<String, String> entry : menteeMentorMap.entrySet()) {
            if (entry.getKey().toLowerCase().contains(searchString)) {
                matchedMentors.add(entry.getValue());
            }
        }

        if (matchedMentors.isEmpty()) {
            System.out.println("No mentors found for the given search.");
        } else {
            System.out.println("Mentors: " + String.join(", ", matchedMentors));
        }
    }
}

