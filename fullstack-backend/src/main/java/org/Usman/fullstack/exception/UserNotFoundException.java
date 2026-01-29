package org.Usman.fullstack.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id){
        super("cloud not found the user with id " + id );
    }
}
