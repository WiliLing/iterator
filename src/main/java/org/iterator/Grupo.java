package org.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Grupo implements Iterable<Membros>{
    private List<Membros> membros = new ArrayList<Membros>();

    public Grupo(Membros... membros) {
        this.membros = Arrays.asList(membros);
    }

    @Override
    public Iterator<Membros> iterator() {
        return membros.iterator();
    }
}
