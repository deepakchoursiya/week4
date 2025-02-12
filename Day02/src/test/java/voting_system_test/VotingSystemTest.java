package voting_system_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import voting_system.VotingSystem;

import java.util.Map;

class VotingSystemTest {
    private VotingSystem votingSystem;

    @BeforeEach
    void setUp() {
        votingSystem = new VotingSystem();
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
    }

    @Test
    void testVoteCount() {
        assertEquals(3, votingSystem.getSortedResults().get("Alice"));
        assertEquals(2, votingSystem.getSortedResults().get("Bob"));
        assertEquals(1, votingSystem.getSortedResults().get("Charlie"));
    }

    @Test
    void testSortedResults() {
        Map<String, Integer> sortedResults = votingSystem.getSortedResults();
        String[] expectedOrder = {"Alice", "Bob", "Charlie"};
        assertArrayEquals(expectedOrder, sortedResults.keySet().toArray());
    }

    @Test
    void testVoteOrderResults() {
        Map<String, Integer> orderResults = votingSystem.getVoteOrderResults();
        String[] expectedOrder = {"Alice", "Bob", "Charlie"};
        assertTrue(orderResults.containsKey("Alice"));
        assertTrue(orderResults.containsKey("Bob"));
        assertTrue(orderResults.containsKey("Charlie"));
    }
}
