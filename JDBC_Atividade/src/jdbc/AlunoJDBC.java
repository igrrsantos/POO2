package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

import entities.Aluno;

public class AlunoJDBC {

	String sql;
	PreparedStatement pst;


	public void salvar(Aluno a, Connection con) throws IOException {

		try {

			sql = "INSERT INTO aluno (nome, sexo, dt_nasc) VALUES (?,  ?, ?)";

			pst = con.prepareStatement(sql);
			pst.setString(1, a.getNome());
			pst.setString(2, a.getSexo());

			Date dataSql = new Date(a.getDt_nasc().getTime());
			pst.setDate(3, dataSql);

			pst.executeUpdate();
			System.out.println("\nCadastro do aluno realizado com sucesso!");

		}
		catch (SQLException e) {

			System.out.println(e);
		}

	}

	public List<Aluno> listar(Connection con) {
    List<Aluno> alunos = new ArrayList<>();

    try {
        sql = "SELECT * FROM aluno";
        pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Aluno aluno = new Aluno();
            aluno.setId(rs.getInt("id"));
            aluno.setNome(rs.getString("nome"));
            aluno.setSexo(rs.getString("sexo"));
            aluno.setDt_nasc(rs.getDate("dt_nasc"));

            alunos.add(aluno);
        }

    } catch (SQLException e) {
        System.out.println(e);
    }

    return alunos;
	}

	public void apagar(int id, Connection con) {
    try {
        sql = "DELETE FROM aluno WHERE id = ?";
        pst = con.prepareStatement(sql);
        pst.setInt(1, id);

        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Aluno com ID " + id + " foi excluído com sucesso!");
        } else {
            System.out.println("Nenhum aluno com o ID " + id + " encontrado.");
        }

    } catch (SQLException e) {
        System.out.println(e);
    }
	}

	public void alterar(Aluno a, Connection con) {
    try {
        sql = "UPDATE aluno SET nome = ?, sexo = ?, dt_nasc = ? WHERE id = ?";
        pst = con.prepareStatement(sql);
        pst.setString(1, a.getNome());
        pst.setString(2, a.getSexo());

        Date dataSql = new Date(a.getDt_nasc().getTime());
        pst.setDate(3, dataSql);
        pst.setInt(4, a.getId());

        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Aluno com ID " + a.getId() + " foi atualizado com sucesso!");
        } else {
            System.out.println("Nenhum aluno com o ID " + a.getId() + " encontrado.");
        }

    } catch (SQLException e) {
        System.out.println(e);
    }
	}
}

