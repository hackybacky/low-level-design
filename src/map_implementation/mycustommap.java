package map_implementation;

import map_implementation.entry;

public class mycustommap<K , V> {
	
	private static final int INITIAL_SIZE = 1 << 4;
	private static final int MAXIMUM_CAPACITY = 1 << 16;
	
	entry [] hashTable;
	mycustommap() {
		// TODO Auto-generated constructor stub
		hashTable = new entry[INITIAL_SIZE];
	}
	mycustommap(int max_size) {
		hashTable = new entry[max_size];
	}
	
	public void put(K key , V value) {
		int hashCode = key.hashCode()% hashTable.length;
		entry node = hashTable[hashCode];
		if(node == null) {
			entry newEntryNode = new entry(key , value);
			hashTable[hashCode] = newEntryNode;
		}
		else {
			entry previousNode = hashTable[hashCode];
			while(node != null) {
				if(node.key == key) {
					node.value = value;
					return;
				}
				previousNode = node;
				node = node.next;
			}
			previousNode.setNext(key, value);
		}
	}
	
	public V get(K key) {
		int hashCode = key.hashCode()% hashTable.length;
		entry node = hashTable[hashCode];
		while(node != null) {
			if(node.key == key) {
				return (V)node.getValue();
			}
			node = node.next;
		}
		return null;
	}
	
}
