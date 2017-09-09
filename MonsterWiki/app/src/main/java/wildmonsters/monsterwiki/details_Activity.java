package wildmonsters.monsterwiki;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;


public class details_Activity extends AppCompatActivity {

    Intent intent;
    TextView nomMonstre;
    TextView evolutionMonstre;
    ImageView imageMonsterMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);

        int monsterID;
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null){
            monsterID = bundle.getInt("monsterID");
        }else{monsterID=0;}

        nomMonstre = (TextView) findViewById(R.id.monsterName);
        evolutionMonstre= (TextView) findViewById(R.id.monsterEvolution);
        imageMonsterMain= (ImageView) findViewById(R.id.imageMonsterMain);

        if (monsterID == 0) {
            nomMonstre.setText("Fire Lion");
            evolutionMonstre.setText("Niveau 1");


        }

    }


}




