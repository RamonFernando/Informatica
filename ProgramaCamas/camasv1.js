const camasPorHabitacion = 12;

      function generarCamas(habitacionId) {
        const contenedor = document.getElementById(`habitacion${habitacionId}`);
        contenedor.classList.add("bed-container");
        contenedor.innerHTML = "";

        for (let i = 1; i <= camasPorHabitacion; i++) {
          const cama = document.createElement("div");
          cama.className = "bed free";
          cama.textContent = i;
          cama.dataset.estado = "libre";
          cama.onclick = () => alternarEstadoCama(cama);
          contenedor.appendChild(cama);
        }

        actualizarContador(habitacionId);
      }

      function alternarEstadoCama(cama) {
        cama.classList.toggle("occupied");
        cama.classList.toggle("free");
        cama.dataset.estado = cama.classList.contains("occupied") ? "ocupada" : "libre";
        const habitacionId = cama.parentElement.id.replace("habitacion", "");
        actualizarContador(habitacionId);
      }

      function actualizarContador(habitacionId) {
        const camas = document.querySelectorAll(`#habitacion${habitacionId} .bed`);
        const libres = [...camas].filter(c => c.dataset.estado === "libre").length;
        const ocupadas = [...camas].filter(c => c.dataset.estado === "ocupada").length;
        document.getElementById(`contador${habitacionId}`).textContent =
          `🟢 Libres: ${libres} | 🔴 Ocupadas: ${ocupadas}`;
      }

      function resetHabitacion(habitacionId) {
        const camas = document.querySelectorAll(`#habitacion${habitacionId} .bed`);
        camas.forEach(cama => {
          cama.classList.remove("occupied");
          cama.classList.add("free");
          cama.dataset.estado = "libre";
        });
        actualizarContador(habitacionId);
      }

      function aplicarFiltro(habitacionId, filtro) {
        const camas = document.querySelectorAll(`#habitacion${habitacionId} .bed`);
        camas.forEach(cama => {
          cama.classList.remove("hidden");
          const estado = cama.dataset.estado;
          if (filtro === "libres" && estado !== "libre") cama.classList.add("hidden");
          else if (filtro === "ocupadas" && estado !== "ocupada") cama.classList.add("hidden");
        });
      }

      function configurarFiltros() {
        document.getElementById("filtroA").onchange = e => aplicarFiltro("A", e.target.value);
        document.getElementById("filtroB").onchange = e => aplicarFiltro("B", e.target.value);
      }

      function configurarBusqueda() {
        document.getElementById("busquedaCama").addEventListener("input", function () {
          const valor = this.value.trim();
          document.querySelectorAll(".bed").forEach(bed => {
            bed.classList.remove("hidden");
            if (valor && bed.textContent !== valor) {
              bed.classList.add("hidden");
            }
          });
        });
      }

      function descargarReporte() {
        const { jsPDF } = window.jspdf;
        const doc = new jsPDF();

        const getEstado = (habitacionId) => {
          const camas = document.querySelectorAll(`#habitacion${habitacionId} .bed`);
          const libres = [...camas].filter(c => c.dataset.estado === "libre").length;
          const ocupadas = [...camas].filter(c => c.dataset.estado === "ocupada").length;
          return `Habitación ${habitacionId} - Libres: ${libres} | Ocupadas: ${ocupadas}`;
        };

        doc.setFontSize(16);
        doc.text("📄 Reporte de Ocupación de Camas", 10, 20);
        doc.setFontSize(12);
        doc.text(getEstado("A"), 10, 40);
        doc.text(getEstado("B"), 10, 50);
        doc.save("reporte_ocupacion.pdf");
      }

      document.addEventListener("DOMContentLoaded", () => {
        generarCamas("A");
        generarCamas("B");
        configurarFiltros();
        configurarBusqueda();
      });