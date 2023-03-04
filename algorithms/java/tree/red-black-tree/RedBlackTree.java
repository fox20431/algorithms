class Node {
    int val;
    Node left;
    Node right;
    Node parent;
    boolean isRed;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
        this.parent = null;
        this.isRed = true;
    }
}

public class RedBlackTree {
    private Node root;

    public RedBlackTree() {
        this.root = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (root == null) {
            root = node;
            root.isRed = false;
            return;
        }
        Node parent = findParent(node);
        node.parent = parent;
        if (val < parent.val) {
            parent.left = node;
        } else {
            parent.right = node;
        }
        fixInsert(node);
    }

    public void delete(int val) {
        Node node = find(val);
        if (node == null) {
            return;
        }
        Node child;
        if (node.left != null && node.right != null) {
            Node successor = findSuccessor(node);
            node.val = successor.val;
            node = successor;
        }
        if (node.left != null) {
            child = node.left;
        } else {
            child = node.right;
        }
        if (child != null) {
            child.parent = node.parent;
        }
        if (node.parent == null) {
            root = child;
        } else if (node == node.parent.left) {
            node.parent.left = child;
        } else {
            node.parent.right = child;
        }
        if (!node.isRed) {
            fixDelete(child);
        }
    }

    public Node find(int val) {
        Node node = root;
        while (node != null) {
            if (val == node.val) {
                return node;
            } else if (val < node.val) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return null;
    }

    private Node findParent(Node node) {
        Node parent = null;
        Node cur = root;
        while (cur != null) {
            parent = cur;
            if (node.val < cur.val) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return parent;
    }

    private void fixInsert(Node node) {
        while (node.parent != null && node.parent.isRed) {
            if (node.parent == node.parent.parent.left) {
                Node uncle = node.parent.parent.right;
                if (uncle != null && uncle.isRed) {
                    node.parent.isRed = false;
                    uncle.isRed = false;
                    node.parent.parent.isRed = true;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.right) {
                        node = node.parent;
                        leftRotate(node);
                    }
                    node.parent.isRed = false;
                    node.parent.parent.isRed = true;
                    rightRotate(node.parent.parent);
                }
            } else {
                Node uncle = node.parent.parent.left;
                if (uncle != null && uncle.isRed) {
                    node.parent.isRed = false;
                    uncle.isRed = false;
                    node.parent.parent.isRed = true;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.left) {
                        node = node.parent;
                        rightRotate(node);
                    }
                    node.parent.isRed = false;
                    node.parent.parent.isRed = true;
                    leftRotate(node.parent.parent);
                }
            }
        }
        root.isRed = false;
    }

    private void fixDelete(Node node) {
        while (node != root && !node.isRed) {
            if (node == node.parent.left) {
                Node sibling = node.parent.right;
                if (sibling.isRed) {
                    sibling.isRed = false;
                    node.parent.isRed = true;
                    leftRotate(node.parent);
                    sibling = node.parent.right;
                }
                if (!sibling.left.isRed && !sibling.right.isRed) {
                    sibling.isRed = true;
                    node = node.parent;
                } else {
                    if (!sibling.right.isRed) {
                        sibling.left.isRed = false;
                        sibling.isRed = true;
                        rightRotate(sibling);
                        sibling = node.parent.right;
                    }
                    sibling.isRed = node.parent.isRed;
                    node.parent.isRed = false;
                    sibling.right.isRed = false;
                    leftRotate(node.parent);
                    node = root;
                }
            } else {
                Node sibling = node.parent.left;
                if (sibling.isRed) {
                    sibling.isRed = false;
                    node.parent.isRed = true;
                    rightRotate(node.parent);
                    sibling = node.parent.left;
                }
                if (!sibling.left.isRed && !sibling.right.isRed) {
                    sibling.isRed = true;
                    node = node.parent;
                } else {
                    if (!sibling.left.isRed) {
                        sibling.right.isRed = false;
                        sibling.isRed = true;
                        leftRotate(sibling);
                        sibling = node.parent.left;
                    }
                    sibling.isRed = node.parent.isRed;
                    node.parent.isRed = false;
                    sibling.left.isRed = false;
                    rightRotate(node.parent);
                    node = root;
                }
            }
        }
        node.isRed = false;
    }

    private void leftRotate(Node node) {
        Node right = node.right;
        node.right = right.left;
        if (right.left != null) {
            right.left.parent = node;
        }
        right.parent = node.parent;
        if (node.parent == null) {
            root = right;
        } else if (node == node.parent.left) {
            node.parent.left = right;
        } else {
            node.parent.right = right;
        }
        right.left = node;
        node.parent = right;
    }

    private void rightRotate(Node node) {
        Node left = node.left;
        node.left = left.right;
        if (left.right != null) {
            left.right.parent = node;
        }
        left.parent = node.parent;
        if (node.parent == null) {
            root = left;
        } else if (node == node.parent.right) {
            node.parent.right = left;
        } else {
            node.parent.left = left;
        }
        left.right = node;
        node.parent = left;
    }

    private Node findSuccessor(Node node) {
        Node cur = node.right;
        while (cur.left != null) {
            cur = cur.left;
        }
        return cur;
    }
}