package com.javiergarrido.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Javier G on 6/15/2014.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
