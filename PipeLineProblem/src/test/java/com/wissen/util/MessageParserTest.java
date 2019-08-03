package com.wissen.util;

import com.wissen.com.wissen.model.PipeLineMessage;
import org.junit.Test;

import static org.junit.Assert.*;

public class MessageParserTest {

    @Test
    public void createMessage() {
        PipeLineMessage object = MessageParser.createMessage("P1~Infosys~2");
        assertNotNull(object);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void createMessageExceptionTest() {

        PipeLineMessage object = MessageParser.createMessage("P1~2");
        assertNotNull(object);


    }
}