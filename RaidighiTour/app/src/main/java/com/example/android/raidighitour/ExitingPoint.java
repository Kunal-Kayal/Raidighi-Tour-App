package com.example.android.raidighitour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class ExitingPoint extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exiting_point);


        drawerLayout =(DrawerLayout)findViewById(R.id.activity_exiting_point);
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

        final List<Word> exiting_point=new ArrayList<>();
        exiting_point.add(new Word(getString(R.string.diamond_habour_description),R.drawable.diamondharbour));
        exiting_point.add(new Word(getString(R.string.kolkatacity_description),R.drawable.kolkata_images));
        exiting_point.add(new Word(getString(R.string.kakdwip_city_description),R.drawable.kakdwip));
        exiting_point.add(new Word(getString(R.string.sundarbon_description),R.drawable.sundarban));
        exiting_point.add(new Word(getString(R.string.empty_descrption),R.drawable.endsign));

        ArrayAdapter<Word> aa= new WordAdapter(ExitingPoint.this,exiting_point);
        ListView listView=(ListView)this.findViewById(R.id.exiting_point_list);
        listView.setAdapter(aa);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item))return  true;
        return super.onOptionsItemSelected(item);
    }
}