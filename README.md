# Learn Apache Avro (Java)

The [official doc](https://avro.apache.org/docs/1.8.2/index.html) states that Apache Avro is a data serialization system. With schemas defined in JSON, Avro facilitates language agnostic usage and implementations, since data together with the schema are self-describing.

Avro provides: 
* Rich data structures
* A compact, fast, binary data format
* A container file, to store persistent data
* Remote procedure call (RPC)
* Simple integration with dynamic languages (Code generation is not required to read or write data files nor to use or implement RPC protocols)

In this project, the serialization/deserialization and RPC examples listed on its [Getting Started](https://avro.apache.org/docs/1.8.2/gettingstartedjava.html) page are gone through for a quick initial understanding of this library. 

## Serialization & Deserialization

Both specific data serialization with code generation and generic data serialization without code generation are [presented](src/main/java/com/flyer/avro/serdes/AvroSerDesDemo.java). 

## Remote Procedure Call

An [RPC](https://www.tutorialspoint.com/remote-procedure-call-rpc) is an inter-process communication technique used for client-server based applications.
RPC based APIs are great for actions (procedures or commands etc.) and REST based APIs are great at modeling the domain (resources or entities) and making CRUD operations.
The [example](src/main/java/com/flyer/avro/rpc/AvroRPCDemo.java) here demonstrates how a client makes an RPC call to ask the server to send a message.  