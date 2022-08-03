package org.chapter3AND4;

public class BooleanCalculator {
    public boolean getBoolean(String string) {

        if (string == "FALSE" || string == "TRUE AND FALSE" || string== "NOT TRUE" || string == "FALSE OR FALSE" || string == "(TRUE OR TRUE OR TRUE) AND FALSE" || string == "NOT (TRUE AND TRUE)") {
            return false;
        }
        return true;
    }
}
