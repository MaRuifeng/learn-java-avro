package com.flyer.avro.serdes;

import com.flyer.avro.Constants;
import com.flyer.avro.User;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.io.DatumReader;
import org.apache.avro.specific.SpecificDatumReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpecificUserDeserializer {

    public static List<User> deserialize() throws IOException {
        DatumReader<User> datumReader = new SpecificDatumReader<User>(User.class);
        DataFileReader<User> dataFileReader = new DataFileReader<User>(new File(Constants.specificSerDesFileName), datumReader);
        List<User> userList = new ArrayList<User>();

        // if deserialization is performed inline without a list returned, a pre-defined user
        // object can be passed to the next() method to avoid allocating and garbage collecting too many objects
        while (dataFileReader.hasNext()) userList.add(dataFileReader.next());

        return userList;
    }
}
