def selection_by_date(notes):
    if len(notes) == 0:
        print('\nЗаметок еще нет\n')
    else:
        temporary = []
        numbers = []
        num = 1

        print('Доступные для выбора даты:')

        for note in notes:
            if note[3][:10] not in temporary:
                print(f'{num}) {note[3][:10]}\n')
                temporary.append(note[3][:10])
                numbers.append(num)
                num += 1

        search = input('Введите номер даты: ')
        check = False

        for n in numbers:
            if n == int(search):
                find = temporary[n - 1]
                for note in notes:
                    if note[3][:10] == find:
                        print('\n'.join(map(str, note)))
                        print()
                        check = True

        numbers.clear()
        temporary.clear()

        if not check:
            print('Неверно указан номер')
