[![bw-w-eng.jpg](https://i.postimg.cc/WzqmKdFN/bw-w-eng.jpg)](https://postimg.cc/K3Fg3vDw)

<p align="left">
Выполнил: <strong>Анкудинов Кирилл</strong></br>
Группа: <strong>P3118</strong>
</p>

# Лабораторная работа №1

## 📝 Текст задания
1. Создать одномерный массив c типа long. Заполнить его нечётными числами от 3 до 19 включительно в порядке возрастания.
2. Создать одномерный массив x типа float. Заполнить его 16-ю случайными числами в диапазоне от -14.0 до 3.0.
3. Создать двумерный массив c размером 9x16. Вычислить его элементы по следующей формуле (где x = x[j]): [![image.png](https://i.postimg.cc/zXxk2YPP/image.png)](https://postimg.cc/BX1Dtk3x)
4. Напечатать полученный в результате массив в формате с двумя знаками после запятой.

## 🖥️ Исходный код
```java
import static java.lang.Math.*;

public class Main {
    private static float randomInRange(float min, float max) {
        return min + (float) (Math.random() * (max - min));
    }

    private static boolean checkIfValueInArray(long[] array, long target) {
        for (long value : array) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Crating necessary arrays
        long[] cArray = {3, 5, 7, 9, 11, 13, 15, 17, 19};
        float[] xArray = new float[16];
        for (int i = 0; i < 16; i++) {
            xArray[i] = randomInRange(-14.0F, 3.0F);
        }

        // Calculating resulting array
        double[][] result = new double[9][16];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 16; j++) {
                float x = xArray[j];

                if (cArray[i] == 3) {
                    result[i][j] = cos(asin(pow(((x - 5.5) / 17), 2)));
                } else if (checkIfValueInArray(new long[]{13, 15, 17, 19}, cArray[i])) {
                    result[i][j] = pow(exp(pow(x, x)), (double) 1 / 3);
                } else {
                    result[i][j] = asin(pow(sin(exp(Math.cos(x))), 2));
                }
            }
        }

        // Printing result
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.printf("%.2f \t", result[i][j]);
            }
            System.out.println();
        }
    }
}
```

## 📈 Результат работы программы
```
0,98 	0,92 	0,70 	0,99 	0,99 	0,61 	0,98 	0,88 	0,98 	0,97 	0,46 	0,99 	1,00 	0,76 	0,30 	NaN 	
0,50 	1,20 	0,17 	0,72 	1,39 	0,13 	0,45 	0,17 	0,20 	0,16 	0,37 	0,20 	0,24 	0,43 	0,94 	1,45 	
0,50 	1,20 	0,17 	0,72 	1,39 	0,13 	0,45 	0,17 	0,20 	0,16 	0,37 	0,20 	0,24 	0,43 	0,94 	1,45 	
0,50 	1,20 	0,17 	0,72 	1,39 	0,13 	0,45 	0,17 	0,20 	0,16 	0,37 	0,20 	0,24 	0,43 	0,94 	1,45 	
0,50 	1,20 	0,17 	0,72 	1,39 	0,13 	0,45 	0,17 	0,20 	0,16 	0,37 	0,20 	0,24 	0,43 	0,94 	1,45 	
NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	1,27 	NaN 	NaN 	NaN 	
NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	1,27 	NaN 	NaN 	NaN 	
NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	1,27 	NaN 	NaN 	NaN 	
NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	NaN 	1,27 	NaN 	NaN 	NaN 
```

## 🏁 Выводы по работе
В результате выполнения этой работы я научился базовым конструкциям языка Java (условия, циклы и т.п.).
Также я узнал, как компилировать программу, используя `javac`, и объединять несколько .class файлов, используя `jar`
