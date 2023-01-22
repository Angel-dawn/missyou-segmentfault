package com.lin.missyou;

import java.util.logging.Logger;

public class FunctionMain {

    private static final Logger logger = Logger.getLogger("missyou");

    public static void main(String[] args) {

        try {
            execute();
        } catch (Throwable e) {
            logger.warning(e.getMessage());

        }
    }

    private static void execute() throws Throwable{

    }



}
