package rvt;

public class OverloadedCounter {
    
    private int value;

    // 1. konstruktors ar sākuma vērtību
    public OverloadedCounter(int startValue) {
        this.value = startValue;
    }

    // 2. konstruktors bez parametriem → sākas no 0
    public OverloadedCounter() {
        this(0);  // izsauc iepriekšējo konstruktoru
        // vai vienkārši: this.value = 0;
    }

    // Atgriež pašreizējo vērtību
    public int value() {
        return this.value;
    }

    // Palielina par 1
    public void increase() {
        this.value++;
        // vai: this.increase(1);
    }

    // Samazina par 1
    public void decrease() {
        this.value--;
        // vai: this.decrease(1);
    }

    // Palielina par padoto skaitu (ja skaitlis pozitīvs)
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;
        }
        // ja increaseBy ≤ 0 – nekas nenotiek
    }

    // Samazina par padoto skaitu (ja skaitlis pozitīvs)
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value -= decreaseBy;
        }
        // ja decreaseBy ≤ 0 – nekas nenotiek
    }
}