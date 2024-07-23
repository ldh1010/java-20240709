package test.클래스;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputerMain {



    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();
        Computer computer = new Computer();
        Computer computer2 = new Computer();
        computer.ram = 16;
        computer2.ram = 8;

        computers.add(computer);
        computers.add(computer2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("램 추가");
        int ram = scanner.nextInt();
        for (int i = 0; i < computers.size(); i++) {
            computers.get(i).addRam(ram);
        }

    }
}
