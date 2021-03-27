package it.room.cc2021;

import javax.swing.*;

public class InputDialogs {

    int intData;
    String stringData;
    String stringFromList;
    float floatData;

    public void execute() {
        Object[] possibleValues = {"Primo", "Secondo", "Terzo"};
        stringFromList = (String) JOptionPane.showInputDialog(null,
                "Scegli un valore", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);
        intData = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserisci un int"));
        stringData = JOptionPane.showInputDialog(null, "Inserisci una String");
        floatData = Float.parseFloat(JOptionPane.showInputDialog(null, "Inserisci una float"));
        
    }

    @Override
    public String toString() {
        return String.format("stringFromList = %s, intData = %d, stringData = %s, floatData = %f", 
                stringFromList, intData, stringData, floatData
                );
    }
    
    
    
    public static void main(String[] args) {
        InputDialogs inputDialogs = new InputDialogs();
        inputDialogs.execute();
        System.out.println(inputDialogs.toString());
    }
}
