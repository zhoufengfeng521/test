package KafkaTests;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

public class Consumer1 {
    public static void main(String[] args) {
        //配置信息
        Properties props = new Properties();
        //kafka服务器地址
        props.put("bootstrap.servers", "10.249.30.10:9092");
        //必须指定消费者组
        props.put("group.id", "test");
        //设置数据key和value的序列化处理类
        props.put("key.deserializer", StringDeserializer.class);
        props.put("value.deserializer", StringDeserializer.class);
        //创建消息者实例
        KafkaConsumer<String,String> consumer = new KafkaConsumer<>(props);
        //订阅topic1的消息
        consumer.subscribe(Arrays.asList("test"));
        //到服务器中读取记录
        while (true){
            ConsumerRecords<String,String> records = consumer.poll(Duration.ofMillis(100));
            for(ConsumerRecord<String,String> record : records){
                System.out.println("key:" + record.key() + "" + ",value:" + record.value());
            }
        }
    }
}