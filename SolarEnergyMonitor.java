import java.util.Scanner;

public class SolarEnergyMonitor {

    // Method for 2c: Calculate total energy generated
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Part 2a: Data Types ---
        System.out.println("=== 2a) Solar System Details ===");
        int panelId = 101;
        double energyGenerated = 15.5; // kWh
        int numberOfPanels = 12;
        char systemStatus = 'A'; // 'A' for Active

        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated (kWh): " + energyGenerated);
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
        System.out.println();

        // --- Part 2b: If-Else Condition ---
        System.out.println("=== 2b) Energy Generation Monitoring ===");
        System.out.print("Enter the energy generated in kWh: ");
        double inputEnergy = scanner.nextDouble();

        if (inputEnergy >= 10.0) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }
        System.out.println();

        // --- Part 2c: Methods ---
        System.out.println("=== 2c) Total Energy Calculation ===");
        System.out.print("Enter morning energy generation (kWh): ");
        double morning = scanner.nextDouble();

        System.out.print("Enter evening energy generation (kWh): ");
        double evening = scanner.nextDouble();

        // Calling the method
        double totalEnergy = calculateTotalEnergy(morning, evening);
        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        scanner.close();
    }
}