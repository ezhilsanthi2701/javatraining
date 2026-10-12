
const express = require("express");
const path = require("path");

const app = express();
const PORT = 5000;

app.use(express.json());

app.use(express.static(__dirname));

app.get("/api/status", (req, res) => {
    res.json({
        message: "Smart Department API is working!"
    });
});

app.listen(PORT, () => {
    console.log(`Smart Department: http://localhost:${PORT}`);
});
