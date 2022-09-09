package afleveringChristian;

import java.util.LinkedList;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {

	private LinkedList<Node>[] buckets;
	private Node start;
	private int size;

	/**
	 * HashingMap constructor comment.
	 */

	public DictionaryLinked() {
		// Sentinel (tomt listehoved - der ikke indeholder data)
		start = new Node();
		size = 0;
	}

// aner ikke hvordan jeg skal gå videre siden jeg ikke må komme 
// data ind i constructoren fra start 
	@Override
	public V get(K key) {
		V value = null;
		int x = 0;
		int i = key.hashCode() % size;

		LinkedList<Node> list = buckets[i];
		while (list != null && x < list.size()) {
			if (list.get(x).key.equals(key)) {
//				value = list.get(i);
			} else {
				x++;
			}
		}
		return value;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public V put(K key, V value) {
		// TODO
		return null;
	}

	@Override
	public V remove(K key) {
		// TODO
		return null;
	}

	@Override
	public int size() {

		return size;
	}

	private class Node {
		Node next;
		K key;
		V value;
	}

}
