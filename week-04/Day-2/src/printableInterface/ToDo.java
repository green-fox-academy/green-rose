package printableInterface;

public class ToDo implements Printable{
    String task;
    String priority;
    boolean done;

    public ToDo(String task, String priority, boolean status){
        this.task=task;
        this.priority=priority;
        this.done=status;

    }
    @Override
    public void printAllFields() {
        System.out.println("Task: "+ task + " | Priority: " + priority + " | Done: "+ done);
    }
}
