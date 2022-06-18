package com.demo.Icommerce;

import com.demo.Icommerce.infrastructure.util.AECBRawResponseJson;
import com.demo.Icommerce.infrastructure.util.JsonUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

//@SpringBootApplication
public class IcommerceApplication {

	public static void main(String[] args) {
		try (InputStream stream = new ClassPathResource("data.json").getInputStream()) {
			String fileContent = IOUtils.toString(stream, Charset.defaultCharset());
			AECBRawResponseJson testCases = JsonUtils.fromJson(fileContent, AECBRawResponseJson.class);
			System.out.println(JsonUtils.toJson(testCases));
		} catch (IOException e) {
			e.printStackTrace();
		}
//		SpringApplication.run(IcommerceApplication.class, args);
	}


}
