package org.tenten.tentenbe.domain.auth.exception;

public class DuplicateNicknameException extends RuntimeException {
    public DuplicateNicknameException(String message) {
        super(message);
    }
}
