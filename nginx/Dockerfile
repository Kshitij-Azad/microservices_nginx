FROM nginx:latest
COPY ./nginx.conf /etc/nginx/nginx.conf
COPY ./html /etc/nginx/html
ENV PORT 80
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
