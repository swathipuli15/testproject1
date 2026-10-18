

import axios from "axios";

const api = axios.create({
  baseURL: "http://localhost:9898",
  headers: {
    "Content-Type": "application/json",
  },
});

api.interceptors.response.use(
  (response) => response,
  (error) => {
    console.error(
      "Backend request failed:",
      error.response?.status,
      error.response?.data || error.message
    );
    return Promise.reject(error);
  }
);

export const modules = {
  CampusPluse: {
    base: "/campusplus",
    list: "/getstudents",
    insert: "/insert",
    id: "/getstudent",
    remove: "/delete",
  },
  Students: {
    base: "/students",
    list: "/getstudents",
    insert: "/insertstudent",
    id: "/getstudent",
    remove: "/deletestu",
  },
  Departments: {
    base: "/departments",
    list: "/getdepartments",
    insert: "/insertdept",
    id: "/getdepartment",
    remove: "/deletedept",
  },
  Bookings: {
    base: "/booking",
    list: "/getbooks",
    insert: "/insertbook",
    id: "/getbook",
    remove: "/deletebook",
  },
  Equipment: {
    base: "/equipment",
    list: "/getequipments",
    insert: "/insertequi",
    id: "/getequipment",
    remove: "/deletequi",
  },
  Maintenance: {
    base: "/maintain",
    list: "/maintanceRequests",
    insert: "/maintanceRequest",
    id: "/insertmaintanceRequest",
    remove: "/maintancedelete",
  },
  Resources: {
    base: "/resources",
    list: "/getresources",
    insert: "/insertresource",
    id: "/getresource",
    remove: "/deleteres",
  },
};

export async function getAll(moduleName) {
  const m = modules[moduleName];
  const response = await api.get(m.base + m.list);
  return response.data;
}

export async function createItem(moduleName, data) {
  const m = modules[moduleName];
  const response = await api.post(m.base + m.insert, data);
  return response.data;
}

export async function getById(moduleName, id) {
  const m = modules[moduleName];
  const response = await api.get(`${m.base}${m.id}/${id}`);
  return response.data;
}

export async function deleteItem(moduleName, id) {
  const m = modules[moduleName];
  const response = await api.delete(`${m.base}${m.remove}/${id}`);
  return response.data;
}