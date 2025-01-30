package stacks_and_queues.circular_tour_problem;

public class CircularTourProblem_05 {

    // Function to find the starting petrol pump index
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        int totalPetrol = 0, totalDistance = 0;
        int startIndex = 0;
        int surplus = 0;
        // int deficit = 0;

        for (int i = 0; i < n; i++) {
            totalPetrol += petrol[i];
            totalDistance += distance[i];

            surplus += petrol[i] - distance[i];

            // If surplus becomes negative, reset start index
            if (surplus < 0) {
                startIndex = i + 1;
                // deficit += surplus; // Store deficit
                surplus = 0; // Reset surplus
            }
        }

        // If total petrol is less than total distance, no solution
        return (totalPetrol >= totalDistance) ? startIndex : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 5, 7, 4};
        int[] distance = {6, 6, 3, 5};

        int start = findStartingPoint(petrol, distance);
        if (start == -1) {
            System.out.println("No solution exists.");
        } else {
            System.out.println("Start at petrol pump index: " + start);
        }
    }
}
