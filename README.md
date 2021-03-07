# KStreamConsumerBoilerPlate
Simple example about how to consume Kafka produced data using Kstreams

<h3> Pre requisites </h3>
* Apache Kafka https://archive.apache.org/dist/kafka/2.1.1/kafka-2.1.1-src.tgz
  or 
  Confluent installed https://www.confluent.io/download/
  
* Start Kafka or Confluent:
  * Go to your kafka folder installation and run `zookeeper-server-start config/zookeeper.properties`
       and in a different window `kafka-server-start config/server.properties`
       
  * If you use Confluent run `export CONFLUENT_HOME=Your confluent path/confluent-6.0.1;
        export PATH=$PATH:$CONFLUENT_HOME/bin;` and finally `confluent local services start`

* You can produce streaming data running `curl -s https://stream.meetup.com/2/rsvps | sh installationKafkaPath/bin/kafka-console-producer.sh --broker-list localhost:9092 --topic NameOfYourTopic`
