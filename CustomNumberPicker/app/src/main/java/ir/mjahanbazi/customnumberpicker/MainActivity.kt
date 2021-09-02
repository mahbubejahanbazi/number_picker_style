package ir.mjahanbazi.customnumberpicker

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
