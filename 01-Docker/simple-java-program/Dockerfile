# FROM baseImage
# ADD /host/path-to-file(source) /usr/share(dest)
# RUN apt-get install java
# ENV JAVA_HOME=some/path/
# WORKDIR /usr/share
# EXPOSE 8050
# ENTRYPOINT [ "sleep 5" ]


FROM alpine
RUN apk add openjdk8
#ENV PATH $PATH:/usr/lib/jvm/java-1.8-openjdk/bin/javac
WORKDIR /usr/share/simplejava
ADD Test.java Test.java
ENTRYPOINT javac Test.java && java Test