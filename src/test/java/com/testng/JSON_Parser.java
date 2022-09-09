package com.testng;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import org.testng.annotations.Test;

public class JSON_Parser {

	@Test
	private void json() throws IOException, ParseException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\barat\\eclipse-workspace-3\\Mevan\\JSON\\Payload.json");
		FileReader reader = new FileReader(f);
		JSONParser json = new JSONParser();
		Object parse = json.parse(reader);
		JSONObject object = (JSONObject) parse;
		Object object2 = object.get("id");
		String s = object2.toString();
		System.out.println(s);
	}
}