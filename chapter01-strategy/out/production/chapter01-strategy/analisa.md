'analisa program strategy' 

1.	Baris 1 - 9: Ini mendefinisikan sebuah interface Strategy yang memiliki satu metode execute yang  mengambil dua parameter bertipe integer dan mengembalikan nilai integer.
2.	Baris 11 - 16: Ini adalah implementasi dari interface Strategy untuk operasi penjumlahan. Metode execute di sini mengembalikan hasil penjumlahan dari dua bilangan yang diberikan.
3.	Baris 18 - 23: Ini adalah implementasi dari interface Strategy untuk operasi pengurangan. Metode execute di sini mengembalikan hasil pengurangan dari dua bilangan yang diberikan.
4.	Baris 25 - 30: Ini adalah implementasi dari interface Strategy untuk operasi perkalian. Metode execute di sini mengembalikan hasil perkalian dari dua bilangan yang diberikan.
5.	Baris 32 - 40: Ini adalah implementasi dari interface Strategy untuk operasi pembagian. Metode execute di sini mengembalikan hasil pembagian dari dua bilangan yang diberikan, dan melempar ArithmeticException jika mencoba untuk membagi dengan nol.
6.	Baris 43 - 50: Ini mendefinisikan kelas Calculator yang memiliki sebuah variabel privat bertipe Strategy dan sebuah konstruktor untuk menginisialisasi variabel tersebut. Ada juga metode executeStrategy untuk menjalankan strategi yang telah ditetapkan dan metode setStrategy untuk mengatur strategi baru.

'analisa program duck'

1. Deklarasi interface QuackBehavior untuk perilaku bersuara bebek.
2. Deklarasi interface FlyBehavior untuk perilaku terbang bebek.
3. Kelas Quack yang mengimplementasikan QuackBehavior dengan metode quack() yang mencetak "Qwek - Qwek".
4. Kelas Squeak yang mengimplementasikan QuackBehavior dengan metode quack() yang mencetak "Squeak".
5. Kelas MuteQuack yang mengimplementasikan QuackBehavior dengan metode quack() yang mencetak "Tidak Bisa Bersuara".
6. Kelas FlyWithWings yang mengimplementasikan FlyBehavior dengan metode fly() yang mencetak "Terbang".
7. Kelas FlyNoWay yang mengimplementasikan FlyBehavior dengan metode fly() yang mencetak "Tidak bisa terbang".
8. Kelas FlyWithRocketPower yang mengimplementasikan FlyBehavior dengan metode fly() yang mencetak "Cool, terbang menggunakan rocket".
9. Kelas abstrak Duck yang memiliki dua variabel instance: quackBehavior dan flyBehavior. Memiliki metode abstrak display(), serta metode swim(), performQuack(), performFly(), setFlyBehavior(), dan setQuackBehavior().
10. Kelas MallardDuck yang merupakan subkelas dari Duck. Konstruktor menginisialisasi perilaku bebek Mallard untuk bersuara "Qwek - Qwek" dan terbang menggunakan sayap.
11. Kelas RedheadDuck yang merupakan subkelas dari Duck. Konstruktor menginisialisasi perilaku bebek Redhead untuk bersuara "Qwek - Qwek" dan terbang menggunakan sayap.
12. Kelas RubberDuck yang merupakan subkelas dari Duck. Konstruktor menginisialisasi perilaku bebek Rubber untuk bersuara "Squeak" dan tidak bisa terbang.
13. Kelas WoodenDuck yang merupakan subkelas dari Duck. Konstruktor menginisialisasi perilaku bebek Wooden untuk bersuara "Qwek - Qwek" dan tidak bisa terbang.
14. Kelas ModelDuck yang merupakan subkelas dari Duck. Konstruktor menginisialisasi perilaku bebek Model untuk tidak bisa terbang dan bersuara "Qwek - Qwek".
15. Metode display() di setiap subkelas Duck memberikan implementasi spesifik tampilan untuk setiap jenis bebek.


