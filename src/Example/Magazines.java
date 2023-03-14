package Example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
public class Magazines {

        enum Release {
            DAILY,
            WEEKLY,
            MONTHLY,
            BIQUARTERLY,
            QUARTERLY,
            YEARLY

        }

        enum Genre {
            MYSTERY(1),
            WELLNESS(1),
            GEOGRAPHY(2),
            HISTORY(3),
            MENN(4);
            public final int type;

            Genre(int type) {
                this.type = type;
            }
        }


        static class Magazine {
            private String title;
            private String publisher;
            private Release release;
            private int numberOfPages;

            public Magazine(int numberOfPages, String title, String publisher, Release release ) {
                this.setTitle(title);
                this.setPublisher(publisher);
                this.setRelease(release);
                this.setNumberOfPages(numberOfPages);

            }

            //# Getter-methods
            public String getTitle() {
                return title;
            }

            public String getPublisher() {
                return publisher;
            }

            public Release getRelease() {
                return release;
            }

            public int getNumberOfPages() {
                return numberOfPages;
            }

            //# Setter-methods
            public void setTitle(String title) {
                this.title = title;
            }

            public void setPublisher(String publisher) {
                this.publisher = publisher;
            }

            public void setRelease(Release release) {
                this.release = release;
            }

            public void setNumberOfPages(int numberOfPages) {
                this.numberOfPages = numberOfPages;
            }
        }

        //# Main-method
        public static void main(String[] args) {
            EnumMap<Genre, ArrayList<Magazine>> categories = new EnumMap<>(Genre.class);


            // Setter opp tomme ArrayList på alle mulige sjangre
            Arrays.stream(Genre.values()).forEach(genre -> categories.put(genre, new ArrayList<>()));
            Magazine vogue = new Magazine(50,"Vogue", "Styles For All -", Release.WEEKLY);
            Magazine codenast = new Magazine(65, "Condé Nast", "GQ - Mens Culture & Wellness", Release.MONTHLY);
            Magazine prh = new Magazine( 80, "Penguin Random House", "National Geographic", Release.BIQUARTERLY);
            Magazine fc = new Magazine(55, "Fast Company", "Entrepeneur", Release.WEEKLY);
            Magazine mantra = new Magazine(62, "Mantra Magazines", "Mantra Wellness", Release.YEARLY);

            categories.get(Genre.HISTORY).add(fc);
            categories.get(Genre.WELLNESS).add(vogue);
            categories.get(Genre.WELLNESS).add(codenast);
            categories.get(Genre.WELLNESS).add(prh);
            categories.get(Genre.GEOGRAPHY).add(mantra);

            categories.forEach((genre, magazines) -> {
                System.out.printf("Genre: %s (type %d)%n", genre, genre.type);
                System.out.printf(" - Magazines (%d):%n", magazines.size());

                magazines.forEach(magazine -> {
                    System.out.printf(
                            " -- %s (%d pages) %s %s %n",
                            magazine.getTitle(),
                            magazine.getNumberOfPages(),
                            magazine.getPublisher(),
                            magazine.getRelease()
                    );
                });

                System.out.println(); // new line for spacing
            });
        }
    }

