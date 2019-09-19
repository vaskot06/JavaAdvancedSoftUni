import java.util.List;

public class Parents {
    private String parentNames;
    private String parentBirthday;

    public Parents() {
    }

    public Parents(String parentNames, String parentBirthday) {
        this.parentNames = parentNames;
        this.parentBirthday = parentBirthday;
    }

    public String getParentNames() {
        return parentNames;
    }

    public void setParentNames(String parentNames) {
        this.parentNames = parentNames;
    }

    public String getParentBirthday() {
        return parentBirthday;
    }

    public void setParentBirthday(String parentBirthday) {
        this.parentBirthday = parentBirthday;
    }
}
