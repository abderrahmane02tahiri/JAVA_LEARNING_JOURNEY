import java.sql.*;
import java.util.ArrayList;

public class EtudiantDAO {
    private Connection con;
    private Statement stat;

    public EtudiantDAO() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBGESTION", "root", "1234");
            stat = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean enregistrer(Etudiant student) {
        try {
            String query = "INSERT INTO etudiant(cne, nom, prenom, email, dateNaissance, pays, genre) VALUES(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, student.getCne());
            preparedStatement.setString(2, student.getNom());
            preparedStatement.setString(3, student.getPrenom());
            preparedStatement.setString(4, student.getEmail());
            preparedStatement.setString(5, student.getDateNaissance());
            preparedStatement.setString(6, student.getPays());
            preparedStatement.setString(7, student.getGenre());
            int result = preparedStatement.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean supprimerEtudiant(String cne) {
        try {
            String query = "DELETE FROM etudiant WHERE cne = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, cne);
            int result = preparedStatement.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean mettreAJour(Etudiant student) {
        try {
            String query = "UPDATE etudiant SET nom = ?, prenom = ?, email = ?, dateNaissance = ?, pays = ?, genre = ? WHERE cne = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, student.getNom());
            preparedStatement.setString(2, student.getPrenom());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.setString(4, student.getDateNaissance());
            preparedStatement.setString(5, student.getPays());
            preparedStatement.setString(6, student.getGenre());
            preparedStatement.setString(7, student.getCne());
            int result = preparedStatement.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Etudiant chercherEtudiant(String cne) {
        try {
            String query = "SELECT * FROM etudiant WHERE cne = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, cne);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return new Etudiant(resultSet.getString("cne"), resultSet.getString("nom"), resultSet.getString("prenom"), resultSet.getString("email"), resultSet.getString("dateNaissance"), resultSet.getString("pays"), resultSet.getString("genre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<Etudiant> getAllStudents() {
        ArrayList<Etudiant> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM etudiant";
            ResultSet resultSet = stat.executeQuery(query);
            while (resultSet.next()) {
                list.add(new Etudiant(resultSet.getString("cne"), resultSet.getString("nom"), resultSet.getString("prenom"), resultSet.getString("email"), resultSet.getString("dateNaissance"), resultSet.getString("pays"), resultSet.getString("genre")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}