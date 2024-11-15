import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Constants {
    private final double speedOfLight = 2.99792458e8;              // Speed of light in vacuum (m/s)
    private final double gravitationalConstant = 6.67430e-11;      // Gravitational constant (m^3 kg^-1 s^-2)
    private final double planckConstant = 6.62607015e-34;          // Planck's constant (J·s)
    private final double reducedPlanckConstant = 1.0545718e-34;    // Reduced Planck's constant (J·s)
    private final double elementaryCharge = 1.602176634e-19;       // Elementary charge (C)
    private final double avogadroNumber = 6.02214076e23;           // Avogadro's number (mol^-1)
    private final double boltzmannConstant = 1.380649e-23;         // Boltzmann's constant (J/K)
    private final double gasConstant = 8.314462618;                // Ideal gas constant (J·mol^-1·K^-1)
    private final double faradayConstant = 96485.33212;            // Faraday's constant (C/mol)
    private final double stefanBoltzmannConstant = 5.670374419e-8; // Stefan-Boltzmann constant (W·m^-2·K^-4)
    private final double rydbergConstant = 1.0973731568508e7;      // Rydberg constant (m^-1)
    private final double massProton = 1.67262192369e-27;           // Mass of a proton (kg)
    private final double massNeutron = 1.67492749804e-27;          // Mass of a neutron (kg)
    private final double massElectron = 9.1093837015e-31;          // Mass of an electron (kg)
    private final double atomicMassUnit = 1.66053906660e-27;       // Atomic mass unit (kg)
    private final double fineStructureConstant = 7.2973525693e-3;  // Fine structure constant (dimensionless)
    private final double bohrRadius = 5.29177210903e-11;           // Bohr radius (m)
    private final double vacuumPermittivity = 8.8541878128e-12;    // Vacuum permittivity (F·m^-1)
    private final double vacuumPermeability = 4 * Math.PI * 1e-7;  // Vacuum permeability (N·A^-2)
    private final double coulombConstant = 8.9875517873681764e9;   // Coulomb's constant (N·m^2·C^-2)
    private final double magneticFluxQuantum = 2.067833848e-15;    // Magnetic flux quantum (Wb)
    private final double molarGasVolumeSTP = 22.414;               // Molar gas volume at standard temperature and pressure (L/mol)
    private final double standardAtmosphere = 101325;              // Standard atmosphere (Pa)
    private final double loschmidtNumber = 2.6867811e25;           // Loschmidt's number (m^-3)
    private final double refractiveIndexVacuum = 1.0;              // Refractive index of vacuum (dimensionless)
    private final double refractiveIndexAir = 1.0003;              // Refractive index of air (dimensionless)
    private final double planckLength = 1.616255e-35;              // Planck length (m)
    private final double planckTime = 5.391247e-44;                // Planck time (s)
    private final double planckTemperature = 1.416808e32;          // Planck temperature (K)
    private final double specificHeatCapacityWater = 4.186;        // Specific heat capacity of water (J/(g·K))
    private final double gravityEarthSurface = 9.80665;            // Acceleration due to gravity at Earth's surface (m/s^2)
    private final double earthMeanRadius = 6.371e6;                // Mean radius of Earth (m)
    private final double earthMass = 5.972e24;                     // Mass of Earth (kg)
    private final double astronomicalUnit = 1.496e11;              // Astronomical unit (m)
    private final double parsec = 3.085677581e16;                  // Parsec (m)
    private final double lightYear = 9.4607e15;                    // Light year (m)
    private final double hubbleConstant = 67.4;                    // Hubble's constant (km/s/Mpc)
    private final double cosmologicalConstant = 1.1056e-52;        // Cosmological constant (m^-2)
    private final double decayConstantCarbon14 = 1.21e-4;          // Decay constant for Carbon-14 (s^-1)
    private final double curie = 3.7e10;                           // Curie (decays/s)
    private final double electronVoltToJoules = 1.60218e-19;       // Conversion from electron volts to joules (J)
    private final double atomicMassUnitToMeV = 931.494;            // Conversion from atomic mass unit to MeV
    private final double joulesPerCalorie = 4.184;                 // Conversion from calories to joules (J)
    // Method to get the value of a constant
    public double getConstant(String constantName) {
        return switch (constantName) {
            case "c" -> speedOfLight;
            case "G" -> gravitationalConstant;
            case "h" -> planckConstant;
            case "ħ" -> reducedPlanckConstant;
            case "e" -> elementaryCharge;
            case "N_A" -> avogadroNumber;
            case "k" -> boltzmannConstant;
            case "R" -> gasConstant;
            case "F" -> faradayConstant;
            case "σ" -> stefanBoltzmannConstant;
            case "R_inf" -> rydbergConstant;
            case "m_p" -> massProton;
            case "m_n" -> massNeutron;
            case "m_e" -> massElectron;
            case "u" -> atomicMassUnit;
            case "α" -> fineStructureConstant;
            case "a_0" -> bohrRadius;
            case "ε₀" -> vacuumPermittivity;
            case "μ₀" -> vacuumPermeability;
            case "k_e" -> coulombConstant;
            case "Φ₀" -> magneticFluxQuantum;
            case "V_m" -> molarGasVolumeSTP;
            case "P₀" -> standardAtmosphere;
            case "n" -> loschmidtNumber;
            case "n_vacuum" -> refractiveIndexVacuum;
            case "n_air" -> refractiveIndexAir;
            case "l_P" -> planckLength;
            case "t_P" -> planckTime;
            case "T_P" -> planckTemperature;
            case "c_w" -> specificHeatCapacityWater;
            case "g" -> gravityEarthSurface;
            case "R_E" -> earthMeanRadius;
            case "M_E" -> earthMass;
            case "AU" -> astronomicalUnit;
            case "pc" -> parsec;
            case "ly" -> lightYear;
            case "H₀" -> hubbleConstant;
            case "Λ" -> cosmologicalConstant;
            case "λ_C14" -> decayConstantCarbon14;
            case "Ci" -> curie;
            case "eV_to_J" -> electronVoltToJoules;
            case "u_to_MeV" -> atomicMassUnitToMeV;
            case "J_per_cal" -> joulesPerCalorie;
            default -> Double.NaN;
        };
    }
    // Method to get the unit of a constant
    public String getUnit(String constantName) {
        return switch (constantName) {
            case "c" -> "m/s";
            case "G" -> "m^3 kg^-1 s^-2";
            case "h" -> "J·s";
            case "ħ" -> "J·s";
            case "e" -> "C";
            case "N_A" -> "mol^-1";
            case "k" -> "J/K";
            case "R" -> "J·mol^-1·K^-1";
            case "F" -> "C/mol";
            case "σ" -> "W·m^-2·K^-4";
            case "R_inf" -> "m^-1";
            case "m_p" -> "kg";
            case "m_n" -> "kg";
            case "m_e" -> "kg";
            case "u" -> "kg";
            case "α" -> "dimensionless";
            case "a_0" -> "m";
            case "ε₀" -> "F·m^-1";
            case "μ₀" -> "N·A^-2";
            case "k_e" -> "N·m^2·C^-2";
            case "Φ₀" -> "Wb";
            case "V_m" -> "L/mol";
            case "P₀" -> "Pa";
            case "n" -> "m^-3";
            case "n_vacuum" -> "dimensionless";
            case "n_air" -> "dimensionless";
            case "l_P" -> "m";
            case "t_P" -> "s";
            case "T_P" -> "K";
            case "c_w" -> "J/(g·K)";
            case "g" -> "m/s^2";
            case "R_E" -> "m";
            case "M_E" -> "kg";
            case "AU" -> "m";
            case "pc" -> "m";
            case "ly" -> "m";
            case "H₀" -> "km/s/Mpc";
            case "Λ" -> "m^-2";
            case "λ_C14" -> "s^-1";
            case "Ci" -> "decays/s";
            case "eV_to_J" -> "J";
            case "u_to_MeV" -> "MeV";
            case "J_per_cal" -> "J";
            default -> "Unknown";
        };
    }
}
public class Calculator {
    static Scanner scan = new Scanner(System.in);

