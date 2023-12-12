import java.net.*;
import java.util.Enumeration;

public class AdresseIPProgramme {
    public static void main(String[] args) {
        try {
            // Récupérer et afficher l'ensemble des interfaces réseaux
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            System.out.println("Interfaces réseau disponibles:");
            while (interfaces.hasMoreElements()) {
                NetworkInterface iface = interfaces.nextElement();
                System.out.println("Interface: " + iface.getName());
            }

            // Afficher l'adresse IP et le nom de l'interface associée
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("\nAdresse IP locale: " + localhost.getHostAddress());

            NetworkInterface networkInterface = NetworkInterface.getByInetAddress(localhost);
            System.out.println("Interface associée: " + networkInterface.getName());

        } catch (SocketException | UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
