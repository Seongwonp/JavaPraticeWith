package ch_10_abstract.part_03.step_03

class Elementary(name: String, grade: Int) : Student(name, grade) {
    val classTeacher: String
        get() =
            "박길순 선생님"
}