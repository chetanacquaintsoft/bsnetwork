package com.acquaintsoft.bsnetworkroot;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.acquaintsoft.bsnetwork.Account;
import com.acquaintsoft.bsnetwork.PrivateKeyAccount;
import com.acquaintsoft.bsnetwork.Token;
import com.acquaintsoft.bsnetworkroot.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try  {

//         String seed = "health lazy lens fix dwarf salad breeze myself silly december endless rent faculty report beyond";
            String seed = PrivateKeyAccount.generateSeed();
            PrivateKeyAccount alice = PrivateKeyAccount.fromSeed(seed, 0, Account.TESTNET);
            // Retrieve its public key
//        byte[] publicKey = alice.getPublicKey();
            // and its address
            String address = alice.getAddress();
            Token t = new Token();
            t.token = address;
            t.seed = seed;
            Log.e("REsposne","Reposne = Token = "+t.token+"+==== SEED ==="+t.seed);

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
