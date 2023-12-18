FROM ubuntu:latest
LABEL authors="tejin"

ENTRYPOINT ["top", "-b"]