    public static void main(String... sdsd) {
    int choice;
    do {
        // Display the menu options to the user
        System.out.println("Please select an option:");
        System.out.println("1. Simple Calculator");
        System.out.println("2. Unit Converter");
        System.out.println("3. Number System Converter");
        System.out.println("4. Constants");
        System.out.println("0. Exit");
        choice = scan.nextInt();

        switch(choice) {
            case 1 -> simpleCalc();
            case 2 -> unitConv();
            case 3 -> numConvert();
            case 4 -> constant();
            case 0 -> System.out.println("Exiting...");
            default -> System.out.println("Invalid choice. Please re-enter.");
        }
    } while (choice != 0);
    }

    public static void unitConv() {
        while (true) { 
            // Display the menu options to the user
            System.out.println("Convert unit of : ");
            System.out.printf("%-20s %-20s %-20s%n", " 1. Length", " 2. Area", " 3. Volume");
            System.out.printf("%-20s %-20s %-20s%n", " 4. Force", " 5. Mass", " 6. Pressure");
            System.out.printf("%-20s %-20s %-20s%n", " 7. Energy", " 8. Heat", " 9. Temperature");
            System.out.printf("%-20s %-20s %-20s%n", "10. Power", "11. Speed", "12. Data");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (1-12): "); 
            int choice = scan.nextInt();
            if (choice == 0) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            switch (choice) {
                case 1 -> length();     // Call length conversion method
                case 2 -> area();       // Call area conversion method
                case 3 -> volume();     // Call volume conversion method
                case 4 -> force();      // Call force conversion method
                case 5 -> mass();       // Call mass conversion method
                case 6 -> pressure();   // Call pressure conversion method
                case 7 -> energy();     // Call energy conversion method
                case 8 -> heat();       // Call heat conversion method
                case 9 -> temperature();// Call temperature conversion method
                case 10 -> power();     // Call power conversion method
                case 11 -> speed();     // Call speed conversion method
                case 12 -> data();      // Call data conversion method
                default -> System.out.println("Invalid choice. Please re-enter.");
            }
        }
    }

