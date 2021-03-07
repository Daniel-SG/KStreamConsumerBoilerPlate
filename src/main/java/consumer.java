import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.*;
import org.apache.kafka.streams.kstream.Printed;
import org.json.*;

import java.time.Duration;
import java.util.*;

public class consumer {


    public Topology createTopology(){

        //Windowing properties
        Duration windowSizeMs = Duration.ofMinutes(1);
        Duration advanceMs = Duration.ofSeconds(10);
        // TimeWindows.of(windowSizeMs).advanceBy(advanceMs);

        //Topology
        StreamsBuilder streamsBuilder = new StreamsBuilder();
        KStream<String, String> meetupsTopic = streamsBuilder.stream("meetUps");


        meetupsTopic.print(Printed.toSysOut());
        return streamsBuilder.build();

    }


    public static void main(String[] args) {


        //Properties
        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "streams-wordcount");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());

        consumer streamsJoin = new consumer();


        //build Tipology
        KafkaStreams kafkaStreams = new KafkaStreams(streamsJoin.createTopology(), props);

        //Let the party get started
        kafkaStreams.start();
    }
}
