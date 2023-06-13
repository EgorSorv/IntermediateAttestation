def print_all(notes):
    if len(notes) == 0:
        print('\nЗаметок еще нет\n')
    else:
        for note in notes:
            print('\n'.join(map(str, note)))
            print()
