package DroneProblem;

import java.util.Scanner;

/**
 * Solves the Amazon Drone Delivery Optimization problem using Binary Search.
 * * The goal is to find the minimum total time (T) required for two drones to complete
 * their deliveries (D1 and D2), given the constraints:
 * 1. Each delivery takes exactly 1 hour.
 * 2. Only one drone can deliver at any given hour (mutual exclusion).
 * 3. Drone 1 must charge for 1 hour at every multiple of C1 hours (i.e., at T=C1, 2*C1, 3*C1...).
 * 4. Drone 2 must charge for 1 hour at every multiple of C2 hours.
 * * The minimum time is found by searching for the smallest T for which the combined
 * total delivery time available is sufficient for all required deliveries (D1 + D2).
 */
public class DroneScheduler {

    /**
     * Finds the Greatest Common Divisor (GCD) of two numbers using the Euclidean algorithm.
     * This is necessary to calculate the Least Common Multiple (LCM).
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of a and b.
     */
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Finds the Least Common Multiple (LCM) of two numbers.
     * LCM is used to find the overlap frequency of the two drones' charging schedules.
     * Formula: LCM(a, b) = (|a * b|) / GCD(a, b)
     * @param a The first number.
     * @param b The second number.
     * @return The LCM of a and b.
     */
    private static long lcm(long a, long b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a * b) / gcd(a, b);
    }

    /**
     * Checks if both drones can complete their deliveries within a total time T,
     * considering all charging and single-delivery constraints.
     * * @param T The total time (in hours) to check (search parameter).
     * @param C1 Charging interval for Drone 1.
     * @param D1 Deliveries required by Drone 1.
     * @param C2 Charging interval for Drone 2.
     * @param D2 Deliveries required by Drone 2.
     * @return True if all deliveries can be completed in time T, false otherwise.
     */
    private static boolean isValid(long T, long C1, long D1, long C2, long D2) {
        // 1. Minimum Time Check: T must be large enough to cover the max individual requirement.
        if (T < D1 || T < D2) {
            return false;
        }

        // 2. Individual Capacity Check:
        // N_Ci is the number of 1-hour charging periods D_i is forced to take in time T.
        long N_C1 = T / C1;
        long N_C2 = T / C2;

        // Check if D1's deliveries fit into the time available for D1.
        // Available time for D1 is T minus D1's required charging hours.
        if (D1 > (T - N_C1) || D2 > (T - N_C2)) {
            return false;
        }

        // 3. Combined Capacity Check (The core optimization logic):

        // L is the LCM of C1 and C2, representing the interval at which charging overlaps repeat.
        long L = lcm(C1, C2);
        // N_Overlap is the number of hours where BOTH drones are charging simultaneously.
        long N_Overlap = T / L;

        // Total unique charging hours (H_Charge_Total):
        // This uses the principle of inclusion-exclusion: |A U B| = |A| + |B| - |A intersection B|
        long H_Charge_Total = N_C1 + N_C2 - N_Overlap;

        // Total hours available for deliveries (when neither drone is charging).
        long H_Delivery_Available = T - H_Charge_Total;

        // The total number of required deliveries (D1 + D2) must fit into
        // the total available delivery slots (H_Delivery_Available).
        return (D1 + D2) <= H_Delivery_Available;
    }

    /**
     * Finds the minimum total time (in hours) required for both drones to finish all deliveries.
     * This function uses Binary Search over the possible range of total time T.
     * * @param charge1 Charging interval for Drone 1 (C1).
     * @param delivery1 Deliveries required by Drone 1 (D1).
     * @param charge2 Charging interval for Drone 2 (C2).
     * @param delivery2 Deliveries required by Drone 2 (D2).
     * @return The minimum total time in hours.
     */
    public static long minDeliveryTime(int charge1, long delivery1, int charge2, long delivery2) {
        // Cast input parameters to long to safely handle large delivery counts (up to 10^9).
        long C1 = charge1;
        long D1 = delivery1;
        long C2 = charge2;
        long D2 = delivery2;

        // Binary Search Range Setup:
        // Lower Bound: Minimum time must be at least the max individual delivery time.
        long low = Math.max(D1, D2);

        // Upper Bound: A sufficiently large number (e.g., 4 * 10^9) to cover all possible cases.
        // (D1 + D2) max is 2*10^9, and adding buffer for charging hours keeps the bound safe.
        long high = 4_000_000_000L;

        long minTime = high;

        while (low <= high) {
            long mid = low + (high - low) / 2; // Prevent integer overflow

            if (isValid(mid, C1, D1, C2, D2)) {
                // If 'mid' time is valid, it's a potential answer.
                // Store it and search for a smaller time.
                minTime = mid;
                high = mid - 1;
            } else {
                // If 'mid' time is not valid, we need more time.
                low = mid + 1;
            }
        }

        return minTime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("--- Drone Delivery Optimization ---");

            System.out.print("Enter Drone 1 charging interval (C1 in hours): ");
            int c1 = scanner.nextInt();

            System.out.print("Enter Drone 1 required deliveries (D1): ");
            long d1 = scanner.nextLong();

            System.out.print("Enter Drone 2 charging interval (C2 in hours): ");
            int c2 = scanner.nextInt();

            System.out.print("Enter Drone 2 required deliveries (D2): ");
            long d2 = scanner.nextLong();

            long result = minDeliveryTime(c1, d1, c2, d2);

            System.out.println("\nCalculated Minimum Total Time Required: " + result + " hours");


        } catch (Exception e) {
            System.err.println("An error occurred during input or calculation: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


