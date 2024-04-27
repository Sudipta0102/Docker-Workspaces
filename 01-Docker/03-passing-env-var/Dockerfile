FROM alpine
RUN apk add openjdk8
WORKDIR /usr/share/env_var_example
ADD Square.java Square.java
ENTRYPOINT javac Square.java && java Square $RANGE

# docker build -t=pseudofunc/dynamic_env_var .
# docker run -e RANGE=5 pseudofunc/dynamic_env_var