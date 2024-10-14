FROM node:22-alpine3.20 as stage1
WORKDIR /app
COPY . .
RUN  npm install
RUN npm run build

FROM nginx:alpine
COPY --from=stage1 /app/nginx.conf /etc/nginx/
COPY --from=stage1 /app/dist/forntend/browser/ /usr/share/nginx/html/
EXPOSE 80
CMD [ "nginx","-g","daemon off;" ]