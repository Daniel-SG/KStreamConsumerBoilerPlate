# KStreamConsumerBoilerPlate
Simple example about how to consume Kafka produced data using Kstreams

<h3> Pre requisites </h3>
1- Apache Kafka (https://archive.apache.org/dist/kafka/2.1.1/kafka-2.1.1-src.tgz) 
  or 
  Confluent installed (https://www.confluent.io/download/)
  
2- Start Kafka or Confluent:
  2.1 Go to your kafka folder installation and run `zookeeper-server-start config/zookeeper.properties`
       and in a different window `kafka-server-start config/server.properties`
  2.2 Start Confluent by `<addr>` element here instead.


export CONFLUENT_HOME=/Users/gined/Documents/confluent-6.0.1;
export PATH=$PATH:$CONFLUENT_HOME/bin;

confluent local services start;
