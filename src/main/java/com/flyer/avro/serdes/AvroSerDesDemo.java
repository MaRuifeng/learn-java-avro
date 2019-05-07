package com.flyer.avro.serdes;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;

import java.io.File;
import java.util.List;

public class AvroSerDesDemo {

    public static void main(String[] args) {
        try {
            System.out.println("Welcome to the rabbit hole of Avro serialization/deserialization.\n");

            System.out.println(">>>>> Specific ser/des with code generation by Avro");
            System.out.println("Serializing user objects and persisting to file ...");
            SpecificUserSerializer.serialize();
            System.out.println("Deserializing from file ...");
            SpecificUserDeserializer.deserialize().stream().forEach((user) -> System.out.println(user));

            System.out.println("\n>>>>> Generic ser/des without code generation by Avro");

            Schema schema = new Schema.Parser()
                    .parse(new File(GenericUserSerializer
                            .class.getClassLoader().getResource("avro/user.avsc").getFile()));
            System.out.println("Serializing user objects and persisting to file ...");
            GenericUserSerializer genericUserSerializer = new GenericUserSerializer(schema);
            genericUserSerializer.serialize();
            GenericUserDeserializer genericUserDeserializer = new GenericUserDeserializer(schema);
            List<GenericRecord> userList = genericUserDeserializer.deserialize();
            System.out.println("Deserializing from file ...");
            userList.stream().forEach((record) -> System.out.println(record));

            System.out.println("\nAll rabbits gone.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
