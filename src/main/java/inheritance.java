public class inheritance {
    public abstract class AbstractPhone { // создание базового класса
        private int year;

        public AbstractPhone(int year) {
            this.year = year;
        }
        public abstract void call(int outputNumber);
        public abstract void ring (int inputNumber);
    }

    public abstract class WirelessPhone extends AbstractPhone { // создание дочернего класса от базового

        private int hour;

        public WirelessPhone(int year, int hour) {
            super(year);
            this.hour = hour;
        }
    }
}
