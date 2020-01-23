package com.bridgelabz.java8.nashron;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;

//@purpose To execute Java Script code using java

public class ClientMain {
    public static void main(String[] args) throws ScriptException, FileNotFoundException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine=scriptEngineManager.getEngineByName("nashorn");
        scriptEngine.eval("print('HelloWorld!!')");

    }
}
