package game;


public class Pair<K, V> {

	K key;
	V value;
	
	public Pair(K k, V v){
		key = k;
		value = v;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
}
