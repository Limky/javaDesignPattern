package chapter09;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
	List<MenuItem> items;
	int position = 0;
 
	public PancakeHouseMenuIterator(List<MenuItem> items) {
		this.items = items;
	}
 
	public MenuItem next() {
		return items.get(position++);
	}
 
	public boolean hasNext() {
		/*
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
		*/
		// 이 방법도 가능
		return items.size() > position;
	}
}
