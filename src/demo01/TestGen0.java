package demo01;
import java.util.Hashtable;
public class TestGen0<K,V>{
	public Hashtable<K,V> h=new Hashtable<K,V>(); 
	public void put(K k, V v) { 
		h.put(k,v); 
	} 
	public V get(K k) { 
		return h.get(k); 
	} 
	public static void main(String args[]){ 
	TestGen0<String,String> t=new TestGen0<String,String>(); 
	t.put("key", "value"); 
	String s=t.get("key"); 
	System.out.println(s); 
	} 
}