FROM openjdk:11

RUN apt-get update && apt-get install lsof
ARG JAR_FILE=api-gateway-0.0.1-SNAPSHOT.jar
ADD build/libs/${JAR_FILE} /usr/local/api-gateway/
ADD run.sh /run.sh
RUN chmod +x /run.sh
ARG ACTIVE_PROFILE=dev
ENV ACTIVE_PROFILE ${ACTIVE_PROFILE}
CMD /run.sh ${ACTIVE_PROFILE}