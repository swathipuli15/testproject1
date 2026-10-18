
import React, { useEffect, useState } from "react";
import {
  modules,
  getAll,
  createItem,
  getById,
  deleteItem,
} from "./api";
import "./App.css";

function App() {
  const [active, setActive] = useState("CampusPluse");
  const [records, setRecords] = useState([]);
  const [json, setJson] = useState("{}");
  const [searchId, setSearchId] = useState("");
  const [result, setResult] = useState(null);
  const [message, setMessage] = useState("");
  const [loading, setLoading] = useState(false);

  const loadRecords = async () => {
    setLoading(true);
    setMessage("");

    try {
      const data = await getAll(active);
      setRecords(Array.isArray(data) ? data : []);
    } catch (error) {
      setRecords([]);
      setMessage(
        error.response
          ? `Request failed: ${error.response.status}. Check the endpoint.`
          : "Cannot connect to Spring Boot. Check that it is running on port 9898."
      );
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    setRecords([]);
    setResult(null);
    setMessage("");
    loadRecords();
    // Reload when the selected module changes.
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [active]);

  const handleInsert = async (e) => {
    e.preventDefault();
    setMessage("");

    try {
      const data = JSON.parse(json);
      await createItem(active, data);
      setMessage("Record inserted successfully!");
      setJson("{}");
      await loadRecords();
    } catch (error) {
      setMessage(
        error instanceof SyntaxError
          ? "Invalid JSON. Please check the request body."
          : error.response
          ? `Insert failed: ${error.response.status}. Check your entity fields.`
          : "Cannot connect to the backend."
      );
    }
  };

  const handleSearch = async () => {
    if (!searchId.trim()) {
      setMessage("Please enter an ID.");
      return;
    }

    try {
      const data = await getById(active, searchId);
      setResult(data);
      setMessage("");
    } catch (error) {
      setResult(null);
      setMessage(
        error.response
          ? `Search failed: ${error.response.status}. Check the ID and endpoint.`
          : "Cannot connect to the backend."
      );
    }
  };

  const handleDelete = async (id) => {
    if (!window.confirm(`Delete record with ID ${id}?`)) return;

    try {
      await deleteItem(active, id);
      setMessage("Record deleted successfully!");
      setResult(null);
      await loadRecords();
    } catch (error) {
      setMessage(
        error.response
          ? `Delete failed: ${error.response.status}.`
          : "Cannot connect to the backend."
      );
    }
  };

  const getRecordId = (record) =>
    record.cid ??
    record.student_Id ??
    record.studentId ??
    record.departmentId ??
    record.bookingId ??
    record.equipmentId ??
    record.maintenanceRequestId ??
    record.resourceId ??
    record.id;

  return (
    <div className="app">
      <aside className="sidebar">
        <h2>CampusPluse</h2>
        <p className="subtitle">Campus Management</p>

        {Object.keys(modules).map((name) => (
          <button
            key={name}
            className={`nav-item ${active === name ? "active" : ""}`}
            onClick={() => setActive(name)}
          >
            {name}
          </button>
        ))}
      </aside>

      <main className="main">
        <header className="header">
          <div>
            <h1>{active} Management</h1>
            <p>Manage your campus records</p>
          </div>
          <button className="refresh" onClick={loadRecords}>
            Refresh
          </button>
        </header>

        {message && (
          <div className="message" role="status">
            {message}
          </div>
        )}

        <section className="panel">
          <h2>Insert {active}</h2>
          <form onSubmit={handleInsert}>
            <label htmlFor="json">Request body (JSON)</label>
            <textarea
              id="json"
              value={json}
              onChange={(e) => setJson(e.target.value)}
              rows={7}
              spellCheck="false"
              required
            />
            <button className="primary" type="submit">
              Insert Record
            </button>
          </form>
        </section>

        <section className="panel">
          <h2>Find by ID</h2>
          <div className="search-row">
            <input
              type="text"
              value={searchId}
              onChange={(e) => setSearchId(e.target.value)}
              placeholder="Enter record ID"
            />
            <button className="primary" onClick={handleSearch}>
              Search
            </button>
          </div>

          {result !== null && (
            <pre className="json-result">
              {JSON.stringify(result, null, 2)}
            </pre>
          )}
        </section>

        <section className="panel">
          <div className="table-heading">
            <h2>All {active}</h2>
            <span>{records.length} records</span>
          </div>

          {loading ? (
            <p>Loading records...</p>
          ) : records.length === 0 ? (
            <p>No records found.</p>
          ) : (
            <div className="table-wrap">
              <table>
                <thead>
                  <tr>
                    <th>Record ID</th>
                    <th>Record details</th>
                    <th>Action</th>
                  </tr>
                </thead>
                <tbody>
                  {records.map((record, index) => {
                    const id = getRecordId(record);

                    return (
                      <tr key={id ?? index}>
                        <td>{id ?? "ID not detected"}</td>
                        <td>
                          <pre className="record-json">
                            {JSON.stringify(record, null, 2)}
                          </pre>
                        </td>
                        <td>
                          {id != null ? (
                            <button
                              className="danger"
                              onClick={() => handleDelete(id)}
                            >
                              Delete
                            </button>
                          ) : (
                            "No ID field detected"
                          )}
                        </td>
                      </tr>
                    );
                  })}
                </tbody>
              </table>
            </div>
          )}
        </section>
      </main>
    </div>
  );
}

export default App;

