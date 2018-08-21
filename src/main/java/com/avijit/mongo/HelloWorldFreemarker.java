package com.avijit.mongo;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class HelloWorldFreemarker {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.setClassForTemplateLoading(HelloWorldFreemarker.class, "/");
		try {
			Template template = configuration.getTemplate("hello-freemarker.ftl");
			StringWriter writer = new StringWriter();
			Map<String, Object> data = new HashMap<>();
			data.put("user", "Avijit");
			template.process(data, writer);
			System.out.println(writer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
