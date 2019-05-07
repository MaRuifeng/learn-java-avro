package com.flyer.avro.serdes;

import com.flyer.avro.Constants;
import org.apache.avro.Schema;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumWriter;

import java.io.File;
import java.io.IOException;

public class GenericUserSerializer {
    private GenericRecord user1, user2;
    private Schema schema;

    public GenericUserSerializer(Schema schema) {
        this.schema = schema;
    }

    private void initUsers() {
        user1 = new GenericData.Record(this.schema);
        user1.put("name", "Jack");
        user1.put("age", 38);
        user1.put("favorite_language", "php");

        user2 = new GenericData.Record(this.schema);
        user2.put("name", "Jim");
        user2.put("age", 27);
        user2.put("job", "freelancer");
        user2.put("favorite_language", "C++");
    }

    public void serialize() throws IOException {
        initUsers();

        DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<>(schema);
        DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<>(datumWriter);
        dataFileWriter.create(schema, new File(Constants.genericSerDesFileName));

        dataFileWriter.append(user1);
        dataFileWriter.append(user2);

        dataFileWriter.close();
    }
}
