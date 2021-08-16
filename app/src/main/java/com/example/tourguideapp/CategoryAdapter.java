package com.example.tourguideapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Place} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context,@NonNull FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new HeritagesFragment();
        } else if(position == 1){
            return new MuseumsFragment();
        } else if(position == 2){
            return new TemplesFragment();
        }else if(position == 3){
            return new GardensFragment();
        }else if(position == 4){
            return new MarketsFragment();
        }else if(position == 5){
            return new HotelsFragment();
        }else if(position == 6){
            return new RestaurantsFragment();
        }else{
            return new EventsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 8;
    }


    @Override
    public CharSequence getPageTitle(int position){
        if(position == 0){
            return "Heritages";
        }else if(position == 1){
            return "Museums";
        }else if(position == 2){
            return "Temples";
        }else if(position == 3){
            return "Gardens";
        }else if(position == 4){
            return "Markets";
        }else if(position == 5){
            return "Hotels";
        }else if (position == 6){
            return "Restaurants";
        }else{
            return "Events";
        }
    }

}
