import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ContactManagerScreen extends JFrame {
    private JTextField lblEmail;
    private JButton createButton;
    private JButton showAllButton;
    private JButton deleteButton;
    private JButton findButton;
    private JButton editButton;
    private JTextField lblName;
    private JTextField lblPhone;
    private JButton fakesButton;
    public JPanel ContactButtonScreen;
    public JPanel ContactInputScreen;
    public JPanel contactPanel;
    private JTextArea allContacts;
    private JTextField textField1;

    static ArrayList<ContactManager> notebook = new ArrayList<ContactManager>();


    public ContactManagerScreen() {


        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ContactManager person = new ContactManager(lblName.getText(), lblEmail.getText(),Integer.parseInt(lblPhone.getText()));

                notebook.add(person);


            }


        });
        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (ContactManager contact : notebook) {
//                    notebook.get(i).getName();
                    if (contact.getName().equals(lblName.getText())) {
                        System.out.println(contact.getName());
                        lblName.setText(contact.getName());
                        lblEmail.setText(contact.getEmail());
                        lblPhone.setText(Integer.toString(contact.getPhoneNumber()));
                    }
                }

            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for(int i = 0; i < notebook.size(); i++){
//                    notebook.get(i).getName();
                    if ( notebook.get(i).getName().equals(lblName.getText())){
                        notebook.remove(i);
                    }
                }

            }


        });
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < notebook.size(); i++) {
                    if (notebook.get(i).getName().equals(lblName.getText())) {
                        lblName.setText(notebook.get(i).getName());
//                        lblEmail.setText(notebook.get(i).getEmail());
//                        lblPhone.setText(Integer.toString(notebook.get(i).getPhoneNumber()));

                        ContactManager editContact = new ContactManager(lblName.getText(), lblEmail.getText(),Integer.parseInt(lblPhone.getText()));

                       notebook.set(i, editContact);


                    }
                }
            }
        });
        showAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String concatAll = "";

                    for(int j = 0; j < notebook.size(); j++){

                        concatAll = concatAll.concat(String.format("Name: %s \nEmail: %s \nPhone Number: %d \n -----------------------\n", notebook.get(j).getName(), notebook.get(j).getEmail(), notebook.get(j).getPhoneNumber()));
                    }

                    allContacts.setText(concatAll);
            }


        });

        fakesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] names = {"Emma", "Drew", "Kristen"};
                String[] emails = {"emma@gmail.com", "drew@gmail.com", "kristen@gmail.com"};
                int[] phones = {9994, 99945, 99944};



                for (int k =0; k < names.length;  k++){
                    ContactManager fakesContact = new ContactManager(names[k], emails[k],phones[k]);

                    notebook.add(fakesContact);
                }

            }

        });
    }
}
