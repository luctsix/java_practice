import java.lang.*;
import java.io.*;

/*
class Exception extends Throwable{}
    class IOException extends Exception{}
    class RuntimeException extends Exception{}
class Error extends Throwable{}
*/
class DefineNums{
    final static int INSUFFICIENT_FUNDS = 1;
}



abstract public class MyException extends Exception{
    // public Exception getException(int flags, double nums){
    // switch(flags){
    //     case DefineNums.INSUFFICIENT_FUNDS:
    //         InsufficientFundsException except = new InsufficientFundsException(nums);
    //         return except;
    // }   
    // }
}