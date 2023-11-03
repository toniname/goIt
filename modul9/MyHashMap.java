package modul9;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap<K, V> {
    private Node<K, V>[] buckets;

    public MyHashMap() {
        this.buckets = new Node[10];
    }

    public void put(K key, V value) {
        int hash = key.hashCode();
        int bucketNumber = hash % buckets.length;

        Node<K, V> kvNode = new Node<>();
        kvNode.setKey(key);
        kvNode.setValue(value);

        if (buckets[bucketNumber] == null) {
            buckets[bucketNumber] = kvNode;
        } else {
            Node<K, V> currentNode = buckets[bucketNumber];
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
        }

    }

    public V get(K key) {
        int hash = key.hashCode();
        int bucketNumber = hash % buckets.length;

        Node<K, V> currentNode = buckets[bucketNumber];
        while (currentNode.getNextNode() != null) {
            if (currentNode.getKey().equals(key)) {
                return currentNode.getValue();
            }
            currentNode = currentNode.getNextNode();
        }

        return null;
    }

    public void clear() {
        this.buckets = new Node[10];
    }

    public void size() {
        int length = this.buckets.length;
    }

    public void remove(K key) {
        int hash = key.hashCode();
        int bucketNumber = hash % buckets.length;

        Node<K, V> currentNode = buckets[bucketNumber];
        while (currentNode.getNextNode() != null) {
            if (currentNode.getKey().equals(key)) {
                currentNode = null;
            }
            currentNode = currentNode.getNextNode();
        }


    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("dsgdg", 435);
        map.get("s");

        MyHashMap<String, Integer> myHashMap = new MyHashMap();
        myHashMap.put("xzfxz", 65);
        myHashMap.put("xzfxz", 65);
        myHashMap.put("xzfxz", 65);
        myHashMap.put("xzfxz", 65);
        myHashMap.put("xzfxz", 65);
        myHashMap.put("xzfxz", 65);
        myHashMap.put("xzfxz", 65);
        myHashMap.put("xzfxz", 65);
        myHashMap.put("xzfxz", 65);
        myHashMap.put("xzfxz", 65);


    }

    private static class Node<K, V> {
        private K key;
        private V value;

        private Node<K, V> nextNode;

        public Node() {

        }

        public Node<K, V> getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node<K, V> nextNode) {
            this.nextNode = nextNode;
        }

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
