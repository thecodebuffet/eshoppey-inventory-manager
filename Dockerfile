From amazoncorretto:17

RUN mkdir /eshoppey

COPY build/libs/inventory-manager-*-SNAPSHOT.jar /eshoppey/inventory-manager.jar
RUN ls /eshoppey/
EXPOSE 8080
CMD java -jar /eshoppey/inventory-manager.jar



