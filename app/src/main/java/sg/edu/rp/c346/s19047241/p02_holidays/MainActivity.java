package sg.edu.rp.c346.s19047241.p02_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvCat;
    ArrayList<categories> categories;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCat = findViewById(R.id.lvCategories);

        categories = new ArrayList<categories>();
        categories.add(new categories("Secular"));
        categories.add(new categories("Ethnic & Religion"));

        aa = new CategoryAdapter(this, R.layout.category_row, categories);
        lvCat.setAdapter(aa);

        lvCat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, holiday_screen.class);
                intent.putExtra("category", categories.get(position).getCategory());
                startActivity(intent);
            }
        });

    }
}