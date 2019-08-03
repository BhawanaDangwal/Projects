package com.wissen.util;

import com.wissen.com.wissen.model.Message;
import com.wissen.com.wissen.model.PipeLineMessage;

public class MessageParser {

    /**
     * Parse string input to Pipeline Message
     * @param str
     * @return
     */
    public static Message createMessage(String str)
    {
        Message message;
        try
        {
            //P1$Infosys$2
            String[] strArr=str.split("~");
            message=new PipeLineMessage(strArr[0],strArr[1],Integer.valueOf(strArr[2]));
            return message;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            throw new ArrayIndexOutOfBoundsException("Incorrect messgae format for string :"+str);
        }


    }
}
