# 💬 ChatApp-Server (Ktor WebSocket Backend)

This is the **backend server** for a real-time one-to-one chat application built with **Kotlin** and **Ktor**. It provides WebSocket-based messaging, room management, and structured message handling to power the ChatApp Android client.

> 🔗 Client Repo: [ChatApp-Android](https://github.com/abbasdx/ChatApp-Android)

---

## ✅ Features

- 📡 **Real-time communication** using Ktor WebSockets
- 🧍 **One-to-one room-based chats**
- 💬 Structured message protocol with timestamps
- 🛠️ Modular and clean codebase (DI, routes, plugins)
- 🧪 Test-ready code with a clean architecture

---

## 📦 Tech Stack

| Purpose              | Tech                        |
|----------------------|-----------------------------|
| Language             | Kotlin                      |
| Framework            | Ktor                        |
| WebSocket Protocol   | Ktor WebSockets             |
| Dependency Injection | Koin                        |

---

## 💬 WebSocket Protocol

### 📡 Endpoint
```
ws://<host>:8080/chat-socket
```

### 📤 Send Message (Client → Server)

```json
{
  "_id": "6821147ac9df4a46bf3ef7c5",
  "text": "Hii",
  "username": "Abbas",
  "timestamp": 1746998394544
}
```

- `_id`: Unique message ID (e.g. UUID or MongoDB ID)
- `text`: Message content
- `username`: Sender's name
- `timestamp`: Epoch time in milliseconds

---

## 🔒 Future Enhancements

- [ ] Typing indicators / message receipts
- [ ] Group chats and file sharing support

---

## 📄 License

MIT License © 2025 [abbasdx](https://github.com/abbasdx)
