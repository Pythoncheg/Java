package HomeWork_04;

public class Mapa<K, V> {
    Node<K, V>[] nodes = new Node[16];


    public V put(K key, V value) {

        V result = null;
        Node<K, V> inputNode = new Node<>(key, value);
        Integer hash16 = inputNode.key.hashCode() % 16;
        if (nodes[hash16] != null) {
            Node<K, V> currentNode = nodes[hash16];
            while (currentNode != null) {
                if (currentNode.key == key) {
                    result = currentNode.value;
                    currentNode.value = value;
                    return result;
                }
                currentNode = currentNode.nextnode;
            }
            inputNode.nextnode = nodes[hash16];
        }
        nodes[hash16] = inputNode;
        return result;
    }

    public V get(K key) {
        Integer index = key.hashCode() % 16;
        Node<K, V> currentNode = nodes[index];
        while (currentNode != null) {
            if (currentNode.key == key) {
                return currentNode.value;
            }
            currentNode = currentNode.nextnode;
        }
        return null;
    }

    public V remove(K key) {
        Integer index = key.hashCode() % 16;
        Node<K, V> currentNode = nodes[index];
        if (currentNode != null) {
            while (currentNode.nextnode != null) {
                if (currentNode.nextnode.key == key) {
                    V result = currentNode.nextnode.value;
                    currentNode.nextnode = currentNode.nextnode.nextnode;
                    return result;
                }
                currentNode = currentNode.nextnode;
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        int index = key.hashCode() % nodes.length;
        Node node = nodes[index];

        while (node != null) {
            if (node.key.equals(key)) {
                return true;
            }

            node = node.nextnode;
        }

        return false;
    }

    public Object replace(K key, V newValue) {
        int index = key.hashCode() % nodes.length;
        Node node = nodes[index];

        while (node != null) {
            if (node.key.equals(key)) {
                Object oldValue = node.value;
                node.value = newValue;
                return oldValue;
            }

            node = node.nextnode;
        }

        return null;
    }

    public int size() {
        return nodes.length;
    }

    public boolean containsValue(Integer value) {
        for (int i = 0; i < nodes.length; i++) {
            Node node = nodes[i];

            while (node != null) {
                if (node.value.equals(value)) {
                    return true;
                }

                node = node.nextnode;
            }
        }

        return false;
    }


}

