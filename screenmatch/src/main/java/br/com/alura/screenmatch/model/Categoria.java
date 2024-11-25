package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action"),
    ANIMACAO("Animation"),
    CLASSICO("Classic"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    MUSICAL("Musical"),
    ROMANCE("Romance"),
    COMEDIA_ROMANTICA("Romantic Comedy"),
    SCI_FI("Sci-Fi"),
    SUSPENSE("Thriller"),
    CRIME("Crime"),
    TERROR("Horror"),
    FAROESTE("Western"),
    DOCUMENTARIO("Documentary"),
    GUERRA("War"),
    AVENTURA("Adventure");

    private String categoriaOmdb;

    Categoria(String categoriaOmdb) {
        this.categoriaOmdb = categoriaOmdb;
    }

    public static Categoria fromString(String categoriaOmdb) {
        for (Categoria cat : Categoria.values()) {
            if (cat.categoriaOmdb.equals(categoriaOmdb)) {
                return cat;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a série");
    }
}
