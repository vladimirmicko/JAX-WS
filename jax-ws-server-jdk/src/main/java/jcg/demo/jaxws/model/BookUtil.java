package main.java.jcg.demo.jaxws.model;

import java.util.HashMap;
import java.util.Map;

public class BookUtil {
	private static Map<Integer, Book> map;
	
	static {
		map = new HashMap<>();
		map.put(1, new Book(1, "Mary Book"));
		map.put(2, new Book(2, "Terry Book "));
		map.put(3, new Book(3, "Ben Best Book"));
		map.put(4, new Book(4, "Alex Life"));
		map.put(5, new Book(5, "David Music"));
	}

	private BookUtil() {
	}

	public static Book getBook(Integer id) {
		return map.get(id);
	}
}
