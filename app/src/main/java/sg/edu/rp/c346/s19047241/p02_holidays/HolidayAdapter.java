package sg.edu.rp.c346.s19047241.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class HolidayAdapter extends ArrayAdapter<Holidays> {
    private ArrayList<Holidays> holidays;
    private Context context;
    private TextView tvName, tvDate;
    private ImageView imageView;


    public HolidayAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Holidays> objects) {
        super(context, resource, objects);

        holidays = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.holiday_row, parent, false);

        Holidays currentHol = holidays.get(position);

        tvName = rowView.findViewById(R.id.txtHoliday);
        tvDate = rowView.findViewById(R.id.txtDate);
        imageView = rowView.findViewById(R.id.ivIcon);


        tvName.setText(currentHol.getHolidayName());
        tvDate.setText(currentHol.getHolidayDate());
        imageView.setImageResource(currentHol.getHolidayImage());

        return rowView;
    }
}
