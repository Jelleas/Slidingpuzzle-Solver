package com.company;

/**
 * Created by Jelle on 21-9-2015.
 */
public class Token {
    private final Integer sign;

    public Token(Integer sign) {
        this.sign = sign;
    }

    public Token(Token token) {
        this.sign = token.sign;
    }

    public boolean isEmpty() {
        return this.sign == 0;
    }

    public Integer getSign() {
        return this.sign;
    }

    @Override
    public String toString() {
        return sign.toString();
    }
}