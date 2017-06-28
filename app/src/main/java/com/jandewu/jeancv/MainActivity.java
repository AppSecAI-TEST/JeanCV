package com.jandewu.jeancv;

import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.jandewu.jeancv.Fragment.ContractFragment;
import com.jandewu.jeancv.Fragment.ExperienceFragment;
import com.jandewu.jeancv.Fragment.NotesFragment;
import com.jandewu.jeancv.Fragment.SkillsFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.container)
    LinearLayout container;

    @BindView(R.id.drawerLayout)
    DrawerLayout drawerLayout;

    @BindView(R.id.navigationView)
    NavigationView navigationView;

@BindView(R.id.snack_attached)
    CoordinatorLayout snack_attached;


    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        navigationView.getMenu().performIdentifierAction(R.id.menu_contact, 0);
    }

    @OnClick(R.id.Float_Button)
    public void onFabClicked (){
        Snackbar.make(snack_attached, "Test", Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        setupToolbar();
        navigationView.setNavigationItemSelectedListener(this);
        //showInfo();
    }

    @OnClick(R.id.Float_Button)
    public void showInfo(){
        Toast.makeText(this, "Informacja", Toast.LENGTH_SHORT).show();}


//    TERAZ BEZ CONTENERA
//        CvItem phoneItem = new CvItem(R.drawable.ic_phone_black_24dp, "997");
//        CvRow phoneRow = new CvRow(this, phoneItem);
//        container.addView(phoneRow);
//        phoneRow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                call();
//            }
//        });
//        CvItem mailItem = new CvItem(R.drawable.ic_mail_outline_black_24dp, "wartalski.jan@gmail.com");
//        CvRow mailRow = new CvRow(this, mailItem);
//        container.addView(mailRow);
//        mailRow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mail();
//            }
//        });
//        CvItem webItem = new CvItem(R.drawable.ic_language_black_24dp, "google.com");
//        CvRow webRow = new CvRow(this, webItem);
//        container.addView(webRow);
//        webRow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openWebSite();
//            }
//        });
//
//    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle adidas = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(adidas);
        adidas.syncState();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.options_info:
                //TODO new dialog
             showInfoDialog();
//                Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show();
//                break;
        }
        return super.onOptionsItemSelected(item);
    }
    private void showInfoDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle("COs")
                //.setIcon(imageId)
                .setMessage("sdfsdfsdfs")
                .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        builder.create().show();
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        toolbar.setTitle(item.getTitle());
        item.setChecked(true);
        openFragment(item);
        drawerLayout.closeDrawer(Gravity.LEFT);
        return false;
    }

    private void openFragment(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_contact:
                openFragment(ContractFragment.newInstance());
                break;
            case R.id.menu_experiance:
                openFragment(ExperienceFragment.newInstance());
                break;
            //TU trzeba dodac skills fragment
            case R.id.menu_skills:
                openFragment(SkillsFragment.newInstance());
                break;
            case R.id.menu_edu:
                openFragment(SkillsFragment.newInstance());
                break;
            case R.id.menu_hobby:
                openFragment(SkillsFragment.newInstance());
                break;
            case R.id.menu_notes:
                openFragment(NotesFragment.newInstance());
                break;
            default:
        }
    }

    private void openFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }





}
