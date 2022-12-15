package org.iterator;
import java.util.Iterator;

public class Registro {
    public static Integer contarMembrosAtivosGrupo(Grupo grupo) {
        int quantidade = 0;
        for (Membros membro : grupo) {
            if (membro.Ativo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalMembrosGrupo(Grupo grupo) {
        int quantidade = 0;
        for (Iterator a = grupo.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
