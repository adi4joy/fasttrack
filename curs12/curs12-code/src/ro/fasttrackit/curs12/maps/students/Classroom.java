package ro.fasttrackit.curs12.maps.students;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classroom {
    private final List<StudentGrade> students;

    public Classroom(List<StudentGrade> students) {
        this.students = new ArrayList<>(students);
    }

    public List<Integer> getGrades(String discipline) {
        List<Integer> result = new ArrayList<>();
        for (StudentGrade student : students) {
            if (student.getDiscipline().equals(discipline)) {
                result.add(student.getGrade());
            }
        }
        return result;
    }

    public Map<String, Integer> getStudentGrades() {
        Map<String, Integer> result = new HashMap<>();
        for (StudentGrade student : students) {
            result.put(student.getName(), student.getGrade());
        }
        return result;
    }

    public Map<String, String> getStudentDisciplines() {
        Map<String, String> result = new HashMap<>();
        for (StudentGrade student : students) {
            result.put(student.getName(), student.getDiscipline());
        }
        return result;
    }

    public Map<String, String> getBadStudents() {
        Map<String, String> result = new HashMap<>();
        for (StudentGrade student : students) {
            if (student.getGrade() <= 4) {
                result.put(student.getName(), student.getDiscipline());
            }
        }
        return result;
    }

    public Map<String, List<String>> getFailed() {
/*        Map<String, List<String>> result = new HashMap<>();
        List<StudentGrade> studentList = new ArrayList<>();
        for (StudentGrade student : students) {
            if (student.getGrade() <= 4) {
                studentList.add(student);
            }
        }
        for (StudentGrade student : studentList)
            result.putAll(studentList);
    } */
        Map<String, List<String>> result = new HashMap<>();
        for (StudentGrade student : students) {
            if (student.getGrade() < 5) {
                if (result.get(student.getDiscipline()) == null) {
                    List<String> newList = new ArrayList<>();
                    newList.add(student.getName());
                    result.put(student.getDiscipline(), newList);
                } else {
                    List<String> existingList = result.get(student.getDiscipline());
                    existingList.add(student.getName());
                }
            }
        }
        return result;
    }

    public Map<String, List<String>> getFailedOptimized() {
        Map<String, List<String>> result = new HashMap<>();
        for (StudentGrade student : students) {
            if (student.getGrade() < 5) {
                List<String> failedList = result.get(student.getDiscipline());
                if (failedList == null) {
                    failedList = new ArrayList<>();
                    result.put(student.getDiscipline(), failedList);
                }
                failedList.add(student.getName());
            }
        }
        return result;
    }

    public Map<Integer, List<String>> getAllGrades() {
        Map<Integer, List<String>> result = new HashMap<>();
        for (StudentGrade student : students) {
            List<String> gradeList = result.get(student.getGrade());
            if (gradeList == null) {
                gradeList = new ArrayList<>();
                result.put(student.getGrade(), gradeList);
            }
            gradeList.add(student.getName());
        }
        return result;
    }
}
