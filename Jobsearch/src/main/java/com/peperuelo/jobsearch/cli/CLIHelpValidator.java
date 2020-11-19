package com.peperuelo.jobsearch.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class CLIHelpValidator implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
        boolean actualvalue = Boolean.parseBoolean(value);
        if(actualvalue){
            throw new ParameterException("Ayuda solicitada");
        }
    }
}
