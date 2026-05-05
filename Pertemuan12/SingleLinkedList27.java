package Pertemuan12;

public class SingleLinkedList27 {
    NodeMahasiswa27 head;
    NodeMahasiswa27 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa27 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(Mahasiswa27 input) {
        NodeMahasiswa27 ndInput = new NodeMahasiswa27(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa27 input) {
        NodeMahasiswa27 ndInput = new NodeMahasiswa27(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa27 input) {
        NodeMahasiswa27 ndInput = new NodeMahasiswa27(input, null);
        NodeMahasiswa27 temp = head;

        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;

                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, Mahasiswa27 input) {
        if (index < 0) {
            System.out.println("Indeks salah!");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa27 temp = head;

            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("Indeks melebihi panjang linked list!");
                    return;
                }
                temp = temp.next;
            }

            if (temp == null) {
                System.out.println("Indeks tidak ditemukan!");
                return;
            }

            temp.next = new NodeMahasiswa27(input, temp.next);

            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public void getData(int index) {
        NodeMahasiswa27 tmp = head;

        for (int i = 0; i < index; i++) {
            if (tmp == null) {
                System.out.println("Indeks tidak ditemukan!");
                return;
            }
            tmp = tmp.next;
        }

        if (tmp != null) {
            tmp.data.tampilInformasi();
        } else {
            System.out.println("Indeks tidak ditemukan!");
        }
    }

    public int indexOf(String key) {
        NodeMahasiswa27 tmp = head;
        int index = 0;

        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa27 temp = head;

            while (temp.next != tail) {
                temp = temp.next;
            }

            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa27 temp = head;

            while (temp != null) {
                if (temp.data.nama.equalsIgnoreCase(key) && temp == head) {
                    removeFirst();
                    break;
                } else if (temp.next != null && temp.next.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;

                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }

                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa27 temp = head;

            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("Indeks tidak ditemukan!");
                    return;
                }
                temp = temp.next;
            }

            if (temp == null || temp.next == null) {
                System.out.println("Indeks tidak ditemukan!");
                return;
            }

            temp.next = temp.next.next;

            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}