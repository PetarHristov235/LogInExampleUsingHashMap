public class Main {
    public static void main(final String[] args) {
        final IdAndPasswords idAndPasswords= new IdAndPasswords();
        new LoginPage(idAndPasswords.getLoginInfo());

    }
}
