from flask import Flask, render_template, request, jsonify

app = Flask(__name__)

# Base de datos en memoria (lista)
nombres = ["Ramon Fernando", "Maite Danese", "Nichi", "Peach"]

@app.route("/")
def index():
    """Cargar la página principal."""
    return render_template("index.html")

@app.route("/api/nombres", methods=["GET"])
def obtener_nombres():
    """Obtener todos los nombres."""
    return jsonify(nombres)

@app.route("/api/nombres", methods=["POST"])
def agregar_nombre():
    """Agregar un nuevo nombre."""
    nuevo_nombre = request.json.get("nombre")
    if nuevo_nombre and nuevo_nombre not in nombres:
        nombres.append(nuevo_nombre)
        return jsonify({"mensaje": "Nombre agregado correctamente."}), 201
    return jsonify({"error": "El nombre está vacío o ya existe."}), 400

@app.route("/api/nombres/<int:index>", methods=["PUT"])
def actualizar_nombre(index):
    """Actualizar un nombre por índice."""
    if 0 <= index < len(nombres):
        nuevo_nombre = request.json.get("nombre")
        if nuevo_nombre and nuevo_nombre not in nombres:
            nombres[index] = nuevo_nombre
            return jsonify({"mensaje": "Nombre actualizado correctamente."})
        return jsonify({"error": "El nuevo nombre está vacío o ya existe."}), 400
    return jsonify({"error": "Índice fuera de rango."}), 404

@app.route("/api/nombres/<int:index>", methods=["DELETE"])
def eliminar_nombre(index):
    """Eliminar un nombre por índice."""
    if 0 <= index < len(nombres):
        eliminado = nombres.pop(index)
        return jsonify({"mensaje": f"Nombre '{eliminado}' eliminado correctamente."})
    return jsonify({"error": "Índice fuera de rango."}), 404

if __name__ == "__main__":
    app.run(debug=True)
