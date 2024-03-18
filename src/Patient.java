
class InsufficientAgeException extends Exception {
    public InsufficientAgeException(String message) {
        super(message);
    }
}


class Patient {

    private int age;

    public Patient() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void validatePatientAge() {

        try {
            if (age >= 0 && age <= 130) {
                System.out.println("The age that has been entered is valid: " + age + "years");
            } else {
                throw new InsufficientAgeException("You have entered an age value of: " + age + " years .This is invalid as valid age is " +
                        "between 0 and 130 years");
            }
        } catch (InsufficientAgeException e) {
            System.out.println("Age entered is invalid: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        Patient patient = new Patient();

        patient.setAge(40);
        patient.validatePatientAge();

        patient.setAge(160);
        patient.validatePatientAge();
    }
}