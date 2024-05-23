import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MilkShakespeare> order = new ArrayList<>();

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

        order.add(new Library(order.size() + 1,"Hello There"));

        order.add(new Library(order.size() + 1,"Hello There"));

        order.add(new MilkShakeBar((order.size() + 1), flavours[(int)(Math.random() * (flavours.length - 1))], sizes[(int)(Math.random() * (sizes.length - 1))]));

        order.add(new Library(order.size() + 1,"Hello There"));


        for(int i = 0; i < order.size(); i++){
            if(i % 3 == 0){
                order.get(i).finish("Senior");
                System.out.println(order.get(i).getId());
            } else if (order.get(i) instanceof MilkShakeBar){
                order.get(i).finish("Mid-Level");
                System.out.println(order.get(i).getId());

            } else {
                order.get(i).finish("Junior");
                System.out.println(order.get(i).getId());

            }
        }

    }
}