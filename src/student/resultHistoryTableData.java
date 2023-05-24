package student;

import javafx.beans.property.SimpleStringProperty;

/*
This class represents a single row of data in the result history table for a student. It encapsulates the course code, section, and GPA for a particular result entry.

The class includes three SimpleStringProperty instances for each data field, which enable binding with JavaFX UI components for seamless updating and display.

The main features and methods of this class are as follows:

Constructor: Initializes the result history data with the provided course code, section, and GPA.
Getter and Setter methods for accessing and modifying the course code, section, and GPA properties.
Property getter methods to allow binding with UI components.
*/
public class resultHistoryTableData {
    private final SimpleStringProperty resultHistoryTableCourseCode;
    private final SimpleStringProperty resultHistoryTableSec;
    private final SimpleStringProperty resultHistoryTableGPA;

    public resultHistoryTableData(String resultHistoryTableCourseCode, String resultHistoryTableSec, String resultHistoryTableGPA) {
        this.resultHistoryTableCourseCode = new SimpleStringProperty(resultHistoryTableCourseCode);
        this.resultHistoryTableSec = new SimpleStringProperty(resultHistoryTableSec);
        this.resultHistoryTableGPA = new SimpleStringProperty(resultHistoryTableGPA);
    }

    public String getResultHistoryTableCourseCode() {
        return resultHistoryTableCourseCode.get();
    }

    public SimpleStringProperty resultHistoryTableCourseCodeProperty() {
        return resultHistoryTableCourseCode;
    }

    public void setResultHistoryTableCourseCode(String resultHistoryTableCourseCode) {
        this.resultHistoryTableCourseCode.set(resultHistoryTableCourseCode);
    }

    public String getResultHistoryTableSec() {
        return resultHistoryTableSec.get();
    }

    public SimpleStringProperty resultHistoryTableSecProperty() {
        return resultHistoryTableSec;
    }

    public void setResultHistoryTableSec(String resultHistoryTableSec) {
        this.resultHistoryTableSec.set(resultHistoryTableSec);
    }

    public String getResultHistoryTableGPA() {
        return resultHistoryTableGPA.get();
    }

    public SimpleStringProperty resultHistoryTableGPAProperty() {
        return resultHistoryTableGPA;
    }

    public void setResultHistoryTableGPA(String resultHistoryTableGPA) {
        this.resultHistoryTableGPA.set(resultHistoryTableGPA);
    }
}
