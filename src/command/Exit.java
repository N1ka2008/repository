package command;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tridy.Batoh;
import tridy.Lokace;
import tridy.Predmet;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Exit command
 */
public class Exit extends Command {

    public boolean execute(String arguent){
        return false;
    }

    public boolean exit() {
        return true;
    }



}
