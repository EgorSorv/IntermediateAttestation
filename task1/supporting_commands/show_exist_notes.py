def show(notes):
    print('Существующие заметки:')
    num = 1

    for note in notes:
        print(f'{num}) {note[1]}\n')
        num += 1
