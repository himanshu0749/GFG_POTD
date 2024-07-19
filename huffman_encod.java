public ArrayList<String> huffmanCodes(String S, int f[], int N) {
        // Step 1: Create a Min-Heap
        PriorityQueue<Node> minHeap = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            minHeap.add(new Node(S.charAt(i), f[i]));
        }

        // Step 2: Build the Huffman Tree
        while (minHeap.size() > 1) {
            Node left = minHeap.poll();
            Node right = minHeap.poll();
            Node newNode = new Node(left.freq + right.freq, left, right);
            minHeap.add(newNode);
        }

        // The root of the Huffman Tree
        Node root = minHeap.poll();

        // Step 3: Generate Huffman Codes and collect them in preorder traversal
        ArrayList<String> result = new ArrayList<>();
        generateCodes(root, "", result);

        return result;
    }

    private void generateCodes(Node root, String code, ArrayList<String> result) {
        if (root == null) return;

        if (root.ch != '\0') {
            result.add(code);
        }

        generateCodes(root.left, code + "0", result);
        generateCodes(root.right, code + "1", result);
    }
