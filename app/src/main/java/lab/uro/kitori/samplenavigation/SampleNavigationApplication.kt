package lab.uro.kitori.samplenavigation

import android.app.Application
import timber.log.Timber

class SampleNavigationApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}
