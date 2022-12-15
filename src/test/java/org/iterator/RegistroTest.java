package org.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {
    @Test
    void deveContarMembrosAtivosGrupo() {
        Grupo grupo = new Grupo(
                new Membros("Wiliam", true),
                new Membros("Lucas", true),
                new Membros("Rodrigo", false),
                new Membros("Samira", true)
        );
        assertEquals(3, Registro.contarMembrosAtivosGrupo(grupo));
    }

    @Test
    void deveContarTotalGatosClinica() {
        Grupo grupo = new Grupo(
                new Membros("Wiliam", true),
                new Membros("Lucas", true),
                new Membros("Rodrigo", false),
                new Membros("Samira", true)
        );
        assertEquals(4, Registro.contarTotalMembrosGrupo(grupo));
    }
}