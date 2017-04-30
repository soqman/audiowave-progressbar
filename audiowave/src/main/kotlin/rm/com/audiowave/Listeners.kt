package rm.com.audiowave

import android.view.View

/**
 * Created by alex
 */

interface OnSamplingListener {
  fun onComplete()
}

interface OnProgressListener {
  fun onStartTracking(progress: Float, view: View)
  fun onStopTracking(progress: Float)
  fun onProgressChanged(progress: Float, byUser: Boolean)
}