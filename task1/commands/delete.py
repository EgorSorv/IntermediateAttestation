from task1.supporting_commands.show_exist_notes import show


def delete_note(notes):
    if len(notes) == 0:
        print('\nЗаметок еще нет\n')
    else:
        show(notes)

        search = input('Введите номер заметки, которую хотите удалить: ')
        check = False

        for note in notes:
            if note[0] == int(search):
                notes.remove(note)

                print('Заметка успешно удалена')
                check = True

        id_num = 1

        for note in notes:
            note[0] = id_num
            id_num += 1

        if not check:
            print('Заметка не найдена')
