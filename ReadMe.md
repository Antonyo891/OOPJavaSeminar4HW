# Создать класс Юзер и перенести в него базовые поля ( ФИО )
� Модифицировать ранее созданный класс СтудентКомпаратор
� Переименовать в ЮзерКомпаратор
� Типизировать его T наследующегося от типа Юзер ( T extends User )
� Типизировать реализуемый интерфейс Компаратор T
� Изменить метод компаре, внеся во входные данные вместо конкретных
классов типизацию T
� Внести правки места, где использовался предыдущий компаратор

# Задача 2
� Создать интерфейс ЮзерВью
� Типизировать его T наследующегося от типа Юзер
� Создать в нем метод sendOnConsole(List<Student> students) используя
типизацию
� Создать класс СтудентВью реализующий созданный интерфейс

# Task 3 
� Модифицировать ранее созданный класс Контроллер переименовав его в
StudentController
� Создайте новый интерфейс UserController
� Опишите в нем метод create
� Типизировать его T наследующегося от типа Юзер
� В классе СтудентКонтроллер реализуйте интерфейс UserController
� Добавить в методы контроллера вывод в консоль с помощью метода
sendOnConsole

# HomeWork
Урок 4. ООП: Обобщения. ч1
— Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
— Создать класс УчительВью и реализовать аналогично проделанному на семинаре;
— Создать класс УчительКонтроллер и реализовать возможность создания, редактирования конкретного учителя и отображения списка учителей, имеющихся в системе.

Формат сдачи: ссылка на гитхаб проект