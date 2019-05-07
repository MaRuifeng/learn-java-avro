/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.flyer.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Message extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2214570041177885530L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Message\",\"namespace\":\"com.flyer.avro\",\"fields\":[{\"name\":\"to\",\"type\":\"string\"},{\"name\":\"from\",\"type\":\"string\"},{\"name\":\"body\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Message> ENCODER =
      new BinaryMessageEncoder<Message>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Message> DECODER =
      new BinaryMessageDecoder<Message>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Message> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Message> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Message>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Message to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Message from a ByteBuffer. */
  public static Message fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence to;
  @Deprecated public java.lang.CharSequence from;
  @Deprecated public java.lang.CharSequence body;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Message() {}

  /**
   * All-args constructor.
   * @param to The new value for to
   * @param from The new value for from
   * @param body The new value for body
   */
  public Message(java.lang.CharSequence to, java.lang.CharSequence from, java.lang.CharSequence body) {
    this.to = to;
    this.from = from;
    this.body = body;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return to;
    case 1: return from;
    case 2: return body;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: to = (java.lang.CharSequence)value$; break;
    case 1: from = (java.lang.CharSequence)value$; break;
    case 2: body = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'to' field.
   * @return The value of the 'to' field.
   */
  public java.lang.CharSequence getTo() {
    return to;
  }

  /**
   * Sets the value of the 'to' field.
   * @param value the value to set.
   */
  public void setTo(java.lang.CharSequence value) {
    this.to = value;
  }

  /**
   * Gets the value of the 'from' field.
   * @return The value of the 'from' field.
   */
  public java.lang.CharSequence getFrom() {
    return from;
  }

  /**
   * Sets the value of the 'from' field.
   * @param value the value to set.
   */
  public void setFrom(java.lang.CharSequence value) {
    this.from = value;
  }

  /**
   * Gets the value of the 'body' field.
   * @return The value of the 'body' field.
   */
  public java.lang.CharSequence getBody() {
    return body;
  }

  /**
   * Sets the value of the 'body' field.
   * @param value the value to set.
   */
  public void setBody(java.lang.CharSequence value) {
    this.body = value;
  }

  /**
   * Creates a new Message RecordBuilder.
   * @return A new Message RecordBuilder
   */
  public static com.flyer.avro.Message.Builder newBuilder() {
    return new com.flyer.avro.Message.Builder();
  }

  /**
   * Creates a new Message RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Message RecordBuilder
   */
  public static com.flyer.avro.Message.Builder newBuilder(com.flyer.avro.Message.Builder other) {
    return new com.flyer.avro.Message.Builder(other);
  }

  /**
   * Creates a new Message RecordBuilder by copying an existing Message instance.
   * @param other The existing instance to copy.
   * @return A new Message RecordBuilder
   */
  public static com.flyer.avro.Message.Builder newBuilder(com.flyer.avro.Message other) {
    return new com.flyer.avro.Message.Builder(other);
  }

  /**
   * RecordBuilder for Message instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Message>
    implements org.apache.avro.data.RecordBuilder<Message> {

    private java.lang.CharSequence to;
    private java.lang.CharSequence from;
    private java.lang.CharSequence body;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.flyer.avro.Message.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.to)) {
        this.to = data().deepCopy(fields()[0].schema(), other.to);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.from)) {
        this.from = data().deepCopy(fields()[1].schema(), other.from);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.body)) {
        this.body = data().deepCopy(fields()[2].schema(), other.body);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Message instance
     * @param other The existing instance to copy.
     */
    private Builder(com.flyer.avro.Message other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.to)) {
        this.to = data().deepCopy(fields()[0].schema(), other.to);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.from)) {
        this.from = data().deepCopy(fields()[1].schema(), other.from);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.body)) {
        this.body = data().deepCopy(fields()[2].schema(), other.body);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'to' field.
      * @return The value.
      */
    public java.lang.CharSequence getTo() {
      return to;
    }

    /**
      * Sets the value of the 'to' field.
      * @param value The value of 'to'.
      * @return This builder.
      */
    public com.flyer.avro.Message.Builder setTo(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.to = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'to' field has been set.
      * @return True if the 'to' field has been set, false otherwise.
      */
    public boolean hasTo() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'to' field.
      * @return This builder.
      */
    public com.flyer.avro.Message.Builder clearTo() {
      to = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'from' field.
      * @return The value.
      */
    public java.lang.CharSequence getFrom() {
      return from;
    }

    /**
      * Sets the value of the 'from' field.
      * @param value The value of 'from'.
      * @return This builder.
      */
    public com.flyer.avro.Message.Builder setFrom(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.from = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'from' field has been set.
      * @return True if the 'from' field has been set, false otherwise.
      */
    public boolean hasFrom() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'from' field.
      * @return This builder.
      */
    public com.flyer.avro.Message.Builder clearFrom() {
      from = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'body' field.
      * @return The value.
      */
    public java.lang.CharSequence getBody() {
      return body;
    }

    /**
      * Sets the value of the 'body' field.
      * @param value The value of 'body'.
      * @return This builder.
      */
    public com.flyer.avro.Message.Builder setBody(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.body = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'body' field has been set.
      * @return True if the 'body' field has been set, false otherwise.
      */
    public boolean hasBody() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'body' field.
      * @return This builder.
      */
    public com.flyer.avro.Message.Builder clearBody() {
      body = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Message build() {
      try {
        Message record = new Message();
        record.to = fieldSetFlags()[0] ? this.to : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.from = fieldSetFlags()[1] ? this.from : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.body = fieldSetFlags()[2] ? this.body : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Message>
    WRITER$ = (org.apache.avro.io.DatumWriter<Message>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Message>
    READER$ = (org.apache.avro.io.DatumReader<Message>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
