import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of registered voters:");
        int registeredVoters = sc.nextInt(); // Total number of registered voters

        System.out.println("Enter the number of candidates:");
        int numCandidates = sc.nextInt(); // Total number of candidates

        System.out.println("Enter the number of votes:");
        int numVotes = sc.nextInt(); // Total number of votes to process

        int votesCount = 0;

        for (int i = 0; i < numVotes; i++) {
            System.out.println("Enter candidate ID:");
            int candidateID = sc.nextInt();

            if (candidateID >= 1 && candidateID <= numCandidates && votesCount < registeredVoters) {
                System.out.println("Valid");
                votesCount++;
            } else {
                System.out.println("Invalid");
            }
        }

        sc.close(); 
    }
}
