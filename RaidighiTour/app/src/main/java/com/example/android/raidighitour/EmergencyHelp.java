package com.example.android.raidighitour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

public class EmergencyHelp extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_help);

        drawerLayout =(DrawerLayout)findViewById(R.id.activity_emergency_help);
        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView=(NavigationView)findViewById(R.id.navigation);

        Intent home_acitivity= new Intent(this,MainActivity.class);
        Intent visiting_place_acitivity= new Intent(this,VisitingPlace.class);
        Intent eduaction_acitivity= new Intent(this,Education.class);
        Intent public_place_acitivity= new Intent(this,PublicPlace.class);
        Intent emergency_help_acitivity= new Intent(this,EmergencyHelp.class);
        Intent events_acitivity= new Intent(this,Events.class);
        Intent exiting_point_activity= new Intent(this,ExitingPoint.class);



        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id= item.getItemId();
                switch (id){
                    case R.id.home:
                        startActivity(home_acitivity);
                        break;
                    case R.id.visiting_place:
                        startActivity(visiting_place_acitivity);
                        break;
                    case R.id.education:
                        startActivity(eduaction_acitivity);
                        break;
                    case  R.id.emergency_help:
                        startActivity(emergency_help_acitivity);
                        break;
                    case R.id.events:
                        startActivity(events_acitivity);
                        break;
                    case R.id.exitng_point:
                        startActivity(exiting_point_activity);
                        break;
                    case R.id.public_place:
                        startActivity(public_place_acitivity);
                        break;
                    default:
                        return true;
                }

                return true;
            }
        });

        ImageView i1 = (ImageView)findViewById(R.id.hospital);
        i1.setOnClickListener(view -> {
            Intent i = new Intent(EmergencyHelp.this,RaidighiHospital.class);
            startActivity(i);
        });
        ImageView i2 = (ImageView)findViewById(R.id.image_police_station);
        i2.setOnClickListener(view -> {
            Intent i = new Intent(EmergencyHelp.this,PoliceStation.class);
            startActivity(i);
        });
        ImageView i3 = (ImageView)findViewById(R.id.image_post_office);
        i3.setOnClickListener(view -> {
            Intent i = new Intent(EmergencyHelp.this,PostOffice.class);
            startActivity(i);
        });
        ImageView i4 = (ImageView)findViewById(R.id.image_bdo);
        i4.setOnClickListener(view -> {
            Intent i = new Intent(EmergencyHelp.this,BDO.class);
            startActivity(i);
        });
        ImageView i5 = (ImageView)findViewById(R.id.image_gram_panchayet);
        i5.setOnClickListener(view -> {
            Intent i = new Intent(EmergencyHelp.this,GramPanchayet.class);
            startActivity(i);
        });
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item))return  true;
        return super.onOptionsItemSelected(item);
    }
}