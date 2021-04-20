package sg.edu.rp.c346.s19047241.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends ArrayAdapter<categories> {
    private ArrayList<categories> cat;
    private Context context;
    private TextView tvCat;

    public CategoryAdapter(@NonNull Context context, int resource, @NonNull ArrayList<categories> objects) {
        super(context, resource, objects);

        cat = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.category_row, parent, false);

        categories currentCat = cat.get(position);

        tvCat = rowView.findViewById(R.id.txtName);
        tvCat.setText(currentCat.getCategory());

        return rowView;
    }
}
