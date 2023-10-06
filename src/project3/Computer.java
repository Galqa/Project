/* Cтворіть проєкт із пакетом. Створити клас Computer с полем "кількість пам'яті", створити масив об'єктів Computers розміром 5.
Далі руками створити 5 екземплярів цього класу та записати в масив.
 Використовуючи loop вивести в консоль кількість пам'яті для кожного елемента
 */
package project3;

public class Computer {
    private int memory;

    public Computer(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer(1024);
            System.out.println("Computer " + (i + 1) + " має " + computers[i].getMemory() + " MB пам'яті.");
        }
    }
}


