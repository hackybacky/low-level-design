package map_implementation;

public class entry<K , V> {
	K key ;
	V value;
	entry next;

	public entry(K k , V v) {
		// TODO Auto-generated constructor stub
		this.key = k;
		this.value = v;
	}
	
	void setKey(K k ) {
		key = k;
	}
	
	void setValue(V v) {
		value = v;
	}
	
	V getValue() {
		return value;
	}
	
	K getKey() {
		return key;
	}
	void setNext(K k , V v) {
		next = new entry(k , v);
	}
}
