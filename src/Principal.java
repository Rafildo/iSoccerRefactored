import Menu_Visao.Menu_Geral;

public class Principal {
    private static boolean var = false;
    private static Menu_Geral menu = new Menu_Geral();

    public static void main(String [] args)
    {
        while(!var)
        {
            menu.displayMenu();
        }
    }
}
