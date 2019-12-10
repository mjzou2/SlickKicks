package com.example.slickkicks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.ArrayList;

public class DisplayActivity extends AppCompatActivity {

    private Shoe[] shoes;
    private static String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        initShoeDatabase();
        removeFalses();
        displayShoes();
//        initShoeDatabase();
    }
    public void onBackPressed() {
        LinearLayout list = findViewById(R.id.list);
        list.removeAllViews();
        initShoeDatabase();
        if (GenderActivity.getMaleClicked()) {
            OptionsActivity.setU(false);
            OptionsActivity.setA(false);
            OptionsActivity.setN(false);
        }
        super.onBackPressed();
    }
    public void displayShoes() {
        LinearLayout list = findViewById(R.id.list);
        for(Shoe shoe : shoes) {
            if (shoe != null) {
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
                Intent intent = new Intent(this, ViewActivity.class);
                image.setOnClickListener(unused -> {
                            url = shoe.getUrl();
                            startActivity(intent);
                        }
                );
                name.setOnClickListener(unused -> {
                            url = shoe.getUrl();
                            startActivity(intent);
                        }
                );
                price.setOnClickListener(unused -> {
                            url = shoe.getUrl();
                            startActivity(intent);
                        }
                );
                brand.setOnClickListener(unused -> {
                            url = shoe.getUrl();
                            startActivity(intent);
                        }
                );
            }
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

                new Shoe("New Balance", "574 Core", 80, "Male", "https://www.newbalance.com/pd/574-core/ML574-EG.html?dwvar_ML574-EG_color=Grey", R.drawable.male_574_core),
                new Shoe("New Balance", "520", 60, "Male", "https://www.newbalance.com/pd/520/U520-UM.html?dwvar_U520-UM_color=Pigment_with_Nimbus%20Cloud", R.drawable.male_520),
                new Shoe("New Balance", "All Coasts 210", 60, "Male", "https://www.newbalance.com/pd/all-coasts-210/AM210V1-30242-M.html?dwvar_AM210V1-30242-M_color=Brown_with_White", R.drawable.male_all_coasts_210),
                new Shoe("New Balacne", "Pro Court 212" , 65, "Male", "https://www.newbalance.com/pd/pro-court-212/NM212V1-26425-M.html?dwvar_NM212V1-26425-M_color=Black_with_Yellow", R.drawable.male_pro_court_212),
                new Shoe ("New Balance", "RALAXA", 65, "Male","https://www.newbalance.com/pd/ralaxa/MARLX.html?dwvar_MARLX_color=Black_with_Orca_and_White", R.drawable.male_ralaxa),
                new Shoe ("New Balance", "All Coasts 331", 65, "Male", "https://www.newbalance.com/pd/all-coasts-331/AM331.html?dwvar_AM331_color=Cobalt%20Blue_with_White", R.drawable.male_all_coasts_331),
                new Shoe("New Balance", "Made in UK 991", 249, "Male","https://www.newbalance.com/pd/made-in-uk-991/ML991V1-27393-M.html?dwvar_ML991V1-27393-M_color=Burnt%20Orange_with_Silver_and_White", R.drawable.male_made_in_UK_991),
                new Shoe("New Balance", "NB1 997 Perforated Suede", 230, "Male", "https://www.newbalance.com/pd/nb1-997-perforated-suede/US997MP1-BLANK.html", R.drawable.male_nb1_997_perforated_suede),
                new Shoe("New Balance", "Made in UK 1500 LFC", 220, "Male", "https://www.newbalance.com/pd/made-in-uk-1500-lfc/ML1500V1-33719-M.html?dwvar_ML1500V1-33719-M_color=Black_with_Gold", R.drawable.male_made_in_UK_1500_LFC),
                new Shoe("New Blanace", "574 Sport", 70, "Male", "https://www.newbalance.com/pd/574-sport/MS574-V2SM.html?dwvar_MS574-V2SM_color=Pigment_with_White", R.drawable.male_574_sport),

                new Shoe("New Balance", "Womens 990v5 Made in US", 175, "Female", "https://www.newbalance.com/pd/womens-990v5-made-in-us/W990V5-21642-W.html?dwvar_W990V5-21642-W_color=Grey_with_Castlerock", R.drawable.female_womens_990_v5_mad_in_US),
                new Shoe("New Balance", "574", 90, "Female", "https://www.newbalance.com/pd/574/WL574V2-27306-W.html?dwvar_WL574V2-27306-W_color=Black_with_Metallic%20Gold", R.drawable.female_574),
                new Shoe("New Balance", "880v9", 125, "Female", "https://www.newbalance.com/pd/860v10/W860V10-26325-W.html?dwvar_W860V10-26325-W_color=Black_with_Gunmetal_and_Lead", R.drawable.female_880v9),
                new Shoe("New Balance", "608v5", 70, "Female", "https://www.newbalance.com/pd/608v5/WX608-V5.html?dwvar_WX608-V5_color=White_with_Light%20Blue", R.drawable.femal_608v5),
                new Shoe("New Balance", "Women's New Balance 577", 80, "Female", "https://www.newbalance.com/pd/womens-new-balance-577/WW577.html?dwvar_WW577_color=White", R.drawable.female_womens_new_balance_557),
                new Shoe ("New Balance", "FuelCore Nergize Mule", 65, "Female", "https://www.newbalance.com/pd/fuelcore-nergize-mule/WLNRMV1-25083-W.html?dwvar_WLNRMV1-25083-W_color=Castlerock_with_Oyster%20Pink_and_Magnet", R.drawable.female_fuelcore_nergize_mule),
                new Shoe("New Balance", "WRT300v2", 85, "Female","https://www.newbalance.com/pd/wrt300v2/WRT300V2-27502-W.html?dwvar_WRT300V2-27502-W_color=Sea%20Salt_with_Moonbeam", R.drawable.female_wrt300v2)
        };
    }
    public static String getTheUrl() {
        return url;
    }

    public void removeFalses() {
        if (GenderActivity.getMaleClicked()) {
            for (int i = 0; i < shoes.length; i++) {
                if (shoes[i].getGender().equals("Female")) {
                    shoes[i] = null;
                } else if (shoes[i].getPrice() > OptionsActivity.getPrice()) {
                    shoes[i] = null;
                } else if(!(OptionsActivity.getA()) && shoes[i].getBrand().equals("Adidas")) {
                    shoes[i] = null;
                } else if (!(OptionsActivity.getN()) && shoes[i].getBrand().equals("Nike")) {
                    shoes[i] = null;
                } else if (!(OptionsActivity.getU()) && shoes[i].getBrand().equals("Under Armour")) {
                    shoes[i] = null;
                }
            }
        } else {
            for (int i = 0; i < shoes.length; i++) {
                if (shoes[i].getGender().equals("Male")) {
                    shoes[i] = null;
                } else if (shoes[i].getPrice() > FOptionsActivity.getPrice()) {
                    shoes[i] = null;
                } else if(!(FOptionsActivity.getA()) && shoes[i].getBrand().equals("Adidas")) {
                    shoes[i] = null;
                } else if (!(FOptionsActivity.getN()) && shoes[i].getBrand().equals("Nike")) {
                    shoes[i] = null;
                } else if (!(FOptionsActivity.getU()) && shoes[i].getBrand().equals("Under Armour")) {
                    shoes[i] = null;
                }
            }
        }
    }
}