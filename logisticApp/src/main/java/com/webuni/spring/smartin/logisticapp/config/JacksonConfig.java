package com.webuni.spring.smartin.logisticapp.config;

import java.time.format.DateTimeFormatter;

import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

@Configuration
public class JacksonConfig {
	
	private static final String DATA_TIME_FORMAT = "yyyy-MM-dd";
	private static final String DATA_FORMAT = "yyyy-MM-dd HH:mm:ss";

	@Bean
	public Jackson2ObjectMapperBuilderCustomizer jsonCustomizer() {
		return builder ->{
			builder.simpleDateFormat(DATA_TIME_FORMAT);
			builder.serializers(new LocalDateTimeSerializer(DateTimeFormatter.ofPattern(DATA_TIME_FORMAT)));
			builder.serializers(new LocalDateSerializer(DateTimeFormatter.ofPattern(DATA_FORMAT)));
			builder.deserializers(new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern(DATA_TIME_FORMAT)));
			builder.deserializers(new LocalDateDeserializer(DateTimeFormatter.ofPattern(DATA_FORMAT)));
		};
	}
}
