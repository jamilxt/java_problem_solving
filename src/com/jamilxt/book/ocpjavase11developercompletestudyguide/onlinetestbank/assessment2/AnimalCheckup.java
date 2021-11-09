package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;

/**
 * @author jamilxt
 * @created 09 Nov, 2021
 */
public class AnimalCheckup {
    private String name;
    private int age;

    private static final ObjectStreamField[] serialPersistentFields = {
            new ObjectStreamField("name", String.class)
    };

    private void writeObject(ObjectOutputStream stream) throws Exception {
        ObjectOutputStream.PutField fields = stream.putFields();
        fields.put("name", name);
        stream.writeFields();
    }

    private void readObject(ObjectInputStream stream) throws Exception {
        ObjectInputStream.GetField fields = stream.readFields();
        name = (String) fields.get("name", null);
    }

    /*
    When implementing serialization, there are two main ways for omitting an instance variable.
    Option E is tricky because transient is one of those ways.
    However, it is incorrect because it must be used on the instance variable to be omitted.
    Option D is correct because it is the other way.
    The serialPersistentFields array lists the fields available to writeObject() and readObject().
     */
}



