
package com.trabalho.resources.estruturas;

import com.trabalho.resources.entidades.Carro;

public class ListaCarro {
    private class Node {
        Carro carro;
        Node next;

        Node(Carro carro) {
            this.carro = carro;
            this.next = null;
        }
    }

    private Node head;

    public ListaCarro() {
        head = null;
    }

    // Add a car to the linked list
    public void addCarro(Carro carro) {
        Node newNode = new Node(carro);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Remove a car from the linked list by plate number
    public void removeCarro(String placa) {
        if (head == null) return;

        if (head.carro.getPlaca().equals(placa)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.carro.getPlaca().equals(placa)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Find a car by plate number
    public Carro findCarro(String placa) {
        Node current = head;
        while (current != null) {
            if (current.carro.getPlaca().equals(placa)) {
                return current.carro;
            }
            current = current.next;
        }
        return null;
    }

    // Print all cars in the linked list
    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.carro);
            current = current.next;
        }
    }
}
