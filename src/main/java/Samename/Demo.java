package Samename;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {

	public static void main(String[] args) throws IOException, DatabindException, IOException {
		
		
		ObjectMapper mapper = new ObjectMapper();
		JsonParser jsonString = null;
		Report reports = mapper.readValue(jsonString, Report.class);
	}
}
