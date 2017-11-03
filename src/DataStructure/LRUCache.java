package DataStructure;

import java.util.Hashtable;

public class LRUCache {

	class DLinkedList{
		
		DLinkedList pre;
		DLinkedList post;
		int key; 
		int value;
	}
		public void addNode(DLinkedList node){
			
			node.pre = head;
			node.post = head.post;
			
			head.post.pre = node;
			head.post = node;
		}
		
		public void removeNode(DLinkedList node){
			
			DLinkedList pre = node.pre;
			DLinkedList post = node.post;
			
			pre.post = post;
			post.pre = pre;
		}
		
		
		public void moveToHead(DLinkedList node){
			
			this.removeNode(node);
			this.addNode(node);
		}
		
		public DLinkedList popTail(){
			DLinkedList res = tail.pre;
			this.removeNode(res);
			return res;
		}
		
	
	private DLinkedList head;
	private DLinkedList tail;
	private Hashtable<Integer, DLinkedList> cache = new Hashtable<Integer, DLinkedList>();
	int size; 
	int capacity;
	
	public LRUCache(int capacity){
		this.capacity = capacity;
		this.size =0;
		
		head = new DLinkedList();
		head.pre = null;
		tail = new DLinkedList();
		tail.post = null;
		
		head.post= tail;
		tail.pre = head;
		
	}
	
	public int get(int key){
		
		DLinkedList node = cache.get(key);
		
		if(node==null){
			return -1;
		}
		else{
			
			this.moveToHead(node);
			return node.value;
		}
	}
	
	public void put(int key, int value){
		
		DLinkedList node = cache.get(key);
		if(node==null){
			
			DLinkedList newNode = new DLinkedList();
			newNode.key=key;
			newNode.value=value;
			
			cache.put(key, newNode);
			this.addNode(newNode);
			
			size++;
			
			if(size>capacity){
			
				DLinkedList tail = this.popTail();
				cache.remove(tail.key);
				size--;
			}
			
		}
		else{
			
			node.value = value;
			this.moveToHead(node);
		}
	}
}
