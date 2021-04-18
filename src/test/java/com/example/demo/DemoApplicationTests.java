package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.io.IOException;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

class DemoApplicationTests {

	@Test
	void testMap() throws IOException {
		Key key = new Key("key",123);
		Value value = new Value("value", 456, true);
		Map<Key,Value> map = new HashMap<>();
		ClassWithMap classWithMap = new ClassWithMap();
		map.put(key, value);
		classWithMap.setMap(map);

		ObjectMapper objectMapper = new ObjectMapper();
		String str = objectMapper.writeValueAsString(classWithMap);
		System.out.println(str);

		ClassWithMap class2 = objectMapper.readValue(str, ClassWithMap.class);
		Assert.isTrue(true, "Successful");
	}

}
