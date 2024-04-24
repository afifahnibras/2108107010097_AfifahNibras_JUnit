## Tugas JUnit ##
Nama : Afifah Nibras

NPM : 2108107010097

Penjelasan Test Case InstrumentedTest

1. Test Case untuk Penambahan (testAddition()):
   
- Test case ini menguji fungsi penambahan dalam kelas Calculator.
- Memanggil metode add(3, 5) dari kelas Calculator.
- Membandingkan hasilnya dengan nilai yang diharapkan, yaitu 8.

 2. Test Case untuk Pembagian (testDivision()):
- Test case ini menguji fungsi pembagian dalam kelas Calculator.
- Memanggil metode divide(10, 2) dari kelas Calculator.
- Membandingkan hasilnya dengan nilai yang diharapkan, yaitu 5.0.
- Parameter ketiga dalam assertEquals (0.0001) adalah jarak toleransi (delta) yang menangani ketidakpastian numerik. Ini memungkinkan perbedaan kecil antara nilai aktual dan nilai yang diharapkan karena pembulatan atau masalah presisi floating point.

Penjelasan Test Case LocalTest

1. Test Case untuk Penambahan (addition_isCorrect()):
- Test case ini menguji operasi penambahan.
- Memastikan bahwa hasil penjumlahan dari 2 + 2 adalah 4.

2. Test Case untuk Pengurangan (subtraction_isCorrect()):
- Test case ini menguji operasi pengurangan.
- Memastikan bahwa hasil pengurangan dari 4 - 2 adalah 2.

3. Test Case untuk Perkalian (multiplication_isCorrect()):
- Test case ini menguji operasi perkalian.
- Memastikan bahwa hasil perkalian dari 4 * 2 adalah 8.

4. Test Case untuk Pembagian (division_isCorrect()):
- Test case ini menguji operasi pembagian.
- Memastikan bahwa hasil pembagian dari 4 / 2 adalah 2.
