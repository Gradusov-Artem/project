public class polymorphism {
    public abstract class AbstractPhone { // создаем базовый класс
        private int year;

        public AbstractPhone(int year) {
            this.year = year;
        }
        public abstract void call(int outputNumber);
        public abstract void ring (int inputNumber);
    }

    public class ThomasEdisonPhone extends AbstractPhone { // создаем дочерний класс от базового класса

        public ThomasEdisonPhone(int year) {
            super(year);
        }
        @Override // переопределение метода call
        public void call(int outputNumber) {
            System.out.println("Вращайте ручку");
            System.out.println("Сообщите номер абонента, сэр");
        }

        @Override // переопределение метода ring
        public void ring(int inputNumber) {
            System.out.println("Телефон звонит");
        }
    }
}
