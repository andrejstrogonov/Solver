FROM fedora:latest
FROM newrelic/infrastructure:latest
LABEL authors="strog"
RUN mkdir -p /usr/local/newrelic
ADD ./newrelic/newrelic.jar /usr/local/newrelic/newrelic.jar
ADD ./newrelic/newrelic.yml /usr/local/newrelic/newrelic.yml
ADD newrelic-infra.yml /etc/newrelic-infra.yml

ENTRYPOINT ["java","-javaagent:/usr/local/newrelic/newrelic.jar","-jar","/app/Solver.jar"]