    private static void numConvert() {
        System.out.println();
        System.out.print("Enter the value (Only positive values): ");
        scan.nextLine();
        String number = scan.nextLine();
        System.out.print("Convert from (binary, decimal, octal, hex): ");
        String from = scan.nextLine().toLowerCase();
        System.out.print("Convert to (binary, decimal, octal, hex): ");
        String to = scan.nextLine().toLowerCase();
        int decimalValue;
        switch (from) {
            case "binary" ->
                decimalValue = Integer.parseInt(number, 2);
            case "decimal" ->
                decimalValue = Integer.parseInt(number);
            case "octal" ->
                decimalValue = Integer.parseInt(number, 8);
            case "hex" ->
                decimalValue = Integer.parseInt(number, 16);
            default -> {
                System.out.println("Invalid number system.");
                return;
            }
        }
        String result;
        switch (to) {
            case "binary" -> 
                result = Integer.toBinaryString(decimalValue); 
            case "decimal" -> 
                result = String.valueOf(decimalValue); 
            case "octal" -> 
                result = Integer.toOctalString(decimalValue); 
            case "hex" -> 
                result = Integer.toHexString(decimalValue).toUpperCase(); 
            default -> {
                System.out.println("Invalid number system.");
                return;
            }
        }
        System.out.println("Converted value: " + result);
    }

    private static void constant() {
        Constants constant = new Constants();
            System.out.println("Select a physical constant:");
            System.out.println("1. Speed of light (c)");
            System.out.println("2. Gravitational constant (G)");
            System.out.println("3. Planck's constant (h)");
            System.out.println("4. Reduced Planck's constant (ħ)");
            System.out.println("5. Elementary charge (e)");
            System.out.println("6. Avogadro's number (N_A)");
            System.out.println("7. Boltzmann's constant (k)");
            System.out.println("8. Ideal gas constant (R)");
            System.out.println("9. Faraday's constant (F)");
            System.out.println("10. Stefan-Boltzmann constant (σ)");
            System.out.println("11. Rydberg constant (R_inf)");
            System.out.println("12. Mass of proton (m_p)");
            System.out.println("13. Mass of neutron (m_n)");
            System.out.println("14. Mass of electron (m_e)");
            System.out.println("15. Atomic mass unit (u)");
            System.out.println("16. Fine structure constant (α)");
            System.out.println("17. Bohr radius (a_0)");
            System.out.println("18. Vacuum permittivity (ε₀)");
            System.out.println("19. Vacuum permeability (μ₀)");
            System.out.println("20. Coulomb's constant (k_e)");
            System.out.println("21. Magnetic flux quantum (Φ₀)");
            System.out.println("22. Molar gas volume at STP (V_m)");
            System.out.println("23. Standard atmosphere (P₀)");
            System.out.println("24. Loschmidt's number (n)");
            System.out.println("25. Refractive index of vacuum (n_vacuum)");
            System.out.println("26. Refractive index of air (n_air)");
            System.out.println("27. Planck length (l_P)");
            System.out.println("28. Planck time (t_P)");
            System.out.println("29. Planck temperature (T_P)");
            System.out.println("30. Specific heat capacity of water (c_w)");
            System.out.println("31. Gravity at Earth's surface (g)");
            System.out.println("32. Mean radius of Earth (R_E)");
            System.out.println("33. Mass of Earth (M_E)");
            System.out.println("34. Astronomical unit (AU)");
            System.out.println("35. Parsec (pc)");
            System.out.println("36. Light year (ly)");
            System.out.println("37. Hubble's constant (H₀)");
            System.out.println("38. Cosmological constant (Λ)");
            System.out.println("39. Decay constant for Carbon-14 (λ_C14)");
            System.out.println("40. Curie (Ci)");
            System.out.println("41. Conversion from eV to J (eV_to_J)");
            System.out.println("42. Conversion from atomic mass unit to MeV (u_to_MeV)");
            System.out.println("43. Conversion from calories to joules (J_per_cal)");
            int choice = scan.nextInt();
            String constantName;
            constantName = switch (choice) {
                case 1 -> "c";
                case 2 -> "G";
                case 3 -> "h";
                case 4 -> "ħ";
                case 5 -> "e";
                case 6 -> "N_A";
                case 7 -> "k";
                case 8 -> "R";
                case 9 -> "F";
                case 10 -> "σ";
                case 11 -> "R_inf";
                case 12 -> "m_p";
                case 13 -> "m_n";
                case 14 -> "m_e";
                case 15 -> "u";
                case 16 -> "α";
                case 17 -> "a_0";
                case 18 -> "ε₀";
                case 19 -> "μ₀";
                case 20 -> "k_e";
                case 21 -> "Φ₀";
                case 22 -> "V_m";
                case 23 -> "P₀";
                case 24 -> "n";
                case 25 -> "n_vacuum";
                case 26 -> "n_air";
                case 27 -> "l_P";
                case 28 -> "t_P";
                case 29 -> "T_P";
                case 30 -> "c_w";
                case 31 -> "g";
                case 32 -> "R_E";
                case 33 -> "M_E";
                case 34 -> "AU";
                case 35 -> "pc";
                case 36 -> "ly";
                case 37 -> "H₀";
                case 38 -> "Λ";
                case 39 -> "λ_C14";
                case 40 -> "Ci";
                case 41 -> "eV_to_J";
                case 42 -> "u_to_MeV";
                case 43 -> "J_per_cal";
                default -> "";
            };
            double constantValue = constant.getConstant(constantName);
            String unit = constant.getUnit(constantName);
            // Check if the constant value is NaN before printing
            if (!Double.isNaN(constantValue)) {
                System.out.printf("%s = %.10e %s\n", constantName, constantValue, unit);
            } else {
                System.out.println("Error: Unknown constant.");
            }
            /*
            The expression !Double.isNaN(constantValue) is a condition that checks whether the variable constantValue is not a "Not-a-Number" (NaN) value.
            Here's a breakdown of its components:
            Double.isNaN(double value): This is a static method in the Double class in Java that checks if the provided value is NaN.
            It returns true if the value is NaN and false otherwise.
            !(Logical NOT Operator): This operator negates the boolean value. So, if Double.isNaN(constantValue) returns true,
            !Double.isNaN(constantValue) will return false, and vice versa.
             */
    }
    
