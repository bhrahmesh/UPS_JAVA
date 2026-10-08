import java.util.Scanner;

public class ticker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the genre of the movie: ");
        String gener = sc.nextLine().trim();

        System.out.print("Enter the movie name: ");
        String movie = sc.nextLine().trim();

        System.out.print("Enter the no of seats: ");
        int seats = sc.nextInt();

        System.out.print("Enter the Screen no: ");
        int screen = sc.nextInt();

        int price = 0;

        if (gener.equalsIgnoreCase("Comedy")) {
            switch (movie) {
                case "Batha":
                    if (screen == 1) {
                        if (seats <= 20) {
                            price = 180 * seats;
                        } else if (seats > 20 && seats <= 50) {
                            price = 180 * seats - (180 * seats * 10 / 100);
                        } else if (seats > 50 && seats <= 100) {
                            price = 180 * seats - (180 * seats * 30 / 100);
                        } else {
                            System.out.print("Invalid seat count or seat count exceeded ");
                            return;
                        }
                    } else {
                        if (seats <= 20) {
                            price = 140 * seats;
                        } else if (seats > 20 && seats <= 50) {
                            price = 140 * seats - (140 * seats * 10 / 100);
                        } else if (seats > 50 && seats <= 100) {
                            price = 140 * seats - (140 * seats * 30 / 100);
                        } else {
                            System.out.print("Invalid seat count or seat count exceeded ");
                            return; 
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid movie name");
                    return;
            }
        } else if (gener.equalsIgnoreCase("Drama")) {
            switch (movie) {
                case "Motha Rathri":
                    if (screen == 1) {
                        if (seats <= 20) {
                            price = 180 * seats;
                        } else if (seats > 20 && seats <= 50) {
                            price = 180 * seats - (180 * seats * 10 / 100);
                        } else if (seats > 50 && seats <= 100) {
                            price = 180 * seats - (180 * seats * 30 / 100);
                        } else {
                            System.out.print("Invalid seat count or seat count exceeded ");
                            return;
                        }
                    } else {
                        if (seats <= 20) {
                            price = 140 * seats;
                        } else if (seats > 20 && seats <= 50) {
                            price = 140 * seats - (140 * seats * 10 / 100);
                        } else if (seats > 50 && seats <= 100) {
                            price = 140 * seats - (140 * seats * 30 / 100);
                        } else {
                            System.out.print("Invalid seat count or seat count exceeded ");
                            return;
                        }
                    }
                    break;

                case "Dorathy":
                    if (screen == 1) {
                        if (seats <= 20) {
                            price = 180 * seats;
                        } else if (seats > 20 && seats <= 50) {
                            price = 180 * seats - (180 * seats * 10 / 100);
                        } else if (seats > 50 && seats <= 100) {
                            price = 180 * seats - (180 * seats * 30 / 100);
                        } else {
                            System.out.print("Invalid seat count or seat count exceeded ");
                            return;
                        }
                    } else {
                        if (seats <= 20) {
                            price = 140 * seats;
                        } else if (seats > 20 && seats <= 50) {
                            price = 140 * seats - (140 * seats * 10 / 100);
                        } else if (seats > 50 && seats <= 100) {
                            price = 140 * seats - (140 * seats * 30 / 100);
                        } else {
                            System.out.print("Invalid seat count or seat count exceeded ");
                            return;
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid movie name");
                    return;
            }
        } else if (gener.equalsIgnoreCase("Action")) {
            switch (movie) {
                case "Encore":
                    if (screen == 1) {
                        if (seats <= 20) {
                            price = 180 * seats;
                        } else if (seats > 20 && seats <= 50) {
                            price = 180 * seats - (180 * seats * 10 / 100);
                        } else if (seats > 50 && seats <= 100) {
                            price = 180 * seats - (180 * seats * 30 / 100);
                        } else {
                            System.out.print("Invalid seat count or seat count exceeded ");
                            return;
                        }
                    } else {
                        if (seats <= 20) {
                            price = 140 * seats;
                        } else if (seats > 20 && seats <= 50) {
                            price = 140 * seats - (140 * seats * 10 / 100);
                        } else if (seats > 50 && seats <= 100) {
                            price = 140 * seats - (140 * seats * 30 / 100);
                        } else {
                            System.out.print("Invalid seat count or seat count exceeded ");
                            return;
                        }
                    }
                    break;

                case "Anbil Avan":
                    if (screen == 1) {
                        if (seats <= 20) {
                            price = 180 * seats;
                        } else if (seats > 20 && seats <= 50) {
                            price = 180 * seats - (180 * seats * 10 / 100);
                        } else if (seats > 50 && seats <= 100) {
                            price = 180 * seats - (180 * seats * 30 / 100);
                        } else {
                            System.out.print("Invalid seat count or seat count exceeded ");
                            return;
                        }
                    } else {
                        if (seats <= 20) {
                            price = 140 * seats;
                        } else if (seats > 20 && seats <= 50) {
                            price = 140 * seats - (140 * seats * 10 / 100);
                        } else if (seats > 50 && seats <= 100) {
                            price = 140 * seats - (140 * seats * 30 / 100);
                        } else {
                            System.out.print("Invalid seat count or seat count exceeded ");
                            return;
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid movie name");
                    return;
            }
        } else if (gener.equalsIgnoreCase("Horror")) {
            switch (movie) {
                case "Other Mommy":
                    if (screen == 1) {
                        if (seats <= 20) {
                            price = 180 * seats;
                        } else if (seats > 20 && seats <= 50) {
                            price = 180 * seats - (180 * seats * 10 / 100);
                        } else if (seats > 50 && seats <= 100) {
                            price = 180 * seats - (180 * seats * 30 / 100);
                        } else {
                            System.out.print("Invalid seat count or seat count exceeded ");
                            return;
                        }
                    } else {
                        if (seats <= 20) {
                            price = 140 * seats;
                        } else if (seats > 20 && seats <= 50) {
                            price = 140 * seats - (140 * seats * 10 / 100);
                        } else if (seats > 50 && seats <= 100) {
                            price = 140 * seats - (140 * seats * 30 / 100);
                        } else {
                            System.out.print("Invalid seat count or seat count exceeded ");
                            return;
                        }
                    }
                    break;

                case "Resident evil":
                    if (screen == 1) {
                        if (seats <= 20) {
                            price = 180 * seats;
                        } else if (seats > 20 && seats <= 50) {
                            price = 180 * seats - (180 * seats * 10 / 100);
                        } else if (seats > 50 && seats <= 100) {
                            price = 180 * seats - (180 * seats * 30 / 100);
                        } else {
                            System.out.print("Invalid seat count or seat count exceeded ");
                            return;
                        }
                    } else {
                        if (seats <= 20) {
                            price = 140 * seats;
                        } else if (seats > 20 && seats <= 50) {
                            price = 140 * seats - (140 * seats * 10 / 100);
                        } else if (seats > 50 && seats <= 100) {
                            price = 140 * seats - (140 * seats * 30 / 100);
                        } else {
                            System.out.print("Invalid seat count or seat count exceeded ");
                            return;
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid movie name");
                    return;
            }
        } else {
            System.out.println("Invalid genre");
            return;
        }

        System.out.println("Total Price: " + price);
        sc.close();
    }
}
