package Day5.Utilities;

public enum Priority{
    LOW ("0-33"),
    MEDIUM ("34-64"),
    HIGH("65-100");

    public final String level;
    Priority(String l){
        this.level=l;
    }
    public String displayPriority(Priority priority){
        return priority.level;
    }
}
