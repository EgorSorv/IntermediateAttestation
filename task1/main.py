from task1.commands.add import add_note
from task1.commands.delete import delete_note
from task1.commands.edit import edit_note
from task1.commands.print import print_notes
from task1.commands.print_all import print_all
from task1.commands.date import selection_by_date
import json

with open('notes.json') as f:
    notes = json.load(f)

command = input('Введите команду: ')

while command != 'exit':
    if command == 'add':
        add_note(notes)
    elif command == 'delete':
        delete_note(notes)
    elif command == 'edit':
        edit_note(notes)
    elif command == 'date':
        selection_by_date(notes)
    elif command == 'print':
        print_notes(notes)
    elif command == 'all':
        print_all(notes)
    else:
        print('Команда не найдена\nСписок доступных команд:\nadd\nedit\ndelete\ndate\nprint\nall\nexit')

    command = input('Введите команду: ')

with open('notes.json', 'w') as f:
    json.dump(notes, f, indent=4)
