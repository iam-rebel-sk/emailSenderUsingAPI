package org.geekster;

public class Email {
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Your email = " + body;
    }

    public Email(String body) {
        this.body = body;
    }

    private String body;
}