    private static void speed() {
        System.out.println();
        System.out.print("Enter speed value(NOTE : Values should be positive real numbers): ");
        double speed = scan.nextDouble();
        System.out.print("Enter unit to convert from (m/s, km/h, mph, ft/s, knots): ");
        scan.nextLine();
        String fromUnit = scan.nextLine().toLowerCase();
        System.out.print("Enter unit to convert to (m/s, km/h, mph, ft/s, knots): ");
        String toUnit = scan.nextLine().toLowerCase();
        double speedConvert = convertSpeed(speed, fromUnit, toUnit);
        if (speedConvert >= 0) {
            System.out.printf("Converted speed: %.4f %s%n", speedConvert, toUnit);
        } else {
            System.out.println("Invalid unit provided for conversion.");
        }
    }
    
    private static double convertSpeed(double speed, String fromUnit, String toUnit) {
        double speedInMPS;
        switch(fromUnit.toLowerCase()) {
            case "m/s" -> speedInMPS = speed;
            case "km/h" -> speedInMPS = speed * 1/3.6;
            case "mph" -> speedInMPS = speed * 0.44704;
            case "ft/s" -> speedInMPS = speed *  0.3048;
            case "knots" -> speedInMPS = speed * 0.514444;
            default -> speedInMPS = -1;
        }
        if (speedInMPS < 0) return -1;
        return switch (toUnit) {
            case "m/s" -> speedInMPS;
            case "km/h" -> speedInMPS * 3.6;
            case "mph" -> speedInMPS * 2.23694;
            case "ft/s" -> speedInMPS * 3.28084;
            case "knots" -> speedInMPS * 1.94384;
            default -> -1;
        };
    }

    private static void length() {
        System.out.println();
        System.out.println("Enter the Value(NOTE: Value should be positve real number) : ");
        double lenght = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the unit to convert from(mm,cm,m,km,miles,inch,ft(feet),yd(yard),nmi(nautical mile))");
        String fromUnit = scan.nextLine().toLowerCase();
        System.out.println("Enter the unit to convert to(mm,cm,m,km,miles,inch,ft,yd,nmi(nautical mile))");
        String toUnit = scan.nextLine().toLowerCase();
        double convertLength = convertLength(lenght, fromUnit, toUnit);
        if(convertLength >= 0) {
            System.out.printf("Converted Lenght: %.4f %s%n",convertLength,toUnit);
        }else {
            System.out.println("Invalid unit provided for conversion.");
        }
    }
    
    private static double convertLength(double length, String fromUnit, String toUnit) {
        double lengthInMeter;
        
        switch (fromUnit) {
            case "mm" -> lengthInMeter = length * 0.001;
            case "cm" -> lengthInMeter = length * 0.01;
            case "m" -> lengthInMeter = length;
            case "km" -> lengthInMeter = length * 1000;
            case "inch" -> lengthInMeter = length * 0.0254;
            case "ft" -> lengthInMeter = length * 0.3048;
            case "yd" -> lengthInMeter = length * 0.9144;
            case "mile" -> lengthInMeter = length * 1609.34;
            case "nmi" -> lengthInMeter = length * 1852;
            default -> lengthInMeter = -1;
        }
        if (lengthInMeter < 0) return -1;
        return switch (toUnit) {
            case "mm" -> 1000 * lengthInMeter;
            case "cm" -> 100 * lengthInMeter;
            case "m" -> lengthInMeter;
            case "km" -> 0.001 * lengthInMeter;
            case "inch" -> 39.3701 * lengthInMeter;
            case "ft" -> 3.28084 * lengthInMeter;
            case "yd" -> 1.09361 * lengthInMeter;
            case "mile" -> 0.000621371 * lengthInMeter;
            case "nmi" -> 0.000539957 * lengthInMeter;
            default -> -1;
        };
    }
    
    private static void area() {
        System.out.println();
        System.out.println("Enter the Value(NOTE: Value should be positve real number) : ");
        double area = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the unit to convert from");
        System.out.println("sq.m(Square Meters),sq.km(Square KMs),sq.mi(Square Miles),sq.yd(Square Yards),sq.ft(Square Feet),acre,hectare");
        String fromUnit = scan.nextLine().toLowerCase();
        System.out.println("Enter the unit to convert to");
        System.out.println("sq.m(Square Meters),sq.km(Square KMs),sq.mi(Square Miles),sq.yd(Square Yards),sq.ft(Square Feet),acre,hectare");
        String toUnit = scan.nextLine().toLowerCase();
        double convertArea = convertArea(area, fromUnit, toUnit);
        if(convertArea >= 0) {
            System.out.printf("Converted Lenght: %.4f %s%n",convertArea,toUnit);
        }else {
            System.out.println("Invalid unit provided for conversion.");
        }
    }

