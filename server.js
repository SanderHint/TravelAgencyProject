const express = require('express');
const app = express();
const port = process.env.PORT || 5543;

app.get('/', (req, res) => {
    res.send('Hello, World!');
});
app.use(express.static('public'));
app.listen(port, () => {
    console.log(`Server is listening on port ${port}`);
});