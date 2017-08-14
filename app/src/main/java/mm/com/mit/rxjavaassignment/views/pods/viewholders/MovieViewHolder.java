package mm.com.mit.rxjavaassignment.views.pods.viewholders;

import android.graphics.Bitmap;
import android.support.v7.graphics.Palette;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

import butterknife.BindView;
import butterknife.ButterKnife;
import mm.com.mit.rxjavaassignment.R;
import mm.com.mit.rxjavaassignment.data.vos.MovieVO;

/**
 * Created by MIT on 8/14/2017.
 */

public class MovieViewHolder extends BaseViewHolder<MovieVO>  implements Palette.PaletteAsyncListener {

    @BindView(R.id.txt_movie_title)
    TextView movieTitle;

    @BindView(R.id.iv_poster)
    ImageView ivPoster;


    public MovieViewHolder(View itemView) {

        super(itemView);
        ButterKnife.bind(this, itemView);

    }

    @Override
    public void bind(MovieVO data) {

        movieTitle.setText(data.getTitle());
        Glide.with(ivPoster.getContext())
                .load(data.getPosterPath())
                .asBitmap()
                .centerCrop()
                .placeholder(R.drawable.place_holder_movie_maniac)
                .error(R.drawable.place_holder_movie_maniac)
                .into(new BitmapImageViewTarget(ivPoster) {
                    @Override
                    public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                        super.onResourceReady(resource, glideAnimation);
                        Palette.from(resource).generate(MovieViewHolder.this);
                    }
                });
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onGenerated(Palette palette) {
        if (palette != null) {

            final Palette.Swatch darkVibrantSwatch = palette.getDarkVibrantSwatch();
            final Palette.Swatch darkMutedSwatch = palette.getDarkMutedSwatch();
            final Palette.Swatch lightVibrantSwatch = palette.getLightVibrantSwatch();
            final Palette.Swatch lightMutedSwatch = palette.getLightMutedSwatch();

            //-- start here.
            final Palette.Swatch vibrantSwatch = palette.getVibrantSwatch();

            final Palette.Swatch colorDarkVaient = (darkVibrantSwatch != null)
                    ? darkVibrantSwatch : darkMutedSwatch;

            final Palette.Swatch colorLightVarient = (darkVibrantSwatch != null)
                    ? lightVibrantSwatch : lightMutedSwatch;

            //setPaletteForRootContainer(vibrantSwatch);
            //setPaletteforTitle(colorDarkVaient, colorLightVarient);
            //setVibrantColor(vibrantSwatch);
        }
    }
}
