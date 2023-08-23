import javax.swing.JOptionPane;

public class Gui {
    public static void main(String[] args){
        String name= JOptionPane.showInputDialog("Enter your naam");
        JOptionPane.showMessageDialog(null,"Hello  "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age "));
        JOptionPane.showMessageDialog(null,"your are "+age+" years old");

    }
}
