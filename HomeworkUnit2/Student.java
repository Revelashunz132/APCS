//John Aston Adams
//10/31/22

package HomeworkUnit2;

public class Student {
    private String n;
    private double gpa;
    private int numC;
    public Student(String name, double GPA, int numOfClass){
        n = name;
        gpa = GPA;
        numC= numOfClass;
    }

    public double getGPA(){
        return gpa;
    }

    public static double weighting(double grade){
        if (grade >= 93){
            return (4.0);
        }
        else if (grade >= 90 && grade < 93){
            return (3.7);
        }
        else if (grade >= 87 && grade < 90){
            return (3.3);
        }
        else if (grade >= 83 && grade < 87){
            return (3.0);
        }
        else if (grade >= 80 && grade < 83){
            return (2.7);
        }
        else if (grade >= 77 && grade < 80){
            return (2.3);
        }
        else if (grade >= 73 && grade < 77){
            return (2.0);
        }
        else if (grade >= 70 && grade < 73){
            return (1.7);
        }
        else if (grade >= 67 && grade < 70){
            return (1.3);
        }
        else if (grade >= 63 && grade < 67){
            return (1.0);
        }
        else if (grade >= 60 && grade < 63){
            return (0.7);
        }
        else{
            return (0);
        }
    }

        public static double weightingAP(double grade){
            if (grade >= 93){
                return (5.0);
            }
            else if (grade >= 90 && grade < 93){
                return (4.7);
            }
            else if (grade >= 87 && grade < 90){
                return (4.3);
            }
            else if (grade >= 83 && grade < 87){
                return (4.0);
            }
            else if (grade >= 80 && grade < 83){
                return (3.7);
            }
            else if (grade >= 77 && grade < 80){
                return (3.3);
            }
            else if (grade >= 73 && grade < 77){
                return (3.0);
            }
            else if (grade >= 70 && grade < 73){
                return (2.7);
            }
            else if (grade >= 67 && grade < 70){
                return (2.3);
            }
            else if (grade >= 63 && grade < 67){
                return (2.0);
            }
            else if (grade >= 60 && grade < 63){
                return (1.7);
            }
            else{
                return (0);
            }
        
    }
    public void takeClass(double grade, boolean APorNot){
        numC += 1;
        if (APorNot == true){
            grade = weightingAP(grade);
        }
        else{
            grade = weighting(grade);
        }
        gpa = (gpa * numC + grade) / (numC + 1);
        numC += 1;
        
    }

    @Override
    public String toString(){
        return ("Name: " + n + "\nGPA: " + gpa + "\nNumber of classes: " + numC);
    }

    public boolean equals(Object other){
        if (this == other){
            return true;
        }
        if (!(other instanceof Student)) return false;
        Student student = (Student) other;
        return gpa == student.getGPA();
    }
    public static void main(String[] args) {
        Student Bob = new Student("Bob", 4.0, 5);
        System.out.println(Bob.getGPA());
        Bob.takeClass(92, false);
        Bob.takeClass(78,true);
        System.out.println(Bob.getGPA());
        System.out.println(Bob);
        System.out.println(Bob.equals(new Student("Lisa", 4.3, 6)));
    }

}
