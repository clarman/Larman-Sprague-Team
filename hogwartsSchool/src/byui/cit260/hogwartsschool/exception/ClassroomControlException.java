/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.exception;

/**
 *
 * @author Chadl
 */
public class ClassroomControlException extends Exception{

    public ClassroomControlException() {
    }

    public ClassroomControlException(String message) {
        super(message);
    }

    public ClassroomControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClassroomControlException(Throwable cause) {
        super(cause);
    }

    public ClassroomControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
