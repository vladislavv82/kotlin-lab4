import java.text.SimpleDateFormat

fun main() {
    val sdf = SimpleDateFormat("dd.MM.yyyy")

    val manager = Manager("Иван",
        "Иванов",
        30,
        5,
        "Менеджер",
        mutableListOf( Job("Ростов на Дону",
            listOf("Выполнять план продаж").toMutableList(),
            "Менеджер по продажам")),

        mutableListOf( Project("Проект менеджера",
                Fio("Alex"),
                "27.06.2023")),

        mutableListOf( Task("Проект менеджера", sdf.parse("26.06.2023"), hashMapOf(
                "Подзадача 1" to 5,
                "Подзадача 2" to 3,
                "Подзадача 3" to 2
            ))
        )
   )
    println(manager)
    var result = manager.work()
    println(result)

    manager.speakForeignLanguage("Испански")


    val programmer = Programmer(
        "Влад",
        "Акопян",
        19,
        1,
        "Программист",
        mutableListOf(
            Job("Ростов на Дону",
            listOf("написание кода").toMutableList(),
            "intern developer")
        ),

        mutableListOf(
            Project("Лабораторная по Kotlin",
            Fio("Sergei Sidenko"),
            "27.06.2023")
        ),

        mutableListOf(
            Task("Лабораторная по Kotlin",
                sdf.parse("27.06.2023"),
                hashMapOf(
            "Лабораторная 4.1" to 1,
            "Лабораторная 4.2" to 1,
        )))
    )
    println(programmer)

    result = programmer.work()
    println(result)

    programmer.speakForeignLanguage("Английский")


}