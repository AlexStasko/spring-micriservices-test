package by.alexstasko.demo.service1.model;

public class SimpleResponse {

    private String value;

    public SimpleResponse(String value) {
        this.value = value;
    }

    public SimpleResponse(int value) {
        this.value = String.valueOf(value);
    }

    public String getValue() {
        return value;
    }
}
