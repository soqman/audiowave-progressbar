package rm.com.audiogram.holder;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import org.jetbrains.annotations.NotNull;

import butterknife.BindView;
import butterknife.ButterKnife;
import rm.com.audiogram.R;
import rm.com.audiogram.entity.Record;
import rm.com.audiowave.AudioWaveView;
import rm.com.audiowave.OnProgressListener;

/**
 * Created by alex
 */

public final class RecordHolder extends RecyclerView.ViewHolder {

  @BindView(R.id.audio_button_play) ImageView play;
  @BindView(R.id.audio_wave) AudioWaveView wave;

  public RecordHolder(View itemView) {
    super(itemView);
    ButterKnife.bind(this, itemView);
  }

  public final void bind(Record item) {
    wave.setScaledData(new byte[0]);
    wave.setProgress(0);
    wave.setRawData(item.raw);
    wave.setOnProgressListener(new OnProgressListener() {
      @Override
      public void onStartTracking(float progress,@NotNull View view) {
        Log.d("VIEW CHECK", String.valueOf(view.getId()));
      }

      @Override
      public void onStopTracking(float progress) {

      }

      @Override
      public void onProgressChanged(float progress, boolean byUser) {

      }
    });
  }
}
