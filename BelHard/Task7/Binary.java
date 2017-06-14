package BelHard.Task7;

import BelHard.Task8.DateUtils_8;

import java.util.Formatter;

/**
 * Created by Антон on 14.06.2017.
 * продемонстрировать работу со сдвигами - сделать сдвиги <<,  >>, >>>
 *
 *     Чтобы проще было понять происходящее, надо разбить длинную строку
 String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(" ", "0");
 на отдельные операции. Прежде всего выясним для чего нужно b & 0xFF.
 В Java переменная типа byte в старшем разряде хранит знак. При передаче в метод toBinaryString происходит неявное
 приведение 8-битного байта к 32-битному целому. При этом старшие разряды отрицательного числа "добиваются"
 установленными битами и 10000001 превращается в 11111111 11111111 11111111 10000001. Что искажает ожидаемый нами
 результат. Нам надо как-то обнулить старшие биты. Бинарное представление 0xFF - это 00000000 00000000 00000000 11111111.
 Применяя операцию побитового И, мы обнуляем биты старших разрядов и получаем требуемое нам 00000000 00000000 00000000 10000001.
 Далее метод Integer.toBinaryString() превращает переденное ему целое числов в строку содержащую нули и единицы.
 Ведущие нули он отбрасывает. С одной стороны, благодаря этому мы получаем интересующее нас 8-битное представление,
 а с другой, 00000001 он превратит в несуразное 1.
 Решить эту проблему нам поможет String.format(). Метод String.format() в соответствии со спецификтором формата
 %8s выравнивает строку так, чтобы она занимала не менее 8 символов. Беда в том, что для спецификатора строки s
 выравнивание производится пробелами.
 Вот для чего нам нужен последний вызов в строке. Метод .replace(" ", "0") заменяет пробелы нулями.
 Хотя, я бы предпочёл использовать такой метод форматирования:
 for (byte b : bytes) {
 String binStr = Integer.toBinaryString(b & 0xFF);
 System.out.print(("00000000" + binStr + " ").substring(binStr.length()));
 }
 */
public class Binary {

        String toBinary (byte a){
            String binStr = Integer.toBinaryString(a & 0xFF);
            return ("00000000" + binStr + " ").substring(binStr.length());
        }



        }

class UseBinary {
    public static void main(String[] args) {

            byte a = 12,b = 2;
            Binary bin = new Binary();

        System.out.println("byte a = 12, byte b = 2. In binary a = " + bin.toBinary(a)
                + "In binary b = " + bin.toBinary(b));
        System.out.println();


        System.out.println("After <<1  a = " + bin.toBinary((byte)(a<<1))
                +" ==" +  (byte)(a<<1) + "\n  b = " + bin.toBinary((byte)(b<<1))+" ==" + (byte)(b<<1) );
        System.out.println();// Сдвиг влево эквивалентен умножению на два


        System.out.println("After >>1  a = " + bin.toBinary((byte)(a>>1))
                +" ==" +  (byte)(a>>1) + "\n  b = " + bin.toBinary((byte)(b>>1))+" ==" + (byte)(b>>1) );
        System.out.println();// Сдвиг вправо эквивалентен делению на два с отбрасыв остатка

        System.out.println("After >>>1  a = " + bin.toBinary((byte)(a>>>1))
                +" ==" +  (byte)(a>>>1) + "\n  b = " + bin.toBinary((byte)(b>>>1))+" ==" + (byte)(b>>>1) );
        System.out.println();


    }
}
