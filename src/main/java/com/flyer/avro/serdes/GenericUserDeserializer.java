package com.flyer.avro.serdes;

import com.flyer.avro.Constants;
import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenericUserDeserializer {
    private Schema schema;

    public GenericUserDeserializer(Schema schema) {
        this.schema = schema;
    }

    public List<GenericRecord> deserialize() throws IOException {
        DatumReader<GenericRecord> datumReader = new GenericDatumReader<>(this.schema);
        DataFileReader<GenericRecord> dataFileReader = new DataFileReader<>(new File(Constants.genericSerDesFileName),
                datumReader);
        List<GenericRecord> userList = new ArrayList<>();

        while (dataFileReader.hasNext()) {
            userList.add(dataFileReader.next());
        }

        return userList;
    }
}
