const http = require("http");
const data = [
{ id: 1, nombre: "España", capital: "Madrid", poblacion: 47000000 },
{ id: 2, nombre: "Francia", capital: "París", poblacion: 65000000 },
{ id: 3, nombre: "Japón", capital: "Tokio", poblacion: 125000000 }
];
const server = http.createServer((req, res) => {
res.setHeader("Content-Type", "application/json");
if (req.url === "/paises") {
res.write(JSON.stringify(data));
res.end();
} else {
res.write(JSON.stringify({ error: "Endpoint no encontrado" }));
res.end();
}
});
server.listen(3001, () => {
console.log("API corriendo en http://localhost:3001/paises");
});
