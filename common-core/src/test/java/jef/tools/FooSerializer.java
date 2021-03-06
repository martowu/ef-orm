package jef.tools;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Set;

import jef.json.JsonTypeSerializer;

import com.alibaba.fastjson.JSONObject;

public class FooSerializer extends JsonTypeSerializer<Foo>{

	@Override
	protected Object processToJson(Foo t) {
		JSONObject obj=new JSONObject();
		obj.put("Date", t.getClass().getName());
		obj.put("NAME_1", t.getName());
		
		return obj;
	}

	public Set<Type> getAutowiredFor() {
		return Collections.<Type>singleton(Foo.class);
	}

}
