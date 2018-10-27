package library.util;

import java.util.List;
import java.util.stream.Stream;

import library.data.Item;

public class Util {
	
	public static Item[] merge(Item[] ...arrays)
	{
		return Stream.of(arrays).flatMap(Stream::of).toArray(Item[]::new);
	}
	
	public static long[] listToArray(List<Long> list) {
		long[] longArr = new long[list.size()];		
		int counter = 0;
		for(Long id : list) {
			longArr[counter] = id;
			counter++;
		}
				
		return longArr;
	}

}
