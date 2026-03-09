class Menu {
    private Scanner scanner = new Scanner(System.in);

    public void display() {
        System.out.println("\n     TO-DO LIST MENU:     ");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Complete Task");
        System.out.println("4. Remove Task");
        System.out.println("5. Exit");
    }

    public int getChoice() {
        System.out.print("Enter choice: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Enter a number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

}