    private static double convertArea(double area, String fromUnit, String toUnit) {
        double areaInsqm;
        switch (fromUnit) {
            case "sq.m" -> areaInsqm = area;
            case "sq.km" -> areaInsqm = area * 1000000;
            case "sq.mi" -> areaInsqm = area * 2589988.11;
            case "sq.yd" -> areaInsqm = area * 0.836127;
            case "sq.ft" -> areaInsqm = area * 0.092903;
            case "acre" -> areaInsqm = area * 4046.86;
            case "hectare" -> areaInsqm = area * 10000;
            default -> areaInsqm = -1;
        }
        if (areaInsqm < 0) return -1;
        return switch(toUnit) {
            case "sq.m" -> areaInsqm;
            case "sq.km" -> areaInsqm * 0.000001;
            case "sq.mi" -> areaInsqm / 2589988.11;
            case "sq.yd" -> areaInsqm * 1.19599;
            case "sq.ft" -> areaInsqm * 10.7639;
            case "acre" -> areaInsqm * 0.000247105;
            case "hectare" -> areaInsqm * 0.0001;
            default -> -1;
        };
    }

    private static void volume() {
        System.out.println();
        System.out.println("Enter the Value (NOTE: Value should be positive real number): ");
        double volume = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the unit to convert from (c.m, ltr, ml, c.cm, us.gallon, uk.gallon, c.inch, c.feet)");
        String fromUnit = scan.nextLine().toLowerCase();
        System.out.println("Enter the unit to convert to (c.m, ltr, ml, c.cm, us.gallon, uk.gallon, c.inch, c.feet)");
        String toUnit = scan.nextLine().toLowerCase();
        double convertVolume = convertVolume(volume, fromUnit, toUnit);
        if (convertVolume >= 0) {
            System.out.printf("Converted Volume: %.4f %s%n", convertVolume, toUnit);
        } else {
            System.out.println("Invalid unit provided for conversion.");
        }
    }

    private static double convertVolume(double volume, String fromUnit, String toUnit) {
        double volumeInCubicMeters;

        switch (fromUnit) {
            case "c.m" -> volumeInCubicMeters = volume;
            case "ltr" -> volumeInCubicMeters = volume * 0.001;
            case "ml" -> volumeInCubicMeters = volume * 0.000001;
            case "c.cm" -> volumeInCubicMeters = volume * 0.000001;
            case "us.gallon" -> volumeInCubicMeters = volume * 0.00378541;
            case "uk.gallon" -> volumeInCubicMeters = volume * 0.00454609;
            case "c.inch" -> volumeInCubicMeters = volume * 0.0000163871;
            case "c.feet" -> volumeInCubicMeters = volume * 0.0283168;
            default -> volumeInCubicMeters = -1;
        }
        if (volumeInCubicMeters < 0) return -1;
        return switch (toUnit) {
            case "c.m" -> volumeInCubicMeters;
            case "ltr" -> volumeInCubicMeters * 1000;
            case "ml" -> volumeInCubicMeters * 1000000;
            case "c.cm" -> volumeInCubicMeters * 1000000;
            case "us.gallon" -> volumeInCubicMeters * 264.172;
            case "uk.gallon" -> volumeInCubicMeters * 219.969;
            case "c.inch" -> volumeInCubicMeters * 61023.7;
            case "c.feet" -> volumeInCubicMeters * 35.3147;
            default -> -1;
        };
    }
    
    private static void force() {
        System.out.println();
        System.out.print("Enter force value (NOTE: Value should be positive real number): ");
        double force = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the unit to convert from (N, kN, dyn)");
        String fromUnit = scan.next().toUpperCase();
        System.out.println("Enter the unit to convert to (N, kN, dyn)");
        String toUnit = scan.next().toUpperCase();
        double convertedForce = convertForce(force, fromUnit, toUnit);
        if (convertedForce >= 0) {
            System.out.printf("Converted Force: %.4f %s%n", convertedForce, toUnit);
        } else {
            System.out.println("Invalid unit provided for conversion.");
        }
    }

    private static double convertForce(double force, String fromUnit, String toUnit) {
        double forceInNewtons;
        switch (fromUnit) {
            case "N" -> forceInNewtons = force;
            case "KN" -> forceInNewtons = force * 1000; 
            case "DYN" -> forceInNewtons = force * 0.00001; 
            default -> forceInNewtons = -1; 
        }
        if (forceInNewtons < 0) return -1;
        return switch (toUnit) {
            case "N" -> forceInNewtons;
            case "KN" -> forceInNewtons * 0.001;
            case "DYN" -> forceInNewtons * 100000;
            default -> -1;
        };
    }

    private static void pressure() {
        System.out.println();
        System.out.print("Enter pressure value (NOTE: Value should be positive real number): ");
        double pressure = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the unit to convert from (Pa, kPa, bar, atm, mmHg, psi)");
        String fromUnit = scan.nextLine().toLowerCase();
        System.out.println("Enter the unit to convert to (Pa, kPa, bar, atm, mmHg, psi)");
        String toUnit = scan.nextLine().toLowerCase();
        double convertedPressure = convertPressure(pressure, fromUnit, toUnit);
        if (convertedPressure >= 0) {
            System.out.printf("Converted Pressure: %.4f %s%n", convertedPressure, toUnit);
        } else {
            System.out.println("Invalid unit provided for conversion.");
        }
    }

