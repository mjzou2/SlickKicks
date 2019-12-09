package com.example.slickkicks;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    private Shoe[] shoes;
    OptionsActivity mo = new OptionsActivity();
    FOptionsActivity fo = new FOptionsActivity();
    GenderActivity genderActivity = new GenderActivity();
//    TextView textView = findViewById(R.id.textView);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        initShoeDatabase();
        //search();
        displayShoes();
//        initShoeDatabase();


    }
    public void displayShoes() {
        LinearLayout list = findViewById(R.id.list);
        for(Shoe shoe: shoes) {
            View shoeChunk = getLayoutInflater().inflate(R.layout.chunk_shoe, list, false);
            TextView brand = shoeChunk.findViewById(R.id.shoeBrand);
            brand.setText(shoe.getBrand());
            TextView name = shoeChunk.findViewById(R.id.shoeName);
            name.setText(shoe.getName());
            TextView price = shoeChunk.findViewById(R.id.shoePrice);
            price.setText("$" + Integer.toString(shoe.getPrice()));
            list.addView(shoeChunk);
            ImageView image = shoeChunk.findViewById(R.id.shoeImage);
            Drawable item = getResources().getDrawable(shoe.getImageID());
            image.setImageDrawable(item);
        }

    }
    public void initShoeDatabase() {
        shoes = new Shoe[]{
                new Shoe("Adidas", "Stan Smith", 80, "Male", "https://www.adidas.com/us/stan-smith-shoes/M20324.html", R.drawable.male_stan_smith),
                new Shoe("Adidas", "Ultraboost 20", 180, "Male", "https://www.adidas.com/us/ultraboost-20-shoes/EF1043.html", R.drawable.male_ultraboost_20),
                new Shoe("Adidas", "NMD_R1", 130, "Male", "https://www.adidas.com/us/nmd_r1-shoes/B42200.html", R.drawable.male_nmd_r1),
                new Shoe("Adidas", "Superstar", 80, "Male", "https://www.adidas.com/us/superstar-shoes/C77124.html", R.drawable.male_superstar),
                new Shoe("Adidas", "Nite Jogger", 130, "Male", "https://www.adidas.com/us/nite-jogger-shoes/F34124.html", R.drawable.male_nite_jogger),
                new Shoe("Adidas", "AlphaEdge 4D", 300, "Male", "https://www.adidas.com/us/alphaedge-4dshoes/EF3453.html", R.drawable.male_alphaedge_4d),
                new Shoe("Adidas", "Ozweego", 110, "Male", "https://www.adidas.com/us/ozweego-shoes/EE6465.html", R.drawable.male_ozweego),
                new Shoe("Adidas", "ZX 4000 4D", 350, "Male", "https://www.adidas.com/us/zx-4000-4d-shoes/BD7927.html", R.drawable.male_zx_4000_4d),
                new Shoe("Adidas", "Samba Classic", 70, "Male", "https://www.adidas.com/us/samba-classic/034563.html", R.drawable.male_samba_classic),
                new Shoe("Adidas", "Continental 80", 80, "Male", "https://www.adidas.com/us/continental-80-shoes/G27706.html", R.drawable.male_continental_80),
                new Shoe("Adidas", "Gazelle", 80, "Male", "https://www.adidas.com/us/gazelle-shoes/B41645.html", R.drawable.male_gazelle),
                new Shoe("Adidas", "Alphaboost", 120, "Male", "https://www.adidas.com/us/alphaboost-shoes/G54128.html", R.drawable.male_alphaboost),
                new Shoe("Adidas", "Grand Court", 65, "Male", "https://www.adidas.com/us/grand-court-shoes/EE7891.html", R.drawable.male_grand_court),

                new Shoe("Adidas", "Stan Smith", 80, "Female", "https://www.adidas.com/us/stan-smith-shoes/B24105.html", R.drawable.female_stan_smith),
                new Shoe("Adidas", "NMD_R1", 130, "Female", "https://www.adidas.com/us/nmd_r1-shoes/EE5173.html", R.drawable.female_nmd_r1),
                new Shoe("Adidas", "Ozweego TR", 110, "Female", "https://www.adidas.com/us/ozweego-tr-shoes/EE7001.html", R.drawable.female_ozweego_tr),
                new Shoe("Adidas", "Continental 80", 80, "Female", "https://www.adidas.com/us/continental-80-shoes/G27706.html", R.drawable.female_continental_80),
                new Shoe("Adidas", "U_Path Run", 85, "Female", "https://www.adidas.com/us/u_path-run-shoes/EE7161.html", R.drawable.female_u_path_run),
                new Shoe("Adidas", "Superstar", 80, "Female", "https://www.adidas.com/us/superstar-shoes/C77124.html", R.drawable.female_superstar),
                new Shoe("Adidas", "Nite Jogger", 130, "Female", "https://www.adidas.com/us/nite-jogger-shoes/EE6254.html", R.drawable.female_nite_jogger),
                new Shoe("Adidas", "Falcon", 100, "Female", "https://www.adidas.com/us/falcon-shoes/EE8838.html", R.drawable.female_falcon),
                new Shoe("Adidas", "Swift Run", 85, "Female", "https://www.adidas.com/us/swift-run-shoes/AQ0866.html", R.drawable.female_swift_run),
                new Shoe("Adidas", "Gazelle", 80, "Female", "https://www.adidas.com/us/gazelle-shoes/BB5476.html", R.drawable.female_gazelle),
                new Shoe("Adidas", "Ultraboost 20", 180, "Female", "https://www.adidas.com/us/ultraboost-20-shoes/EG1341.html", R.drawable.female_ultraboost_20),
                new Shoe("Adidas", "Cloudfoam Pure", 70, "Female", "https://www.adidas.com/us/cloudfoam-pure-shoes/EE8078.html", R.drawable.female_cloudfoam_pure),
                new Shoe("Adidas", "Ultraboost 19", 180, "Female", "https://www.adidas.com/us/ultraboost-19-shoes/G27495.html", R.drawable.female_ultraboost_19),
                new Shoe("Adidas", "Edge Lux 3", 85, "Female", "https://www.adidas.com/us/edge-lux-3-shoes/EE8998.html", R.drawable.female_edge_lux_3),
                new Shoe("Adidas", "Grand Court", 65, "Female", "https://www.adidas.com/us/grand-court-shoes/EE8172.html", R.drawable.female_grand_court),

                new Shoe("Nike", "Air VaporMax Plus", 190, "Male", "https://www.nike.com/t/air-vapormax-plus-mens-shoe-w4xgr4/924453-007", R.drawable.male_air_vapormax_plus),
                new Shoe("Nike", "Air VaporMax Flyknit 3", 190, "Male", "https://www.nike.com/t/air-vapormax-flyknit-3-mens-shoe-JsWsB7/AJ6900-002", R.drawable.male_air_vapormax_flyknit_3),
                new Shoe("Nike", "Air Max 270 React", 150, "Male", "https://www.nike.com/t/air-max-270-react-mens-shoe-bZ8t5l/AO4971-600", R.drawable.male_air_max_270_react),
                new Shoe("Nike", "Air Max 270 Bowfin", 160, "Male", "https://www.nike.com/t/air-max-270-bowfin-mens-shoe-6fGVhP/AJ7200-007", R.drawable.male_air_max_270_bowfin),
                new Shoe("Nike", "Air Max 270", 150, "Male", "https://www.nike.com/t/air-max-270-mens-shoe-Ct6KhM/AH8050-002", R.drawable.male_air_max_270),
                new Shoe("Nike", "Air Max 720", 180, "Male", "https://www.nike.com/t/air-max-720-mens-shoe-Nz7NKG/AO2924-406", R.drawable.male_air_max_720),
                new Shoe("Nike", "Killshot 2 Leather", 90, "Male", "https://www.nike.com/t/killshot-2-leather-mens-shoe-zrq1wk/432997-107", R.drawable.male_killshot_2_leather),
                new Shoe("Nike", "Air Force One '07", 90, "Male", "https://www.nike.com/t/air-force-1-07-mens-shoe-JkTGzADv/315122-001", R.drawable.male_air_force_1_07),
                new Shoe("Nike", "Air Jordan 1 Retro High OG", 160, "Male", "https://www.nike.com/t/air-jordan-1-retro-high-og-shoe-rHJ8kn/555088-062", R.drawable.male_air_jordan_1_retro_high_og),
                new Shoe("Nike", "Air Zoom Pegasus 36", 120, "Male", "https://www.nike.com/t/air-zoom-pegasus-36-mens-running-shoe-D24Mcz/AQ2203-002", R.drawable.male_air_zoom_pegasus_36),
                new Shoe("Nike", "Joyride Run Flyknit", 180, "Male", "https://www.nike.com/t/joyride-run-flyknit-mens-running-shoe-PjmR5M/AQ2730-004", R.drawable.male_joyride_run_flyknit),

                new Shoe("Nike", "Zoom Pegasus Turbo 2", 180, "Female", "https://www.nike.com/t/zoom-pegasus-turbo-2-womens-running-shoe-lBb48K/CU4873-600", R.drawable.female_zoom_pegasus_turbo_2),
                new Shoe("Nike", "Air Force 1 Shadow", 110, "Female", "https://www.nike.com/t/air-force-1-shadow-womens-shoe-zmjRFw/CI0919-100", R.drawable.female_air_force_1_shadow),
                new Shoe("Nike", "Air Max 270 React", 150, "Female", "https://www.nike.com/t/air-max-270-react-womens-shoe-6KXPPH/AT6174-102", R.drawable.female_air_max_270_react),
                new Shoe("Nike", "Air Max Dia", 110, "Female", "https://www.nike.com/t/air-max-dia-shoe-7Vf0Hb/AQ4312-201", R.drawable.female_air_max_dia),
                new Shoe("Nike", "Air VaporMax Flyknit 3", 190, "Female", "https://www.nike.com/t/air-vapormax-flyknit-3-womens-shoe-QwH0qQ/AJ6910-200", R.drawable.female_air_vapormax_flyknit_3),
                new Shoe("Nike", "Air Max 720", 180, "Female", "https://www.nike.com/t/air-max-720-womens-shoe-L64RdZ/AR9293-100", R.drawable.female_air_max_720),
                new Shoe("Nike", "Air Max 270", 150, "Female", "https://www.nike.com/t/air-max-270-womens-shoe-moTBdq1A/AH6789-065", R.drawable.female_air_max_270),
                new Shoe("Nike", "Roshe One", 75, "Female", "https://www.nike.com/t/roshe-one-womens-shoe-ol9k1O/844994-002", R.drawable.female_roshe_one),
                new Shoe("Nike", "Air Zoom Pegasus 36", 120, "Female", "https://www.nike.com/t/air-zoom-pegasus-36-womens-running-shoe-ksw5Hx/AQ2210-002", R.drawable.female_air_zoom_pegasus_36),
                new Shoe("Nike", "Tanjun", 65, "Female", "https://www.nike.com/t/tanjun-womens-shoe-ZwTJEKnB/812655-010", R.drawable.female_tanjun),
                new Shoe("Nike", "Metcon 5", 130, "Female", "https://www.nike.com/t/metcon-5-womens-training-shoe-2xvQ6H/AO2982-061", R.drawable.female_metcon_5),
                new Shoe("Nike", "Revolution 5 Icon Clash", 65, "Female", "https://www.nike.com/t/revolution-5-icon-clash-womens-running-shoe-3Ps3LG/BQ3207-003", R.drawable.female_revolution_5_icon_clash),

                new Shoe("Under Armour", "HOVR Phantom Connected", 140, "Male", "https://www.underarmour.com/en-us/mens-ua-hovr-phantom-running-shoes/pid3000004-010", R.drawable.male_hovr_phantom_connected),
                new Shoe("Under Armour", "Project Rock 2", 140, "Male", "https://www.underarmour.com/en-us/ua-project-rock-2/pid3022024-402", R.drawable.male_project_rock_2),
                new Shoe("Under Armour", "Phantom/SE", 140, "Male", "https://www.underarmour.com/en-us/mens-ua-hovr-phantom-se-running-shoes/pid3021587-303", R.drawable.male_hovr_phantom_se),
                new Shoe("Under Armour", "HOVR Sonic 2", 100, "Male", "https://www.underarmour.com/en-us/ua-hovr-sonic-2-nc/pid3021586-301", R.drawable.male_hovr_sonic_2),
                new Shoe("Under Armour", "HOVR Infinite", 120, "Male", "https://www.underarmour.com/en-us/mens-ua-hovr-infinite-running-shoes/pid3021395-005", R.drawable.male_hovr_infinite),
                new Shoe("Under Armour", "HOVR SLK EVO", 110, "Male", "https://www.underarmour.com/en-us/mens-ua-hovr-slk-evo-sportstyle-shoes/pid3021457-003", R.drawable.male_hovr_slk_evo),
                new Shoe("Under Armour", "Street Encounter IV", 60, "Male", "https://www.underarmour.com/en-us/mens-ua-street-encounter-iv-shoes/pid3000029-201", R.drawable.male_street_encounter_iv),
                new Shoe("Under Armour", "HOVR Guardian", 120, "Male", "https://www.underarmour.com/en-us/ua-hovr-guardian-ct/pid3021226-105", R.drawable.male_hovr_guardian),
                new Shoe("Under Armour", "Threadborne Slingwrap", 100, "Male", "https://www.underarmour.com/en-us/mens-ua-threadborne-slingwrap-sportstyle-shoes/pid1295724-002", R.drawable.male_threadborne_slingwrap),
                new Shoe("Under Armour", "HOVR Infinite Camo", 120, "Male", "https://www.underarmour.com/en-us/ua-hovr-infinite-camo/pid3022502-100", R.drawable.male_hovr_infinite_camo),
                new Shoe("Under Armour", "HOVR Phantom Project Rock", 150, "Male", "https://www.underarmour.com/en-us/mens-ua-hovr-phantom-project-rock-running-shoes/pid3022541-001", R.drawable.male_hovr_phantom_project_rock),
                new Shoe("Under Armour", "Charged Rogue", 80, "Male", "https://www.underarmour.com/en-us/ua-charged-rogue/pcid3021225-100", R.drawable.male_charged_rogue),
                new Shoe("Under Armour", "Micro G Pursuit", 70, "Male", "https://www.underarmour.com/en-us/mens-ua-micro-g-pursuit-running-shoes/pcid3000011-402", R.drawable.male_micro_g_pursuit),
                new Shoe("Under Armour", "Horizon RTT", 110, "Male", "https://www.underarmour.com/en-us/mens-ua-horizon-rtt-trail-running-shoes/pcid1287337-003", R.drawable.male_horizon_rtt),

                new Shoe("Under Armour", "Breathe Lace", 80, "Female", "https://www.underarmour.com/en-us/ua-w-breathe-lace/pid3019973-105", R.drawable.female_breathe_lace),
                new Shoe("Under Armour", "HOVR Phantom Connected", 140, "Female", "https://www.underarmour.com/en-us/womens-ua-hovr-phantom-running-shoes/pid3000093-105", R.drawable.female_hovr_phantom_connected),
                new Shoe("Under Armour", "HOVR Sonic 2", 100, "Female", "https://www.underarmour.com/en-us/ua-w-hovr-sonic-2-nc/pid3021588-400", R.drawable.female_hovr_sonic_2),
                new Shoe("Under Armour", "HOVR Infinite", 120, "Female", "https://www.underarmour.com/en-us/womens-ua-hovr-infinite-running-shoes/pid3021396-300", R.drawable.female_hovr_infinite),
                new Shoe("Under Armour", "HOVR Phantom/SE", 140, "Female", "https://www.underarmour.com/en-us/womens-ua-hovr-phantom-se-running-shoes/pid3021589-601", R.drawable.female_hovr_phantom_se),
                new Shoe("Under Armour", "Charged Bandit 3", 80, "Female", "https://www.underarmour.com/en-us/ua-w-charged-bandit-3/pid1298664-003",R.drawable.female_charged_bandit_3),
                new Shoe("Under Armour", "HOVR SLK EVO", 110, "Female", "https://www.underarmour.com/en-us/womens-ua-hovr-slk-evo-sportstyle-shoes/pid3021461-102", R.drawable.female_hovr_slk_evo),
                new Shoe("Under Armour", "HOVR Guardian", 120, "Female", "https://www.underarmour.com/en-us/ua-w-hovr-guardian-ct/pid3021243-104", R.drawable.female_hovr_guardian),
                new Shoe("Under Armour", "HOVR Infinite Camo", 120, "Female", "https://www.underarmour.com/en-us/ua-w-hovr-infinite-camo/pid3022503-100", R.drawable.female_hovr_infinite_camo),
        };
    }

    public void search() {
        int num = 0;
        if (genderActivity.getmaleClicked()) {
            for (int i = 0; i < shoes.length; i++) {
                if (shoes[i].getGender() == "Female") {
                    shoes[i] = null;
                } else{
                    if (mo.getU() == false && shoes[i].getBrand() == "Under Armour") {
                        shoes[i] = null;
                    }
                    if (mo.getA() == false && shoes[i].getBrand() == "Adidas") {
                        shoes[i] = null;
                    }
                    if (mo.getN() == false && shoes[i].getBrand() == "Nike") {
                        shoes[i] = null;
                    }
                    if (mo.getPrice() < shoes[i].getPrice()) {
                        shoes[i] = null;
                    }
                }
            }
        }
        if (genderActivity.getfemaleClicked()) {
            for (int i = 0; i < shoes.length; i++) {
                if (shoes[i].getGender() == "Male") {
                    shoes[i] = null;
                } else{
                    if (fo.getU() == false && shoes[i].getBrand() == "Under Armour") {
                        shoes[i] = null;
                    }
                    if (fo.getA() == false && shoes[i].getBrand() == "Adidas") {
                        shoes[i] = null;
                    }
                    if (fo.getN() == false && shoes[i].getBrand() == "Nike") {
                        shoes[i] = null;
                    }
                    if (fo.getPrice() < shoes[i].getPrice()) {
                        shoes[i] = null;
                    }
                }
            }
        }
    }
}
