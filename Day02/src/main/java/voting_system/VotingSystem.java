package voting_system;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> votesMap = new HashMap<>();
    private Map<String, Integer> votesOrderMap = new LinkedHashMap<>();

    // Method to cast a vote
    public void castVote(String candidate) {
        votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);
        votesOrderMap.put(candidate, votesMap.get(candidate)); // Maintain order
    }

    // Method to get results sorted by candidate name
    public Map<String, Integer> getSortedResults() {
        return new TreeMap<>(votesMap);
    }

    // Method to get results in voting order
    public Map<String, Integer> getVoteOrderResults() {
        return new LinkedHashMap<>(votesOrderMap);
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Casting votes
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        // Display results
        System.out.println("Vote Count (Unordered): " + votingSystem.votesMap);
        System.out.println("Vote Count (Sorted by Name): " + votingSystem.getSortedResults());
        System.out.println("Vote Count (Order of Voting): " + votingSystem.getVoteOrderResults());
    }
}
