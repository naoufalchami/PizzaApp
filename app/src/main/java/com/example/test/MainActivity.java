package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String[] itemNames = {"BARBECUED CHICKEN PIZZA", "BRUSCHETTA PIZZA", "SPINACH PIZZA", "DEEP-DISH SAUSAGE PIZZA"};
    private int[] itemImages = {R.drawable.pizza1, R.drawable.pizza2, R.drawable.pizza3, R.drawable.pizza4};
    private String[] itemQuantities = {"3", "5", "2", "8"};
    private int[] itemQuantityImages = {R.drawable.vegetable, R.drawable.vegetable, R.drawable.vegetable, R.drawable.vegetable};
    private String[] itemTimes = {"15.0 Min", "10.0 Min", "35.0 Min", "20.0 Min"};
    private int[] itemTimeImages = {R.drawable.clock, R.drawable.clock, R.drawable.clock, R.drawable.clock};
    private int cookingImage = R.drawable.cooking;
    private String[] itemDescriptions = {
            "This Barbecue Chicken Pizza recipe features a crispy crust topped with tangy barbecue sauce, " +
                    "tender shredded chicken, sweet corn, vibrant red bell peppers, and zesty red onion, " +
                    "all generously layered with melted mozzarella cheese. After a quick bake in the oven, " +
                    "the pizza emerges golden and bubbling, ready to be adorned with fresh cilantro for a burst of flavor. " +
                    "It's the perfect blend of savory and sweet, making it an ideal choice for a relaxed " +
                    "evening with loved ones or a quick weeknight dinner.",
            "Bruschetta Pizza combines the beloved flavors of traditional bruschetta with the comfort of a classic pizza. " +
                    "The recipe typically starts with a thin pizza crust topped with a layer of garlic-infused olive oil or tomato sauce. " +
                    "Sliced tomatoes, fresh basil leaves, minced garlic, and mozzarella cheese are then arranged over the sauce. " +
                    "After a brief bake in the oven, the pizza is finished with a drizzle of balsamic glaze or reduction and a " +
                    "sprinkle of grated Parmesan cheese. The result is a delightful fusion of Italian flavors, " +
                    "offering a light and refreshing twist on the traditional pizza experience.",
            "Spinach Pizza offers a flavorful and nutritious twist on the classic pizza. Typically, it begins with a pizza crust topped with a layer of tomato sauce or garlic-infused olive oil. " +
                    "Fresh or sautéed spinach leaves are then spread evenly over the sauce, followed by ingredients like sliced mushrooms, " +
                    "onions, and roasted garlic. Mozzarella cheese is generously sprinkled over the toppings, adding a creamy texture and gooey finish. " +
                    "Some recipes might include additional ingredients like feta cheese or sun-dried tomatoes for extra flavor. " +
                    "Once baked to golden perfection, the spinach pizza emerges with a vibrant green hue and a delightful aroma, " +
                    "offering a delicious and satisfying meal option for vegetarians and pizza lovers alike.",
            "Deep-dish sausage pizza is a hearty and indulgent take on the classic pizza, originating from Chicago. " +
                    "It typically features a thick and buttery crust that lines the bottom and sides of a deep-dish pizza pan. " +
                    "The crust is then layered with slices of Italian sausage, which are often seasoned with herbs and spices for added flavor. " +
                    "A generous amount of shredded mozzarella cheese is spread over the sausage, followed by a thick layer of rich tomato sauce. " +
                    "Additional toppings such as bell peppers, onions, and mushrooms may also be added according to preference. " +
                    "Once assembled, the pizza is baked in the oven until the crust is golden brown and crispy, and the cheese is melted and bubbly. " +
                    "The result is a satisfyingly thick and savory pizza, perfect for satisfying even the heartiest of appetites."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAdapter adapter = new MyAdapter(this, itemNames, itemImages, itemQuantities, itemQuantityImages, itemTimes, itemTimeImages, cookingImage);
        ListView listView = findViewById(R.id.lv);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent  = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("tittle",itemNames[position]);
                intent.putExtra("image",itemImages[position]);
                intent.putExtra("description",itemDescriptions[position]);
                startActivity(intent);
            }
        });



    }
}
