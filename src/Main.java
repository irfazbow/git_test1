//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        System.out.println("test change prior to commit");
        System.out.println("test change after 2nd commit");
        System.out.println("Added a new line to indicate the emergency hot fix performed.");
        System.out.println("Somehow the above line is made to as per the main, adding a new one again.");
        System.out.println("Rebase-trial addition 2");
        System.out.println("Rebase-trial addition 3");
        System.out.println("Rebase-trial for the trial2, a backup incase still confused with trial1.");
    }
}