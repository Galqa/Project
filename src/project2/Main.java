/**
 * Cтворіть проект із пакетом. Потрібно: Створити клас Book (Main).
 * Створити класи Title, Author та Content, кожен з яких повинен містити одне рядкове поле та метод void show().
 * Реалізуйте можливість додавання до книги назви книги, імені автора та змісту.
 * Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст.
 */

package project2;


public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = new Title("Робінзон Крузо");
        book.author = new Author("Даніель Дефо");
        book.content = new Content("В романі описується борьба за життя");

        book.show();
    }
}

class Title {
    private String title;

    public Title(String title) {
        this.title = title;
    }

    public void show() {
        System.out.println("Назва книги: " + title);
    }
}

class Author {
    private String author;

    public Author(String author) {
        this.author = author;
    }

    public void show() {
        System.out.println("Автор книги: " + author);
    }
}

class Content {
    private String content;

    public Content(String content) {
        this.content = content;
    }

    public void show() {
        System.out.println("Зміст книги: " + content);
    }
}

class Book {
    Title title;
    Author author;
    Content content;

    public void show() {
        title.show();
        author.show();
        content.show();
    }
}


