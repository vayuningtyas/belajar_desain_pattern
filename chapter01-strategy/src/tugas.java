// 1. Buat interface Strategy untuk mendefinisikan operasi matematika
interface Strategy {
    int execute(int a, int b);
}

// 2. Buat implementasi dari interface Strategy untuk setiap operasi matematika
class Addition implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

class Subtraction implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}

class Multiplication implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}

class Division implements Strategy {
    @Override
    public int execute(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
}

// 3. Buat kelas Context yang menggunakan strategi
class Calculator {
    private Strategy strategy;

    public Calculator(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
