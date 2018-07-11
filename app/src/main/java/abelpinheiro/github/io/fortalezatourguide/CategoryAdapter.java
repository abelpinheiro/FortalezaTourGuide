package abelpinheiro.github.io.fortalezatourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import abelpinheiro.github.io.fortalezatourguide.Fragment.AttractionsFragment;
import abelpinheiro.github.io.fortalezatourguide.Fragment.BeachFragment;
import abelpinheiro.github.io.fortalezatourguide.Fragment.FoodFragment;
import abelpinheiro.github.io.fortalezatourguide.Fragment.ShoppingFragment;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new BeachFragment();
        }else if (position == 1){
            return new AttractionsFragment();
        }else if (position == 2){
            return new ShoppingFragment();
        }else{
            return new FoodFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.beach_title);
        }else if (position == 1){
            return mContext.getString(R.string.attractions_title);
        }else if (position == 2){
            return mContext.getString(R.string.shopping_title);
        }else{
            return mContext.getString(R.string.food_title);
        }
    }
}
