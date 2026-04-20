# binary-search-tree-order-statistics

# Binary Search Tree – i-th Largest Element

This project implements a Binary Search Tree (BST) with an efficient method to find the i-th largest element.

## 🚀 Features
- Binary Search Tree structure
- Node size tracking for order statistics
- Efficient selection of the i-th largest element

## 🧠 How it works

Each node stores:
- key: value of the node
- size: number of nodes in the subtree rooted at this node

Algorithm idea:

1. Check the size of the right subtree
2. Compute the rank of the current node:
   rank = rightSubtreeSize + 1
3. Compare with i:
   - If equal → return current node
   - If smaller → go right
   - If larger → go left with adjusted index

## 📌 Example

Tree:

        4
      /   \
     2     6
    / \   / \
   1   3 5   7

Results:
- 1st largest → 7
- 2nd largest → 6
- 3rd largest → 5

## ▶️ Run the program

Compile:
javac BinarySearchTree.java

Run:
java BinarySearchTree

## ⚠️ Important Notes
- The size field must be correctly maintained
- Always call updateSize() after modifying the tree
- If i is out of bounds, an exception is thrown

## 📚 Use Cases
- Order statistics
- Ranking systems
- Efficient queries on sorted data

## 🛠️ Future Improvements
- Automatic size updates during insertion
- Deletion support
- Self-balancing tree (e.g. AVL or Red-Black Tree)
- Unit tests
