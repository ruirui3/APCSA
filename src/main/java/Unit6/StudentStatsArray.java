package Unit6;

// Have to get rid of package statement

public class StudentStatsArray {

    private final Student[] students;

    // Add private final variable to hold Students array

    public StudentStatsArray(Student[] students) {
        // Constructor code
        this.students = students;
    }

    // Returns the average gpa of the students
    public double averageGpa() {
        double averGpa = 0.0;
        for (Student student : students) {
            averGpa += student.getGpa();
        }
        averGpa /= students.length;

        return averGpa;

    }

    // Returns the gpa range of the students
    public double getGpaRange() {
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        for (Student student : students) {
            double studentGpa = student.getGpa();
            if (studentGpa > highest)
                highest = studentGpa;
            if (studentGpa < lowest) {
                lowest = studentGpa;
            }
        }

        return highest - lowest;
    }

    // Returns the name of the student that has the longest length
    public String getLongestName() {
        int longestLength = 0;
        int longestIndex = 0;

        for (int i = 0; i < students.length; i++) {
            String name = students[i].getName();
            if (name.length() > longestLength) {
                longestLength = name.length();
                longestIndex = i;
            }
        }

        return students[longestIndex].getName();
    }

    // Returns a count of the number freshman students
    public int getNumFreshman() {
        int freshmanNum = 0;

        for (Student student : students) {
            if (student.getYear() == 1) {
                freshmanNum++;
            }
        }

        return freshmanNum;
    }

    // Returns the index of the first student with a name equal to name.
    // Returns -1 if not found
    public int search(String name) {
        for (int i = 0; i < students.length; i++) {
            if (name.equals(students[i].getName())) {
                return i;
            }
        }

        return -1;
    }

    // Returns the index of the first student with a gpa greater than or equal to
    // the gpa
    // Returns -1 if not found
    public int search(double gpa) {

        for (int i = 0; i < students.length; i++) {
            if (gpa <= students[i].getGpa()) {
                return i;
            }
        }

        return -1;
    }

    // Returns 1 if the students are sorted in ascending order by their gpa; -1 if
    // they
    // are sorted in descending order; 0 otherwise.
    public int sortStatus() {
        boolean canAscend = true;
        boolean canDescend = true;

        for (int i = 1; i < students.length; i++) {
            Student student1 = students[i - 1];
            Student student2 = students[i];
            if (student1.getGpa() < student2.getGpa()) {
                canDescend = false;
            } else if (student1.getGpa() > student2.getGpa()) {
                canAscend = false;
            }
        }

        if (canAscend) {
            return 1;
        } else if (canDescend) {
            return -1;
        } else {
            return 0;
        }

    }

    // Returns the array of students in JSON like format
    public String toString() {
        String studentArrayString = "[\n";

        for (Student student : students) {
            studentArrayString += student.toString();
            studentArrayString += ",\n";
        }

        studentArrayString += "]";
        return studentArrayString;
    }

}
