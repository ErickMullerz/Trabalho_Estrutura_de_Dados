
package com.trabalho.resources.estruturas;

import com.trabalho.resources.entidades.Pessoa;
import java.util.HashMap;
import java.util.Map;

public class HashPessoa {
    private Map<String, Pessoa> hashMap;

    public HashPessoa() {
        hashMap = new HashMap<>();
    }

    // Add a person to the hash map
    public void addPessoa(Pessoa pessoa) {
        if (pessoa.getMatricula() != null) {
            hashMap.put(pessoa.getMatricula(), pessoa);
        } else {
            // Handle unknown people (without matricula)
            hashMap.put(pessoa.getNome(), pessoa);
        }
    }

    // Get a person by matricula or name
    public Pessoa getPessoa(String key) {
        return hashMap.get(key);
    }

    // Remove a person from the hash map
    public void removePessoa(String key) {
        hashMap.remove(key);
    }

    // Print all people in the hash map
    public void printAll() {
        for (Map.Entry<String, Pessoa> entry : hashMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
