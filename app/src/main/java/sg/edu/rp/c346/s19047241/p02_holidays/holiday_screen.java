package sg.edu.rp.c346.s19047241.p02_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class holiday_screen extends AppCompatActivity {

    ListView holidayList;
    TextView txtCat;
    ArrayAdapter aa;
    ArrayList<Holidays> alHoliday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiday_screen);

        holidayList = findViewById(R.id.lvHolidays);
        txtCat = findViewById(R.id.txtTitle);



        String categories = getIntent().getStringExtra("category");
        txtCat.setText(categories);

        alHoliday = new ArrayList<Holidays>();

        if(categories.equals("Secular")){
            alHoliday.add(new Holidays("New Year's Day", "1 Jan 2017", R.drawable.new_year, "Secular"));
            alHoliday.add(new Holidays("Labour Day", "1 May 2017", R.drawable.labour_day, "Secular"));
        }else if(categories.equals("Ethnic & Religion")){
            alHoliday.add(new Holidays("Chinese New Year", "28-29 Jan 2017", R.drawable.cny, "Ethnic"));
            alHoliday.add(new Holidays("Good Friday", "14 April 2017", R.drawable.good_friday, "Ethnic"));
        }

        aa = new HolidayAdapter(this, R.layout.holiday_row, alHoliday);
        holidayList.setAdapter(aa);

        holidayList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holidays selectedHol = alHoliday.get(position);

                Toast.makeText(holiday_screen.this, selectedHol.getHolidayName() + " Date: " + selectedHol.getHolidayDate(), Toast.LENGTH_LONG).show();

            }
        });






    }
}