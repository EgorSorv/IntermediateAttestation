from datetime import datetime


def add_note(notes):
    if len(notes) == 0:
        id_num = 1
    else:
        id_num = len(notes) + 1

    title = input('Введите название заметки: ')
    body = input('Введите тело заметки: ')
    date = datetime.now().strftime('%d/%m/%Y, %H:%M:%S')

    print('Заметка успешно сохранена')

    note = [id_num, title, body, date]

    notes.append(note)
