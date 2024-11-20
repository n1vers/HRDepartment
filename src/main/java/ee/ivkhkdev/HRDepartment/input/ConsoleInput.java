package ee.ivkhkdev.HRDepartment.input;

import ee.ivkhkdev.HRDepartment.interfaces.Input;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner scanner;

    public ConsoleInput(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String nextLine(){
        return scanner.nextLine();
    }
}
