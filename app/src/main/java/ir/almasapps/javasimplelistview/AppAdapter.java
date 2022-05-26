package ir.almasapps.javasimplelistview;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import java.util.List;

import ir.almasapps.javasimplelistview.Model.App;

public class AppAdapter extends BaseAdapter {

    Context context;
    List<App> appList;

    public AppAdapter(Context _context, List<App> _appList){
        this.context = _context;
        this.appList = _appList;
    }
    @Override
    public int getCount() {
        return appList.size();
    }

    @Override
    public Object getItem(int i) {
        return appList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.list_items,null);

        TextView txtName = view.findViewById(R.id.item_txtName);
        TextView txtDescription = view.findViewById(R.id.item_txtDescription);
        TextView txtType = view.findViewById(R.id.item_txtType);
        CardView layout = view.findViewById(R.id.item_layout);
        ImageView img = view.findViewById(R.id.item_imgLogo);

        txtName.setText(appList.get(i).getName());
        txtDescription.setText(appList.get(i).getCompany() + " - " + appList.get(i).getCeo());
        txtType.setText(appList.get(i).getType());
        img.setImageResource(appList.get(i).getImage());
        layout.setCardBackgroundColor(Color.parseColor(appList.get(i).getColor()));


        return view;
    }
}
