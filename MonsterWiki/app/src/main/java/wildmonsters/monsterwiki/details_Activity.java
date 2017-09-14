package wildmonsters.monsterwiki;


import android.graphics.Typeface;
import android.support.v7.app.ActionBar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import static wildmonsters.monsterwiki.R.id.elementMonster;
import static wildmonsters.monsterwiki.R.id.monsterSpec;


public class details_Activity extends AppCompatActivity {

    Intent intent;
    TextView nomMonstre;
    TextView evolutionMonstre;
    TextView elementMonstre;
    TextView monstreSpec;
    TextView monstreEvolution;
    ImageView imageMonsterMain;

    ImageView imageElement;
    TextView lifeMonstre;
    TextView powerMonstre;
    TextView speedMonstre;
    TextView staminaMonstre;
    ImageView monstreEvolution0;
    ImageView monstreEvolution1;
    ImageView monstreEvolution2;
    ImageView monstreEvolution3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);

        //Customize the ActionBar
        final ActionBar abar = getSupportActionBar();

        View viewActionBar = getLayoutInflater().inflate(R.layout.action_bar, null);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(//Center the textview in the ActionBar !
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.MATCH_PARENT,
                Gravity.CENTER);
        TextView titleActionBar = (TextView) viewActionBar.findViewById(R.id.action_bar_title);
        titleActionBar.setText("THE MONSTER");
        Typeface police = Typeface.createFromAsset(getAssets(),"fonts/Curse_Casual.ttf");
        titleActionBar.setTypeface(police);
        abar.setCustomView(viewActionBar, params);
        abar.setDisplayShowCustomEnabled(true);
        abar.setDisplayShowTitleEnabled(false);
        abar.setDisplayHomeAsUpEnabled(true);
        abar.setHomeButtonEnabled(true);

        ImageButton homebutton = (ImageButton) findViewById(R.id.homeButton);

        int monsterID;
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            monsterID = bundle.getInt("monsterID");
        } else {
            monsterID = 0;
        }

        nomMonstre = (TextView) findViewById(R.id.monsterName);

        evolutionMonstre= (TextView) findViewById(R.id.monsterEvolution);
        imageMonsterMain= (ImageView) findViewById(R.id.imageMonsterMain);

        evolutionMonstre = (TextView) findViewById(R.id.monsterEvolution);
        elementMonstre = (TextView) findViewById(R.id.elementMonster);
        monstreSpec = (TextView) findViewById(R.id.monsterSpec);
        monstreEvolution = (TextView) findViewById(R.id.monsterEvol);
        imageMonsterMain = (ImageView) findViewById(R.id.imageMonsterMain);
        imageElement = (ImageView) findViewById(R.id.imageElementMonster);
        lifeMonstre = (TextView) findViewById(R.id.lifeLvl);
        powerMonstre = (TextView) findViewById(R.id.powerLvl);
        speedMonstre = (TextView) findViewById(R.id.speedLvl);
        staminaMonstre = (TextView) findViewById(R.id.staminaLvl);
        monstreEvolution0 = (ImageView) findViewById(R.id.monsterEvolZero);
        monstreEvolution1 = (ImageView) findViewById(R.id.monsterEvolUn);
        monstreEvolution2 = (ImageView) findViewById(R.id.monsterEvolDeux);
        monstreEvolution3 = (ImageView) findViewById(R.id.monsterEvolTrois);


        Typeface police4 = Typeface.createFromAsset(getAssets(),"fonts/UnZialish.ttf");
        nomMonstre.setTypeface(police4);
        Typeface police2 = Typeface.createFromAsset(getAssets(),"fonts/Curse_Casual.ttf");
        evolutionMonstre.setTypeface(police2);
        elementMonstre.setTypeface(police2);
        monstreSpec.setTypeface(police2);
        monstreEvolution.setTypeface(police2);


        if (monsterID == 0) {
            nomMonstre.setText("Fire Lion");
            evolutionMonstre.setText("Niveau 1");

            elementMonstre.setText("Element");

            imageMonsterMain.setImageDrawable(getResources().getDrawable(R.drawable.fire_lion_1));
            imageElement.setImageDrawable(getResources().getDrawable(R.drawable.fire));
            lifeMonstre.setText("242");
            powerMonstre.setText("81");
            speedMonstre.setText("192");
            staminaMonstre.setText("100");
            monstreEvolution0.setImageDrawable(getResources().getDrawable(R.drawable.fire_lion_0));
            monstreEvolution1.setImageDrawable(getResources().getDrawable(R.drawable.fire_lion_1));
            monstreEvolution2.setImageDrawable(getResources().getDrawable(R.drawable.fire_lion_2));
            monstreEvolution3.setImageDrawable(getResources().getDrawable(R.drawable.fire_lion_3));

        }

        if (monsterID == 1) {
            nomMonstre.setText("Arch Knight");
            evolutionMonstre.setText("Niveau 1");
            imageMonsterMain.setImageDrawable(getResources().getDrawable(R.drawable.arch_knight_1));
            imageElement.setImageDrawable(getResources().getDrawable(R.drawable.legend));
            lifeMonstre.setText("364");
            powerMonstre.setText("145");
            speedMonstre.setText("360");
            staminaMonstre.setText("140");
            monstreEvolution0.setImageDrawable(getResources().getDrawable(R.drawable.arch_knight_0));
            monstreEvolution1.setImageDrawable(getResources().getDrawable(R.drawable.arch_knight_1));
            monstreEvolution2.setImageDrawable(getResources().getDrawable(R.drawable.arch_knight_2));
            monstreEvolution3.setImageDrawable(getResources().getDrawable(R.drawable.arch_knight_3));
        }

        if (monsterID == 2) {
            nomMonstre.setText("Genie");
            evolutionMonstre.setText("Niveau 1");
            imageMonsterMain.setImageDrawable(getResources().getDrawable(R.drawable.genie_1));
            imageElement.setImageDrawable(getResources().getDrawable(R.drawable.magic));
            lifeMonstre.setText("247");
            powerMonstre.setText("93");
            speedMonstre.setText("325");
            staminaMonstre.setText("100");
            monstreEvolution0.setImageDrawable(getResources().getDrawable(R.drawable.genie_0));
            monstreEvolution1.setImageDrawable(getResources().getDrawable(R.drawable.genie_1));
            monstreEvolution2.setImageDrawable(getResources().getDrawable(R.drawable.genie_2));
            monstreEvolution3.setImageDrawable(getResources().getDrawable(R.drawable.genie_3));
        }

        if (monsterID == 3) {
            nomMonstre.setText("Light Spirit");
            evolutionMonstre.setText("Niveau 1");
            imageMonsterMain.setImageDrawable(getResources().getDrawable(R.drawable.light_spirit_1));
            imageElement.setImageDrawable(getResources().getDrawable(R.drawable.light));
            lifeMonstre.setText("227");
            powerMonstre.setText("132");
            speedMonstre.setText("227");
            staminaMonstre.setText("100");
            monstreEvolution0.setImageDrawable(getResources().getDrawable(R.drawable.light_spirit_0));
            monstreEvolution1.setImageDrawable(getResources().getDrawable(R.drawable.light_spirit_1));
            monstreEvolution2.setImageDrawable(getResources().getDrawable(R.drawable.light_spirit_2));
            monstreEvolution3.setImageDrawable(getResources().getDrawable(R.drawable.light_spirit_3));

        }

        if (monsterID == 4) {
            nomMonstre.setText("Metalsaur");
            evolutionMonstre.setText("Niveau 1");
            imageMonsterMain.setImageDrawable(getResources().getDrawable(R.drawable.metalsaur_1));
            imageElement.setImageDrawable(getResources().getDrawable(R.drawable.metal));
            lifeMonstre.setText("227");
            powerMonstre.setText("132");
            speedMonstre.setText("227");
            staminaMonstre.setText("100");
            monstreEvolution0.setImageDrawable(getResources().getDrawable(R.drawable.metalsaur_0));
            monstreEvolution1.setImageDrawable(getResources().getDrawable(R.drawable.metalsaur_1));
            monstreEvolution2.setImageDrawable(getResources().getDrawable(R.drawable.metalsaur_2));
            monstreEvolution3.setImageDrawable(getResources().getDrawable(R.drawable.metalsaur_3));


        }

        if (monsterID == 5) {
            nomMonstre.setText("Panda");
            evolutionMonstre.setText("Niveau 1");
            imageMonsterMain.setImageDrawable(getResources().getDrawable(R.drawable.panda_1));
            imageElement.setImageDrawable(getResources().getDrawable(R.drawable.nature));
            lifeMonstre.setText("247");
            powerMonstre.setText("104");
            speedMonstre.setText("260");
            staminaMonstre.setText("100");
            monstreEvolution0.setImageDrawable(getResources().getDrawable(R.drawable.panda_0));
            monstreEvolution1.setImageDrawable(getResources().getDrawable(R.drawable.panda_1));
            monstreEvolution2.setImageDrawable(getResources().getDrawable(R.drawable.panda_2));
            monstreEvolution3.setImageDrawable(getResources().getDrawable(R.drawable.panda_3));


        }

        if (monsterID == 6) {
            nomMonstre.setText("Rockilla");
            evolutionMonstre.setText("Niveau 1");
            imageMonsterMain.setImageDrawable(getResources().getDrawable(R.drawable.rockilla_1));
            imageElement.setImageDrawable(getResources().getDrawable(R.drawable.earth));
            lifeMonstre.setText("227");
            powerMonstre.setText("132");
            speedMonstre.setText("227");
            staminaMonstre.setText("100");
            monstreEvolution0.setImageDrawable(getResources().getDrawable(R.drawable.rockilla_0));
            monstreEvolution1.setImageDrawable(getResources().getDrawable(R.drawable.rockilla_1));
            monstreEvolution2.setImageDrawable(getResources().getDrawable(R.drawable.rockilla_2));
            monstreEvolution3.setImageDrawable(getResources().getDrawable(R.drawable.rockilla_3));


        }

        if (monsterID == 7) {
            nomMonstre.setText("Thunder Eagle");
            evolutionMonstre.setText("Niveau 1");
            imageMonsterMain.setImageDrawable(getResources().getDrawable(R.drawable.thunder_eagle_1));
            imageElement.setImageDrawable(getResources().getDrawable(R.drawable.earth));
            lifeMonstre.setText("227");
            powerMonstre.setText("93");
            speedMonstre.setText("325");
            staminaMonstre.setText("100");
            monstreEvolution0.setImageDrawable(getResources().getDrawable(R.drawable.thunder_eagle_0));
            monstreEvolution1.setImageDrawable(getResources().getDrawable(R.drawable.thunder_eagle_1));
            monstreEvolution2.setImageDrawable(getResources().getDrawable(R.drawable.thunder_eagle_2));
            monstreEvolution3.setImageDrawable(getResources().getDrawable(R.drawable.thunder_eagle_3));


        }

        if (monsterID == 8) {
            nomMonstre.setText("Tyrannoling");
            evolutionMonstre.setText("Niveau 1");
            imageMonsterMain.setImageDrawable(getResources().getDrawable(R.drawable.tyrannoking_1));
            imageElement.setImageDrawable(getResources().getDrawable(R.drawable.dark));
            lifeMonstre.setText("299");
            powerMonstre.setText("93");
            speedMonstre.setText("227");
            staminaMonstre.setText("100");
            monstreEvolution0.setImageDrawable(getResources().getDrawable(R.drawable.tyrannoking_0));
            monstreEvolution1.setImageDrawable(getResources().getDrawable(R.drawable.tyrannoking_1));
            monstreEvolution2.setImageDrawable(getResources().getDrawable(R.drawable.tyrannoking_2));
            monstreEvolution3.setImageDrawable(getResources().getDrawable(R.drawable.tyrannoking_3));


        }

        if (monsterID == 9) {
            nomMonstre.setText("Turtle");
            evolutionMonstre.setText("Niveau 1");
            imageMonsterMain.setImageDrawable(getResources().getDrawable(R.drawable.turtle_1));
            imageElement.setImageDrawable(getResources().getDrawable(R.drawable.water));
            lifeMonstre.setText("260");
            powerMonstre.setText("104");
            speedMonstre.setText("260");
            staminaMonstre.setText("100");
            monstreEvolution0.setImageDrawable(getResources().getDrawable(R.drawable.turtle_0));
            monstreEvolution1.setImageDrawable(getResources().getDrawable(R.drawable.turtle_1));
            monstreEvolution2.setImageDrawable(getResources().getDrawable(R.drawable.turtle_2));
            monstreEvolution3.setImageDrawable(getResources().getDrawable(R.drawable.turtle_3));


        }

    }
}