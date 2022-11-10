## Important Steps to Get Started With Kafka

* Download Kafka from [Kafka](https://kafka.apache.org)

* Start the ZooKeeper service

```bash
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```
* Start the Kafka broker service

```bash
$ bin/kafka-server-start.sh config/server.properties
```
We have a local environment Kafka setup.

### Read the events 

Open a new terminal session from the folder where Kafka is downloaded and run : 

```bash
bin/kafka-console-consumer.sh --topic <topicName> --from-beginning --bootstrap-server localhost:9092
```