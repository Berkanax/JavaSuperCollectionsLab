package JavaZaawansowana._01_Exceptions;

public class Exceptions {
    public static void main(String[] args) {
        RandomExceptionApp randomExceptionApp = new RandomExceptionApp();
        try {
            randomExceptionApp.generateException();
        } catch (FirstException e) {
            System.out.println("Obsługuję cach first exception");
        }
        catch (SecondException e) {
            System.out.println("Obsługuję cach second exception");
        }
        catch (ThirdException e) {
            System.out.println("Obsługuję cach third exception");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
