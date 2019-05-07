package com.flyer.avro.serdes;

import com.flyer.avro.Constants;
import com.flyer.avro.User;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.File;
import java.io.IOException;

public class SpecificUserSerializer {
    private static User user1, user2, user3;

    static { // initialize users
        // create user with setters
        user1 = new User();
        user1.setName("Jack");
        user1.setAge(20);
        user1.setFavoriteLanguage("Python");

        // create user with constructor, better performance, but no validation & default value
        user2 = new User("Jerry", 13, "Student", "C++");

        // create user with Avro builder, with data validation and default values
        user3 = User.newBuilder()
                .setName("Annie")
                .setAge(25)
                .setJob("Engineer")
                .build();
    }

    public static void serialize() throws IOException  {
        DatumWriter<User> userDatumWriter = new SpecificDatumWriter<User>(User.class);
        DataFileWriter<User> dataFileWriter = new DataFileWriter<User>(userDatumWriter);
        dataFileWriter.create(user1.getSchema(), new File(Constants.specificSerDesFileName));

        dataFileWriter.append(user1);
        dataFileWriter.append(user2);
        dataFileWriter.append(user3);

        dataFileWriter.close();
    }
}
