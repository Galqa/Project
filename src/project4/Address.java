/* Cтворіть проект із пакетом. Потрібно:
Створити клас із ім'ям Address. У тілі класу потрібно створити поля: index, country, city, street, house, apartment.
 Для кожного поля створити метод з двома методами доступу (get, set)
 Створити екземпляр класу Address.
 У поля екземпляра записати інформацію про поштову адресу.
 Виведіть на екран значення полів, що описують адресу.
 */
package project4;

public class Address {
    private int index; // створюємо поля
    private int number;
    private int apartment;
    private String country;
    private String city;
    private String street;

    public Address(int newIndex, int newNumber, int newApartment, String newCountry, String newCity, String newStreet) {// створили конструктор
        index = newIndex;
        number = newNumber;
        apartment = newApartment;
        country = newCountry;
        city = newCity;
        street = newStreet;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    static class TestAddress {
        public static void main(String[] args) {
            project4.Address address1 = new project4.Address(12345, 11, 44, "Monako", "Borispol", "Bendery");  // створюємо об'єкти
            int index = address1.getIndex();
            int number = address1.getNumber();
            int apartment = address1.getApartment();
            String country = address1.getCountry();
            String city = address1.getCity();
            String street = address1.getStreet();
            System.out.println(" Index " + index + " \tNumber " + number + " \tApartment " + apartment + " \tCountry " + country + " \tCity " + city + " \tStreet " + street);
        }
    }
}
