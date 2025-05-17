public class MainDAO {
    public static void main(String[] args) {
        Person p = new Person("John Doe");
        DAOManager dm = new DAOManager();
        dm.setPersonDAO(new MySQLPersonDAO());
        try {
            dm.getPersonDAO().savePerson(p);
        } catch (Exception e) {
            e.printStackTrace();;
        }
    }
}