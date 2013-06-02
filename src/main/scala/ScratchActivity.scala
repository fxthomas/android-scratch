package com.scratch

import android.app.Activity
import android.os.Bundle

class ScratchActivity extends Activity with TypedActivity {
  override def onCreate(bundle: Bundle) {
    super.onCreate(bundle)
    setContentView(R.layout.main)
    findView(TR.textview).setText("hello, world!")
  }
}
