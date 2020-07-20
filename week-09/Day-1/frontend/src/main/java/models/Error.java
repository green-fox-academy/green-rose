package models;

public class Error {
    private String error;

    public Error() {
        this.error = "Please provide an input!";
    }

    public Error(String errorMsg) {
        this.error = errorMsg;
    }
    public String getError() {
        return error;
    }
}
