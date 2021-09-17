# Set Style For NumberPicker with Kotlin
In this project, we prepare some NumberPicker with different styles. 
A custom NumberPicker with modification in :
- Divider color(can be transparent)
- Text color
- Text Size
- typeface 

## Tech Stack

Kotlin

<p align="center">
  <img src="https://github.com/mahbubejahanbazi/number_picker_style/blob/main/images/number_picker.jpg" />
</p>

## Source code
styles.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>

    <style name="number_picker_1" parent="@style/Theme.AppCompat">
        <item name="colorControlNormal">#00000000</item>
        <item name="android:fontFamily">@font/calibri_regular</item>
        <item name="android:textSize">35sp</item>
        <item name="android:textColorPrimary">#373030</item>
    </style>

    <style name="number_picker_2" parent="@style/Theme.AppCompat">
        <item name="colorControlNormal">#03A9F4</item>
        <item name="android:fontFamily">@font/quicksand_bold</item>
        <item name="android:textSize">20sp</item>
        <item name="android:textColorPrimary">#673AB7</item>
    </style>

    <style name="number_picker_3" parent="@style/Theme.AppCompat">
        <item name="colorControlNormal">#A1ABAF</item>
        <item name="android:fontFamily">@font/quicksand_light</item>
        <item name="android:textSize">15sp</item>
        <item name="android:textColorPrimary">#171519</item>
    </style>

    <style name="number_picker_4" parent="@style/Theme.AppCompat">
        <item name="colorControlNormal">#D39438</item>
        <item name="android:fontFamily">@font/calibri_regular</item>
        <item name="android:textSize">17sp</item>
        <item name="android:textColorPrimary">#452B05</item>
    </style>
</resources>
```
activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <GridLayout
            android:id="@+id/calc_grid"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_marginStart="3dp"
            android:layout_marginTop="2dp"
            android:layout_marginEnd="3dp"
            android:layout_marginBottom="3dp"
            android:background="#EEEEEE"
            android:columnCount="1"
            android:rowCount="3"
            android:useDefaultMargins="false"
            app:layout_constraintEnd_toStartOf="@id/calc_grid1"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintWidth_percent="0.5">

            <NumberPicker
                android:id="@+id/number_picker_1"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_row="0"
                android:layout_column="0"
                android:layout_margin="10dp"
                android:theme="@style/number_picker_1" />

            <View
                android:layout_width="match_parent"
                android:layout_height="6dp"
                android:layout_row="1"
                android:layout_column="0"
                android:background="@color/white" />

            <NumberPicker
                android:id="@+id/number_picker_2"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_row="2"
                android:layout_column="0"
                android:layout_margin="10dp"
                android:theme="@style/number_picker_2" />
        </GridLayout>

        <GridLayout
            android:id="@+id/calc_grid1"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_marginStart="3dp"
            android:layout_marginTop="2dp"
            android:layout_marginEnd="3dp"
            android:layout_marginBottom="3dp"
            android:background="#8D9098"
            android:columnCount="1"
            android:rowCount="3"
            android:useDefaultMargins="false"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toEndOf="@id/calc_grid"
            app:layout_constraintWidth_percent="0.5">

            <NumberPicker
                android:id="@+id/number_picker_3"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_row="0"
                android:layout_column="0"
                android:layout_margin="10dp"
                android:theme="@style/number_picker_3" />

            <View
                android:layout_width="match_parent"
                android:layout_height="6dp"
                android:layout_row="1"
                android:layout_column="0"
                android:background="@color/white" />

            <NumberPicker
                android:id="@+id/number_picker_4"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_row="2"
                android:layout_column="0"
                android:layout_margin="10dp"
                android:theme="@style/number_picker_4" />
        </GridLayout>
    </androidx.constraintlayout.widget.ConstraintLayout>
</ScrollView>
```

MainActivity.kt
```kotlin
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.NumberPicker

class MainActivity : AppCompatActivity() {
    lateinit var numberPicker_1: NumberPicker
    lateinit var numberPicker_2: NumberPicker
    lateinit var numberPicker_3: NumberPicker
    lateinit var numberPicker_4: NumberPicker
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberPicker_1 = findViewById(R.id.number_picker_1)
        numberPicker_2 = findViewById(R.id.number_picker_2)
        numberPicker_3 = findViewById(R.id.number_picker_3)
        numberPicker_4 = findViewById(R.id.number_picker_4)

        val data = arrayOfNulls<String>(20)
        for (i in 0..19) {
            data[i] = (4 + i).toString()
        }

        numberPicker_1.setMinValue(1)
        numberPicker_1.setMaxValue(data.size - 1)
        numberPicker_1.setDisplayedValues(data)
        numberPicker_1.setValue(1)
        numberPicker_1.setWrapSelectorWheel(true)

        numberPicker_2.setMinValue(1)
        numberPicker_2.setMaxValue(data.size - 1)
        numberPicker_2.setDisplayedValues(data)
        numberPicker_2.setValue(4)
        numberPicker_2.setWrapSelectorWheel(false)

        numberPicker_3.setMinValue(1)
        numberPicker_3.setMaxValue(data.size - 1)
        numberPicker_3.setDisplayedValues(data)
        numberPicker_3.setValue(6)
        numberPicker_3.setWrapSelectorWheel(true)

        numberPicker_4.setMinValue(1)
        numberPicker_4.setMaxValue(data.size - 1)
        numberPicker_4.setDisplayedValues(data)
        numberPicker_4.setValue(4)
        numberPicker_4.setWrapSelectorWheel(false)
    }
}
```

## Contact

mjahanbazi@protonmail.com