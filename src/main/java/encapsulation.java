public class encapsulation {
    public class SomePhone { // создаем класс SomePhone

        private int year; // объявляем закрытые переменные
        private String company;
        public SomePhone(int year, String company) { // объявляем конструктор
            this.year = year;
            this.company = company;
        }
        private void openConnection(){ // создаем закрытый метод
            //findComutator
            //openNewConnection...
        }
        public void call() { // создаем открытый метод для взаимодействия с закрытым
            openConnection();
            System.out.println("Вызываю номер");
        }

        public void ring() { // создаем открытый метод
            System.out.println("Дзынь-дзынь");
        }

    }
}
