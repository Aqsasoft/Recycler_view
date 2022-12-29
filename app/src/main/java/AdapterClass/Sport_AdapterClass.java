package AdapterClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_activity.R;

import java.util.ArrayList;

import ModalClass.Sport_ModalClass;

public class Sport_AdapterClass extends RecyclerView.Adapter<Sport_AdapterClass.viewHolder> {

    ArrayList<Sport_ModalClass> sportList;
    Context context;

    public Sport_AdapterClass(ArrayList<Sport_ModalClass> sportList, Context context) {
        this.sportList = sportList;
        this.context = context;
    }

    @NonNull
    @Override
    public Sport_AdapterClass.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.sports_item_activity,parent,false);
        return new viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Sport_AdapterClass.viewHolder holder, int position) {

        Sport_ModalClass sport_modalClass=sportList.get(position);
        holder.sportImg.setImageResource(sport_modalClass.getSportImg());
        holder.sportText.setText(sport_modalClass.getSportText());


    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public void filterList(ArrayList<Sport_ModalClass> filteredList) {
        sportList=filteredList;
        notifyDataSetChanged();

    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView sportText;
        ImageView sportImg;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            sportText=itemView.findViewById(R.id.sport_tv);
            sportImg=itemView.findViewById(R.id.sport_img);

        }
    }
}