    private static double convertPressure(double pressure, String fromUnit, String toUnit) {
        double pressureInPascals;
        switch (fromUnit) {
            case "pa" -> pressureInPascals = pressure;
            case "kpa" -> pressureInPascals = pressure * 1000;
            case "bar" -> pressureInPascals = pressure * 100000; 
            case "atm" -> pressureInPascals = pressure * 101325; 
            case "mmhg" -> pressureInPascals = pressure * 133.322;
            case "psi" -> pressureInPascals = pressure * 6894.76; 
            default -> pressureInPascals = -1;
        }
        if (pressureInPascals < 0) return -1;
        return switch (toUnit) {
            case "pa" -> pressureInPascals;
            case "kpa" -> pressureInPascals / 1000;
            case "bar" -> pressureInPascals / 100000;
            case "atm" -> pressureInPascals / 101325;
            case "mmhg" -> pressureInPascals / 133.322;
            case "psi" -> pressureInPascals / 6894.76;
            default -> -1;
        };
    }

    private static void energy() {
        System.out.println();
        System.out.print("Enter energy value (NOTE: Value should be positive real number): ");
        double energy = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the unit to convert from (J, kJ, cal, kcal, eV, Wh(Watt Hour), kWh)");
        String fromUnit = scan.nextLine().toLowerCase();
        System.out.println("Enter the unit to convert to (J, kJ, cal, kcal, eV, Wh(Watt Hour), kWh)");
        String toUnit = scan.nextLine().toLowerCase();
        double convertedEnergy = convertEnergy(energy, fromUnit, toUnit);
        if (convertedEnergy >= 0) {
            System.out.printf("Converted Energy: %.4f %s%n", convertedEnergy, toUnit);
        } else {
            System.out.println("Invalid unit provided for conversion.");
        }
    }

    private static double convertEnergy(double energy, String fromUnit, String toUnit) {
        double energyInJoules;
        switch (fromUnit) {
            case "j" -> energyInJoules = energy;
            case "kj" -> energyInJoules = energy * 1000; 
            case "cal" -> energyInJoules = energy * 4.184;
            case "kcal" -> energyInJoules = energy * 4184; 
            case "ev" -> energyInJoules = energy * 1.60218e-19;
            case "wh" -> energyInJoules = energy * 3600;
            case "kwh" -> energyInJoules = energy * 3.6e6;
            default -> energyInJoules = -1;
        }
        if (energyInJoules < 0) return -1;
        return switch (toUnit) {
            case "j" -> energyInJoules;
            case "kj" -> energyInJoules / 1000; 
            case "cal" -> energyInJoules / 4.184;
            case "kcal" -> energyInJoules / 4184; 
            case "ev" -> energyInJoules / 1.60218e-19; 
            case "wh" -> energyInJoules / 3600; 
            case "kwh" -> energyInJoules / 3.6e6; 
            default -> -1;
        };
    }

    private static void mass() {
        System.out.println();
        System.out.print("Enter mass value (NOTE: Value should be positive real number): ");
        double mass = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the unit to convert from (kg, g, mg, lb(Pounds), oz(Ounce))");
        String fromUnit = scan.nextLine().toLowerCase();
        System.out.println("Enter the unit to convert to (kg, g, mg, lb(Pounds), oz(Ounce))");
        String toUnit = scan.nextLine().toLowerCase();
        double convertedMass = convertMass(mass, fromUnit, toUnit);
        if (convertedMass >= 0) {
            System.out.printf("Converted Mass: %.4f %s%n", convertedMass, toUnit);
        } else {
            System.out.println("Invalid unit provided for conversion.");
        }
    }

    private static double convertMass(double mass, String fromUnit, String toUnit) {
        double massInKilograms;
        switch (fromUnit) {
            case "kg" -> massInKilograms = mass;
            case "g" -> massInKilograms = mass * 0.001;
            case "mg" -> massInKilograms = mass * 1e-6; 
            case "lb" -> massInKilograms = mass * 0.453592; 
            case "oz" -> massInKilograms = mass * 0.0283495; 
            default -> massInKilograms = -1; 
        }

        if (massInKilograms < 0) return -1; 

        return switch (toUnit) {
            case "kg" -> massInKilograms;
            case "g" -> massInKilograms / 0.001; 
            case "mg" -> massInKilograms / 1e-6; 
            case "lb" -> massInKilograms / 0.453592;
            case "oz" -> massInKilograms / 0.0283495;
            default -> -1;
        };
    }

    private static void heat() {
        System.out.println();
        System.out.print("Enter heat value (NOTE: Value should be positive real number): ");
        double heat = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the unit to convert from (J, cal, kJ, kcal)");
        String fromUnit = scan.nextLine().toLowerCase();
        System.out.println("Enter the unit to convert to (J, cal, kJ, kcal)");
        String toUnit = scan.nextLine().toLowerCase();
        double convertedHeat = convertHeat(heat, fromUnit, toUnit);
        if (convertedHeat >= 0) {
            System.out.printf("Converted Heat: %.4f %s%n", convertedHeat, toUnit);
        } else {
            System.out.println("Invalid unit provided for conversion.");
        }
    }

