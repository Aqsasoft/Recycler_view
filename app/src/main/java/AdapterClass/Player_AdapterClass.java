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

import ModalClass.Player_ModalClass;
import ModalClass.Team_ModalClass;

public class Player_AdapterClass extends RecyclerView.Adapter<Player_AdapterClass.viewHolder> {
    ArrayList<Player_ModalClass> playerList;
    Context context;

    public Player_AdapterClass(ArrayList<Player_ModalClass> playerList, Context context) {
        this.playerList = playerList;
        this.context = context;
    }

    @NonNull
    @Override
    public Player_AdapterClass.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.player_item_activity,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Player_AdapterClass.viewHolder holder, int position) {


       Player_ModalClass player_modalClass=playerList.get(position);
        holder.playerImg.setImageResource(player_modalClass.getPlayerImg());
        holder.playerText1.setText(player_modalClass.getPlayerText1());
        holder.playerText2.setText(player_modalClass.getPlayerText2());

    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }

    public void filter3List(ArrayList<Player_ModalClass> filtered3List) {
     playerList=filtered3List;
        notifyDataSetChanged();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView playerText1,playerText2;
        ImageView playerImg;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            playerText1=itemView.findViewById(R.id.player_text1);
            playerText2=itemView.findViewById(R.id.player_text2);
            playerImg=itemView.findViewById(R.id.player_img);


        }
    }
}
