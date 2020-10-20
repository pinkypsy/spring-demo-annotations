package ua.alvin.services;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

@Component
public class FromFileFortuneService implements FortuneService {
    public String getFortune() {
        String filePath = "F.txt";
        String [] fortunes = null;
       try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
           int itemsCount = 0;
           bufferedReader.mark(100);
           while (bufferedReader.ready()){
               itemsCount++;
               bufferedReader.readLine();
           }
           fortunes = new String[itemsCount];
           bufferedReader.reset();

           for (int i = 0; i < itemsCount; i++) {
               fortunes[i] = bufferedReader.readLine();
           }

       }catch (IOException e){/**/}

        Random random = new Random();
        return fortunes != null ? fortunes[random.nextInt(fortunes.length)] : null;
    }
}
