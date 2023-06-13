from task1.supporting_commands.show_exist_notes import show


def print_notes(notes):
    if len(notes) == 0:
        print('\nЗаметок еще нет\n')
    else:
        show(notes)

        search = input('Введите номер заметки, которую хотите посмотреть: ')
        check = False

        for note in notes:
            if note[0] == int(search):
                print('\n'.join(map(str, note)))
                check = True

        if not check:
            print('Заметка не найдена')