    private static double convertHeat(double heat, String fromUnit, String toUnit) {
        double heatInJoules;
        switch (fromUnit) {
            case "j" -> heatInJoules = heat;
            case "cal" -> heatInJoules = heat * 4.184; 
            case "kj" -> heatInJoules = heat * 1000; 
            case "kcal" -> heatInJoules = heat * 4184;
            default -> heatInJoules = -1; 
        }
        if (heatInJoules < 0) return -1; 
        return switch (toUnit) {
            case "j" -> heatInJoules;
            case "cal" -> heatInJoules / 4.184; 
            case "kj" -> heatInJoules / 1000; 
            case "kcal" -> heatInJoules / 4184;
            default -> -1; 
        };
    }

    private static void temperature() {
        System.out.println();
        System.out.print("Enter temperature value (NOTE: Value should be a real number): ");
        double temperature = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the unit to convert from (C, F, K)");
        String fromUnit = scan.next().toUpperCase();
        System.out.println("Enter the unit to convert to (C, F, K)");
        String toUnit = scan.next().toUpperCase();
        double convertedTemperature = convertTemperature(temperature, fromUnit, toUnit);
        if (convertedTemperature >= 0) {
            System.out.printf("Converted Temperature: %.4f %s%n", convertedTemperature, toUnit);
        } else {
            System.out.println("Invalid unit provided for conversion.");
        }
    }

    private static double convertTemperature(double temperature, String fromUnit, String toUnit) {
        if (fromUnit.equals(toUnit)) return temperature;
        double temperatureInCelsius;
        switch (fromUnit) {
            case "C" -> temperatureInCelsius = temperature;
            case "F" -> temperatureInCelsius = (temperature - 32) * 5 / 9;
            case "K" -> temperatureInCelsius = temperature - 273.15; 
            default -> temperatureInCelsius = -1; 
        }

        return switch (toUnit) {
            case "C" -> temperatureInCelsius; 
            case "F" -> (temperatureInCelsius * 9 / 5) + 32; 
            case "K" -> temperatureInCelsius + 273.15; 
            default -> -1; 
        };
    }

    private static void power() {
        System.out.println();
        System.out.print("Enter power value (NOTE: Value should be positive real number): ");
        double power = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the unit to convert from (W, kW, HP)");
        String fromUnit = scan.nextLine().toLowerCase();
        System.out.println("Enter the unit to convert to (W, kW, HP)");
        String toUnit = scan.nextLine().toLowerCase();
        double convertedPower = convertPower(power, fromUnit, toUnit);
        if (convertedPower >= 0) {
            System.out.printf("Converted Power: %.4f %s%n", convertedPower, toUnit);
        } else {
            System.out.println("Invalid unit provided for conversion.");
        }
    }

    private static double convertPower(double power, String fromUnit, String toUnit) {
        double powerInWatts;

        switch (fromUnit) {
            case "w" -> powerInWatts = power; 
            case "kw" -> powerInWatts = power * 1000; 
            case "hp" -> powerInWatts = power * 745.7; 
            default -> powerInWatts = -1; 
        }

        if (powerInWatts < 0) return -1; 
        return switch (toUnit) {
            case "w" -> powerInWatts; 
            case "kw" -> powerInWatts / 1000; 
            case "hp" -> powerInWatts / 745.7; 
            default -> -1; 
        };
    }

    private static void data() {
        System.out.println();
        System.out.print("Enter data value (NOTE: Value should be positive real number): ");
        double data = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the unit to convert from (B, KB, MB, GB, TB)");
        String fromUnit = scan.next().toUpperCase();
        System.out.println("Enter the unit to convert to (B, KB, MB, GB, TB)");
        String toUnit = scan.next().toUpperCase();
        double convertedData = convertData(data, fromUnit, toUnit);
        if (convertedData >= 0) {
            System.out.printf("Converted Data: %.4f %s%n", convertedData, toUnit);
        } else {
            System.out.println("Invalid unit provided for conversion.");
        }
    }

    private static double convertData(double data, String fromUnit, String toUnit) {
        double dataInBytes;

        switch (fromUnit) {
            case "B" -> dataInBytes = data; 
            case "KB" -> dataInBytes = data * 1024; 
            case "MB" -> dataInBytes = data * 1024 * 1024; 
            case "GB" -> dataInBytes = data * 1024 * 1024 * 1024; 
            case "TB" -> dataInBytes = data * 1024 * 1024 * 1024 * 1024; 
            default -> dataInBytes = -1; 
        }

        if (dataInBytes < 0) return -1; 
        return switch (toUnit) {
            case "B" -> dataInBytes; 
            case "KB" -> dataInBytes / 1024; 
            case "MB" -> dataInBytes / (1024 * 1024); 
            case "GB" -> dataInBytes / (1024 * 1024 * 1024); 
            case "TB" -> dataInBytes / (1024 * 1024 * 1024 * 1024); 
            default -> -1; 
        };
    }
    
