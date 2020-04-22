[Задание 1.][z1] Имеется массив чисел, получить список вида {число, количество вхождений числа в массив}, список должен быть отсортирован по количеству вхождений, внутри по возрастания числа. Использовать можно любой алгоритмический язык.

[Задание 2.][z2] Написать алгоритм проверки корректности регулярного выражения, которое включает [,],(,) т.е., например ([][[]()]) - правильно, ([][]()]) – неправильно

[Задание 3.][z3] Написать алгоритм, как в целом числе самый правый ноль превратить в единицу не используя циклы и рекурсию.

[Задание 4.][z4] Имеется таблица с 1 полем, заполненная числами по порядку: {1,2,4,7,8,11..}. Написать SQL Запрос который делает выборку следующего вида (2 столбца): {{3,1},{5,2},...}, Т.е. в первом поле идет число, с которого начинается пропуск, во втором количество пропущенных чисел. Для написания скрипта рекомендуется пользоваться сервисом http://sqlfiddle.com для упрощения проверки правильности скрипта. В решении ожидается увидеть:
1. Название стандарта SQL, на котором выполнялось задание; (Задание выполнено с использованием MySQL 8.0.)
2. [Скрипт генерации таблиц и заполнения данных;][z42]
3. [Скрипт, решающий саму задачу.][z43]

[z1]: <https://github.com/AlekseyLazarev/citeck/tree/master/first>
[z2]: <https://github.com/AlekseyLazarev/citeck/tree/master/second>
[z3]: <https://github.com/AlekseyLazarev/citeck/tree/master/third>
[z4]: <https://github.com/AlekseyLazarev/citeck/tree/master/four>
[z42]: <https://github.com/AlekseyLazarev/citeck/blob/master/four/create.sql>
[z43]: <https://github.com/AlekseyLazarev/citeck/blob/master/four/resolver.sql>