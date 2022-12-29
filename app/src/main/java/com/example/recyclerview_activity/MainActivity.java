package com.example.recyclerview_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;

import AdapterClass.Player_AdapterClass;
import AdapterClass.Sport_AdapterClass;
import AdapterClass.Team_AdapterClass;
import ModalClass.Player_ModalClass;
import ModalClass.Sport_ModalClass;
import ModalClass.Team_ModalClass;

public class MainActivity extends AppCompatActivity {


    RecyclerView SportRecycler,TeamRecycler,PlayerRecycler;
    EditText editText;
//Sport
    ArrayList<Sport_ModalClass> SportList=new ArrayList<>();
    Sport_AdapterClass sportAdapter;
//Team
    ArrayList<Team_ModalClass> TeamList=new ArrayList<>();
   Team_AdapterClass teamAdapter;

   //Player
    ArrayList<Player_ModalClass> PlayerList=new ArrayList<>();
    Player_AdapterClass playerAdapter;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SportRecycler=findViewById(R.id.SportsRecycler);
        TeamRecycler=findViewById(R.id.TeamRecycler);
        PlayerRecycler=findViewById(R.id.PlayerRecycler);
        editText=findViewById(R.id.Search_Edit);



        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        SportRecycler.setLayoutManager(layoutManager1);

        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        TeamRecycler.setLayoutManager(layoutManager2);

        LinearLayoutManager layoutManager3 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        PlayerRecycler.setLayoutManager(layoutManager3);

        SportList.add(new Sport_ModalClass(R.drawable.ic_basketball,"FootBall"));
        SportList.add(new Sport_ModalClass(R.drawable.ic_tennis,"Tennis"));
        SportList.add(new Sport_ModalClass(R.drawable.ic_hockey,"Hockey"));
        SportList.add(new Sport_ModalClass(R.drawable.ic_volleyball,"Basketball"));
        SportList.add(new Sport_ModalClass(R.drawable.ic_gamepad,"Gamepad"));
        SportList.add(new Sport_ModalClass(R.drawable.ic_surfing,"Surfing"));

        sportAdapter=new Sport_AdapterClass(SportList,MainActivity.this);
        SportRecycler.setAdapter(sportAdapter);

        TeamList.add(new Team_ModalClass(R.drawable.erwer,"Paris Saint-","German","#F1D3B3"));
        TeamList.add(new Team_ModalClass(R.drawable.fsds,"Fatima","Noor","#C0EEE4"));
        TeamList.add(new Team_ModalClass(R.drawable.secc,"Aqsa","Naseer","#B6E2A1"));
        TeamList.add(new Team_ModalClass(R.drawable.dollp,"Ayesha","Anwar","#FFDB89"));
        TeamList.add(new Team_ModalClass(R.drawable.dolli,"Samia","Latif","#FFADBC"));
        TeamList.add(new Team_ModalClass(R.drawable.dollg,"Safoora","Ahsan","#91D8E4"));

        teamAdapter=new Team_AdapterClass(TeamList,MainActivity.this);
        TeamRecycler.setAdapter(teamAdapter);

        PlayerList.add(new Player_ModalClass(R.drawable.erwer,"Hamza","Naseer"));
        PlayerList.add(new Player_ModalClass(R.drawable.fsds,"Zubair","Naseer"));
        PlayerList.add(new Player_ModalClass(R.drawable.dollg,"Ayan","Ahmad"));
        PlayerList.add(new Player_ModalClass(R.drawable.dollp,"Umer","Ahmad"));
        PlayerList.add(new Player_ModalClass(R.drawable.dolli,"Hanzala","Arif"));
        PlayerList.add(new Player_ModalClass(R.drawable.secc,"Ahsan","Arif"));

        playerAdapter=new Player_AdapterClass(PlayerList,MainActivity.this);
        PlayerRecycler.setAdapter(playerAdapter);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                filters(editable.toString());
                filters2(editable.toString());
                filters3(editable.toString());

            }
        });
    }

    private void filters3(String text) {
        ArrayList<Player_ModalClass>filtered3List=new ArrayList<>();
        for (Player_ModalClass item2 : PlayerList){
            if (item2.getPlayerText1().contains(text.toLowerCase()))
            {
                filtered3List.add(item2);
            }
        }
        playerAdapter.filter3List(filtered3List);
    }

    private void filters2(String text) {
        ArrayList<Team_ModalClass> filtered2List=new ArrayList<>();
        for (Team_ModalClass item1 : TeamList)
        {
            if (item1.getTeamText1().contains(text.toLowerCase()))
            {
                filtered2List.add(item1);
            }
        }
       teamAdapter.filter2List(filtered2List);
    }

    private void filters(String text) {

        ArrayList<Sport_ModalClass> filteredList=new ArrayList<>();

        for (Sport_ModalClass item : SportList)
        {
            if (item.getSportText().contains(text.toLowerCase()))
            {
                filteredList.add(item);
            }
        }
      sportAdapter.filterList(filteredList);
    }
}