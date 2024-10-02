package br.edu.ifgoias.academico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.edu.ifgoias.academico.entities.Disciplina;
import br.edu.ifgoias.academico.repositories.DisciplinaRepository;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository disciplinaRep;

    // Método para listar todas as disciplinas
    public List<Disciplina> findAll() {
        return disciplinaRep.findAll();
    }

    // Método para encontrar uma disciplina por id (chave primária)
    public Disciplina findById(Integer id) {
        return disciplinaRep.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Disciplina não encontrada"));
    }

    // Método para inserir uma nova disciplina
    public Disciplina insert(Disciplina obj) {
        return disciplinaRep.save(obj);
    }

    // Método para deletar uma disciplina pelo id
    public void delete(Integer id) {
        findById(id); // Verifica se a disciplina existe antes de deletar
        disciplinaRep.deleteById(id);
    }

    // Método para atualizar uma disciplina existente
    public Disciplina update(Integer id, Disciplina objAlterado) {
        return disciplinaRep.findById(id).map(disciplinaDB -> {
            disciplinaDB.setNome(objAlterado.getNome());
            disciplinaDB.setCargaHoraria(objAlterado.getCargaHoraria());
            return disciplinaRep.save(disciplinaDB);
        }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Disciplina não encontrada"));
    }
}
