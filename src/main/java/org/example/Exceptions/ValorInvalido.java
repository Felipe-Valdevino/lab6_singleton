package org.example.Exceptions;

public class ValorInvalido extends RuntimeException {
    public ValorInvalido() {
        super("Não é possivel criar uma figura com essas medidas.");
    }
}
