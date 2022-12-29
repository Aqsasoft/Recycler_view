package AdapterClass;

import android.content.Context;
import android.graphics.Color;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_activity.R;

import java.util.ArrayList;

import ModalClass.Team_ModalClass;

public class Team_AdapterClass extends RecyclerView.Adapter<Team_AdapterClass.viewHolder> {

    ArrayList<Team_ModalClass> teamList;
    Context context;

    public Team_AdapterClass(ArrayList<Team_ModalClass> teamList, Context context) {
        this.teamList = teamList;
        this.context = context;
    }

    @NonNull
    @Override
    public Team_AdapterClass.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.team_items_activity,parent,false);
        return new viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Team_AdapterClass.viewHolder holder, int position) {

        Team_ModalClass team_modalClass=teamList.get(position);
        holder.teamImg.setImageResource(team_modalClass.getTeamImg());
        holder.teamText1.setText(team_modalClass.getTeamText1());
        holder.teamText2.setText(team_modalClass.getTeamText2());
        holder.cardView.setBackgroundColor(Color.parseColor(team_modalClass.getTeamColor()));
    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }

    public void filter2List(ArrayList<Team_ModalClass> filtered2List) {
        teamList=filtered2List;
        notifyDataSetChanged();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView teamText1,teamText2;
        ImageView teamImg;
        CardView cardView;


        public viewHolder(@NonNull View itemView) {
            super(itemView);

            teamText1=itemView.findViewById(R.id.team_text1);
            teamText2=itemView.findViewById(R.id.team_text2);
            cardView=itemView.findViewById(R.id.CardLayout);
            teamImg =itemView.findViewById(R.id.team_img);


        }
    }
}