    private static void simpleCalc() {
        System.out.println("Please choose the operation to be performed:");
        System.out.println("1. Simple Arithmetic Expression(+, -, *, /, ^)");
        System.out.println("2. Square root of number");
        System.out.println("3. Power (base ^ exponent)");
        System.out.println("4. Factorial (of an integer)");
        System.out.println("5. Exponential (e^x)");
        System.out.println("6. Logarithm (natural log)");
        System.out.println("7. Trigonometric Functions (sin, cos, tan)");
        int operation = scan.nextInt();
        scan.nextLine();
        switch (operation) {
            case 1 -> {
                System.out.println("Enter the Expression : ");
                String expression = scan.nextLine();
                System.out.println("Value = " + evaluate(expression));
            }
            case 2 -> {
                System.out.println("Enter the number: ");
                double number = scan.nextDouble();
                System.out.println("Square Root: " + Math.sqrt(number));
            }
            case 3 -> {
                System.out.println("Enter base: ");
                double base = scan.nextDouble();
                System.out.println("Enter exponent: ");
                double exponent = scan.nextDouble();
                System.out.println("Power: " + Math.pow(base, exponent));
            }
            case 4 -> {
                System.out.println("Enter a positive integer: ");
                int number = scan.nextInt();
                System.out.println("Factorial: " + factorial(number));
            }
            case 5 -> {
                System.out.println("Enter x for e^x: ");
                double x = scan.nextDouble();
                System.out.println("Exponential: " + Math.exp(x));
            }
            case 6 -> {
                System.out.println("Enter a number for natural log: ");
                double number = scan.nextDouble();
                System.out.println("Logarithm: " + Math.log(number));
            }
            case 7 -> {
                trigonometricFunctions();
            }
            default -> System.out.println("Invalid Choice.");
        }
    }
    
    private static double evaluate(String expression) {
        Deque<Double> numbers = new ArrayDeque<>();         // Stack for numbers (operands)
        Deque<Character> operators = new ArrayDeque<>();    // Stack for operators (+, -, *, /, ^)
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            // If the character is a digit or a decimal point, it's part of a number and use StringBuilder to build the current number
            if (Character.isDigit(c) || c == '.') {
                StringBuilder num = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    num.append(expression.charAt(i++));
                }i--;
                // Convert the built number string to a double and push it onto the numbers stack
                numbers.push(Double.valueOf(num.toString()));   
            } else if (c == '(' || c == '{' || c == '[') {
                operators.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                while (!operators.isEmpty() && !isOpeningBracket(operators.peek())) {
                    numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
                }
                if (!operators.isEmpty()) operators.pop();
            } else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                while (!operators.isEmpty() && checkPrecedence(operators.peek(), c)) {
                    numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.push(c);
            }
        }
        while (!operators.isEmpty()) {
            numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
        }
        return numbers.pop();
    }
    
    private static double applyOperation(char operator, double b, double a) {
        switch (operator) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '*' -> {
                return a * b;
            }
            case '/' -> {
                if (b == 0) throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
            }
            case '^' -> {
                return Math.pow(a, b);
            }
        }
        return 0;
    }
    
    private static int getPrecedence(char op) {
        return switch (op) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            case '(', '{', '[' -> 0;
            default -> -1;
        }; 
    }
    
    private static boolean checkPrecedence(char op1, char op2) {
        if (isOpeningBracket(op1)) return false;
        return getPrecedence(op1) >= getPrecedence(op2);
    }
    
    private static boolean isOpeningBracket(char c) {
        return c == '(' || c == '{' || c == '[';
    }
    
    private static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (number == 0) return 1;
        return number * factorial(number - 1);
    }
    
    private static void trigonometricFunctions() {
        System.out.println("Please choose the operation:");
        System.out.println("1. Standard Trigonometric Functions (sin, cos, tan)");
        System.out.println("2. Inverse Trigonometric Functions (asin, acos, atan)");
        int choice = scan.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Please choose the trigonometric function:");
                System.out.println("1. Sine (sin)");
                System.out.println("2. Cosine (cos)");
                System.out.println("3. Tangent (tan)");
                int trigChoice = scan.nextInt();
                System.out.println("Enter the angle in degrees: ");
                double angle = scan.nextDouble();
                double radians = Math.toRadians(angle);
                switch (trigChoice) {
                    case 1 -> System.out.println("Sine of " + angle + " degrees = " + Math.sin(radians));
                    case 2 -> System.out.println("Cosine of " + angle + " degrees = " + Math.cos(radians));
                    case 3 -> System.out.println("Tangent of " + angle + " degrees = " + Math.tan(radians));
                    default -> System.out.println("Invalid trigonometric function choice.");
                }
            }
            case 2 -> {
                System.out.println("Please choose the inverse trigonometric function:");
                System.out.println("1. Inverse Sine");
                System.out.println("2. Inverse Cosine");
                System.out.println("3. Inverse Tangent");
                int Choice = scan.nextInt();
                System.out.println("Enter the value for the inverse function (must be between -1 and 1 for asin/acos, any value for atan): ");
                double value = scan.nextDouble();
                switch (Choice) {
                    case 1 -> {
                        if (value < -1 || value > 1) {
                            System.out.println("Invalid value for inverse sine. Must be between -1 and 1.");
                        } else {
                            System.out.println("Inverse Sine of " + value + " = " + Math.toDegrees(Math.asin(value)) + " degrees");
                        }
                    }
                    case 2 -> {
                        if (value < -1 || value > 1) {
                            System.out.println("Invalid value for inverse cosine. Must be between -1 and 1.");
                        } else {
                            System.out.println("Inverse Cosine of " + value + " = " + Math.toDegrees(Math.acos(value)) + " degrees");
                        }
                    }
                    case 3 -> {
                        System.out.println("Inverse Tangent of " + value + " = " + Math.toDegrees(Math.atan(value)) + " degrees");
                    }
                    default -> System.out.println("Invalid inverse trigonometric function choice.");
                }
            }
            default -> System.out.println("Invalid choice.");
        }
    }
}