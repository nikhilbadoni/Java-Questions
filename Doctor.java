import java.util.Scanner;

class Doctor {
    public String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void diagnosePatient() {
        System.out.println("Doctor " + name + " is diagnosing the patient.");
    }
}

class Surgeon extends Doctor {
    public Surgeon(String name) {
        super(name);
    }

    public void diagnosePatient() {
        System.out.println("Surgeon " + name + " is diagnosing the patient before surgery.");
    }

}

class Nurse extends Doctor {
    public Nurse(String name) {
        super(name);
    }

    public void diagnosePatient() {
        System.out.println("Nurse " + name + " is assisting the doctor in diagnosing the patient.");
    }

}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the doctor: ");
        String doctorName = scanner.nextLine();
        Doctor doctor = new Doctor(doctorName);
        doctor.diagnosePatient();

        System.out.println();

        System.out.print("Enter the name of the surgeon: ");
        String surgeonName = scanner.nextLine();
        Surgeon surgeon = new Surgeon(surgeonName);
        surgeon.diagnosePatient();
        

        System.out.println();

        System.out.print("Enter the name of the nurse: ");
        String nurseName = scanner.nextLine();
        Nurse nurse = new Nurse(nurseName);
        nurse.diagnosePatient();
        

        scanner.close();
    }
}
