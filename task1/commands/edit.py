from datetime import datetime
from task1.supporting_commands.show_exist_notes import show


def edit_note(notes):
    if len(notes) == 0:
        print('\nЗаметок еще нет\n')
    else:
        show(notes)

        search = input('Введите номер заметки, которую хотите изменить: ')
        check = False

        for note in notes:
            if note[0] == int(search):
                print(f'Текущее имя заметки: {note[1]}')
                name = input('Введите новое имя заметки: ')

                if name != '':
                    note[1] = name

                print(f'Текущее тело заметки: {note[2]}')
                body = input('Введите новое тело заметки: ')

                if body != '':
                    note[2] = body

                note[3] = datetime.now().strftime('%d/%m/%Y, %H:%M:%S')

                print('Заметка успешно изменена')
                check = True

        if not check:
            print('Заметка не найдена')
