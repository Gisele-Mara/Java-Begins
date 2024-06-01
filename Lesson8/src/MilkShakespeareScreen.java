import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.util.ArrayList;

public class MilkShakespeareScreen extends JFrame {

    private JPanel ordersPanel;
    private JButton fakeOrdersButton;
    private JTable ordersTable;
    private JScrollPane ordersScroll;

    static String[] columnNames = { "Id", "Product", "Attendant", "Status", "Button" };
    static ArrayList<MilkShakespeare> order = new ArrayList<>();

    public MilkShakespeareScreen() {
        ordersPanel = new JPanel();
        fakeOrdersButton = new JButton("Fake Orders");
        ordersPanel.add(fakeOrdersButton);
        ordersTable = new JTable(new DefaultTableModel(columnNames, 0));
        ordersScroll = new JScrollPane(ordersTable);

        ordersPanel.add(ordersScroll);

        getContentPane().add(ordersPanel);
        setSize(800, 620);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        fakeOrders();
        finishOrder();
    }

    public void fakeOrders() {
        fakeOrdersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] bookTitles = {
                        "The Milky Way: A Journey Through Milkshakes",
                        "The Secret Recipe: Unraveling the Mysteries of Milkshakes",
                        "Beyond Vanilla: Exploring Exotic Milkshake Flavors",
                        "The Great Milkshake Caper: A Whipped Cream Whodunit",
                        "Milkshake Magic: Stirring Up Sweet Adventures",
                        "Chasing Milkshakes: A Road Trip of Flavor",
                        "The Milkshake Manifesto: Recipes for a Creamy Revolution",
                        "The Milkshake Chronicles: From Straw to Sip",
                        "The Milkshake Paradox: Finding Harmony in Flavor",
                        "Whirlwind Whips: Spinning Tales of Milkshake Adventures",
                        "Milkshake Mastery: Crafting the Perfect Blend",
                        "The Art of Froth: Mastering Milkshake Foam",
                        "Milkshake Metropolis: A City Built on Creamy Concoctions",
                        "A Milkshake for Every Mood: Satisfying Cravings, One Sip at a Time",
                        "Penguin Problems: A Bird's Guide to Life's Icy Challenges",
                        "Toaster Troubles: A Toast to Mishaps in the Kitchen",
                        "The Quest for the Perfect Sock: Adventures in the Dryer Dimension",
                        "Banana Drama: A Peel of Laughter",
                        "Sock Monkeys in Space: A Yarn of Cosmic Proportions",
                        "The Legend of the Exploding Toaster: A Crispy Mystery",
                        "The Peculiar Case of the Dancing Broccoli: A Vegetable Whodunit",
                        "Tea Time Terrors: Brewed to Perfection, Served with Fear"
                };

                String[] flavours = {
                        "Banana", "Classic Vanilla", "Oreo",
                        "Blueberry Breakfast", "Fuzzy Navel", "Pumpkin Pie",
                        "Chocolate Cherry", "Lime Sherbet", "Purple Cow",
                        "Chocolate Peanut Butter", "Malted", "Strawberry Banana",
                        "Chocolate", "Old Fashioned Chocolate", "Tropical Breeze",
                        "Chunky Monkey", "Old Timer’s Malted", "Whipped Cherry",
                        "Classic Jello", "Oregon Chai", "Whoppers Malt"
                };

                String[] sizes = { "Small", "Medium", "Large" };

                order.add(new MilkShakeBar((order.size() + 1), flavours[(int) (Math.random() * (flavours.length - 1))],
                        sizes[(int) (Math.random() * (sizes.length - 1))]));
                order.add(new Library(order.size() + 1, bookTitles[(int) (Math.random() * (bookTitles.length - 1))]));

                // updateTable(order.get(order.size() - 1));
                cleanTable();
                for (MilkShakespeare milkShakespeare : order) {
                    updateTable(milkShakespeare);
                }
            }
        });
    }

    public void finishOrder() {
        System.out.println("FinishOrder");
        ordersTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int selectedRow = ordersTable.getSelectedRow();
                System.out.println("Selected Row: " + selectedRow);
                
                order.get(selectedRow).finish("WOW");
                cleanTable();
                for(int i = 0; i < order.size(); i++){
                    if(i % 3 == 0){
                        order.get(i).setAttendant("Senior");
                
                    } else if (order.get(i) instanceof MilkShakeBar){
                        order.get(i).setAttendant("Mid-Level");
                       
                    } else {
                        order.get(i).setAttendant("Junior");
                      
        
                    }
                }
                for (MilkShakespeare milkShakespeare : order) {
                    updateTable(milkShakespeare);
                }

            }

        });
    }

    private void updateTable(MilkShakespeare newOrder) {
        DefaultTableModel model = (DefaultTableModel) ordersTable.getModel();
        if (newOrder instanceof MilkShakeBar milkShakeBar) {
            model.addRow(
                    new Object[] { milkShakeBar.getId(), milkShakeBar.getFlavour(), milkShakeBar.getAttendant(), milkShakeBar.isStatus(), "" });
        } else if (newOrder instanceof Library library) {
            model.addRow(new Object[] { library.getId(), library.getBook(), library.getAttendant(), library.isStatus(), "" });
        }
    }

    private void cleanTable() {
        DefaultTableModel model = (DefaultTableModel) ordersTable.getModel();
        model.setRowCount(0);
    }

}
