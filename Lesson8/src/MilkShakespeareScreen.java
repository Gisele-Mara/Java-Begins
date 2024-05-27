import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MilkShakespeareScreen extends JFrame  {
    public JPanel ordersPanel;
    private JButton fakeOrders;
    private JTable ordersTable;
    private JScrollPane ordersScroll;

    static String[] columnNames = { "Id", "Product", "Attendant", "Status", "Button" };
   // static String[][] data = {{"1", "2", "3","4","5"}};
   // static ArrayList<String[]> orderData = new ArrayList<>();
    static ArrayList<MilkShakespeare> order = new ArrayList<>();




    public MilkShakespeareScreen (){
       // ArrayList<MilkShakespeare> order = new ArrayList<>();

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


        String [] flavours = {
                "Banana", "Classic Vanilla", "Oreo",
                "Blueberry Breakfast",	"Fuzzy Navel", "Pumpkin Pie",
                "Chocolate Cherry","Lime Sherbet", "Purple Cow",
                "Chocolate Peanut Butter", "Malted", "Strawberry Banana",
                "Chocolate", "Old Fashioned Chocolate", "Tropical Breeze",
                "Chunky Monkey","Old Timer’s Malted", "Whipped Cherry",
                "Classic Jello", "Oregon Chai", "Whoppers Malt"
        };

        String [] sizes = {"Small", "Medium", "Large"};



        fakeOrders.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // order.add(new Library(order.size() + 1,bookTitles[(int)(Math.random() * (bookTitles.length - 1))]));

                //order.add(new Library(order.size() + 1,bookTitles[(int)(Math.random() * (bookTitles.length - 1))]));

                // order.add(new MilkShakeBar((order.size() + 1), flavours[(int)(Math.random() * (flavours.length - 1))], sizes[(int)(Math.random() * (sizes.length - 1))]));

                 order.add(new Library(order.size() + 1,bookTitles[(int)(Math.random() * (bookTitles.length - 1))]));

                updateTable(order.getLast());
            }
        });
    }

    public void createWindow(){
        ordersPanel = new JPanel();
        ordersPanel.add(fakeOrders);
        ordersTable = new JTable(new DefaultTableModel(columnNames, 0));
        ordersTable.setBounds(20,30,600,400);
        ordersScroll = new JScrollPane(ordersTable);

        ordersPanel.add(ordersScroll);

        getContentPane().add(ordersPanel);
        setSize(800, 620);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void updateTable(MilkShakespeare newOrder) {
        DefaultTableModel model = (DefaultTableModel) ordersTable.getModel();
        if (newOrder instanceof MilkShakeBar milkShakeBar) {
            model.addRow(new Object[]{milkShakeBar.getId(), milkShakeBar.getFlavour(), "", "", ""});
        } else if (newOrder instanceof Library library) {
            model.addRow(new Object[]{library.getId(), library.getBook(), "", "", ""});
        }

        }
    }



