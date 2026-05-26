package jobsheet14;

public class BinaryTree27 {
    Node27 root;

    public BinaryTree27() {
        root = null;
    }

    public boolean isEmpty27() {
        return root == null;
    }

    public void add27(Mahasiswa27 mahasiswa) {
        Node27 newNode = new Node27(mahasiswa);

        if (isEmpty27()) {
            root = newNode;
        } else {
            Node27 current = root;
            Node27 parent = null;

            while (true) {
                parent = current;

                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;

                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;

                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find27(double ipk) {
        boolean result = false;
        Node27 current = root;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }

        return result;
    }

    public void traversePreOrder27(Node27 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi27();
            traversePreOrder27(node.left);
            traversePreOrder27(node.right);
        }
    }

    public void traverseInOrder27(Node27 node) {
        if (node != null) {
            traverseInOrder27(node.left);
            node.mahasiswa.tampilInformasi27();
            traverseInOrder27(node.right);
        }
    }

    public void traversePostOrder27(Node27 node) {
        if (node != null) {
            traversePostOrder27(node.left);
            traversePostOrder27(node.right);
            node.mahasiswa.tampilInformasi27();
        }
    }

    public Node27 getSuccessor27(Node27 del) {
        Node27 successor = del.right;
        Node27 successorParent = del;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }

        return successor;
    }

    public void delete27(double ipk) {
        if (isEmpty27()) {
            System.out.println("Binary tree kosong");
            return;
        }

        Node27 parent = root;
        Node27 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }

        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else {
                if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        } else {
            Node27 successor = getSuccessor27(current);
            System.out.print("Jika 2 anak, current = ");
            current.mahasiswa.tampilInformasi27();

            if (current == root) {
                root = successor;
            } else {
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }

            successor.left = current.left;
        }
    }

    // Tugas Praktikum nomor 1
    public void addRekursif27(Mahasiswa27 mahasiswa) {
        root = addRekursif27(root, mahasiswa);
    }

    private Node27 addRekursif27(Node27 node, Mahasiswa27 mahasiswa) {
        if (node == null) {
            return new Node27(mahasiswa);
        }

        if (mahasiswa.ipk < node.mahasiswa.ipk) {
            node.left = addRekursif27(node.left, mahasiswa);
        } else {
            node.right = addRekursif27(node.right, mahasiswa);
        }

        return node;
    }

    // Tugas Praktikum nomor 2
    public void cariMinIPK27() {
        if (isEmpty27()) {
            System.out.println("Tree masih kosong");
            return;
        }

        Node27 current = root;
        while (current.left != null) {
            current = current.left;
        }

        System.out.println("Mahasiswa dengan IPK paling kecil:");
        current.mahasiswa.tampilInformasi27();
    }

    public void cariMaxIPK27() {
        if (isEmpty27()) {
            System.out.println("Tree masih kosong");
            return;
        }

        Node27 current = root;
        while (current.right != null) {
            current = current.right;
        }

        System.out.println("Mahasiswa dengan IPK paling besar:");
        current.mahasiswa.tampilInformasi27();
    }

    // Tugas Praktikum nomor 3
    public void tampilMahasiswaIPKdiAtas27(double ipkBatas) {
        tampilMahasiswaIPKdiAtas27(root, ipkBatas);
    }

    private void tampilMahasiswaIPKdiAtas27(Node27 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas27(node.left, ipkBatas);

            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi27();
            }

            tampilMahasiswaIPKdiAtas27(node.right, ipkBatas);
        }
    }
}