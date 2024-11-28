<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/28/2024
  Time: 7:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script src="https://cdn.tailwindcss.com?plugins=forms,typography"></script>
  <script src="https://unpkg.com/unlazy@0.11.3/dist/unlazy.with-hashing.iife.js" defer init></script>
  <script type="text/javascript">
    window.tailwind.config = {
      darkMode: ['class'],
      theme: {
        extend: {
          colors: {
            border: 'hsl(var(--border))',
            input: 'hsl(var(--input))',
            ring: 'hsl(var(--ring))',
            background: 'hsl(var(--background))',
            foreground: 'hsl(var(--foreground))',
            primary: {
              DEFAULT: 'hsl(var(--primary))',
              foreground: 'hsl(var(--primary-foreground))'
            },
            secondary: {
              DEFAULT: 'hsl(var(--secondary))',
              foreground: 'hsl(var(--secondary-foreground))'
            },
            destructive: {
              DEFAULT: 'hsl(var(--destructive))',
              foreground: 'hsl(var(--destructive-foreground))'
            },
            muted: {
              DEFAULT: 'hsl(var(--muted))',
              foreground: 'hsl(var(--muted-foreground))'
            },
            accent: {
              DEFAULT: 'hsl(var(--accent))',
              foreground: 'hsl(var(--accent-foreground))'
            },
            popover: {
              DEFAULT: 'hsl(var(--popover))',
              foreground: 'hsl(var(--popover-foreground))'
            },
            card: {
              DEFAULT: 'hsl(var(--card))',
              foreground: 'hsl(var(--card-foreground))'
            },
          },
        }
      }
    }
  </script>
  <style type="text/tailwindcss">
    @layer base {
      :root {
        --background: 0 0% 100%;
        --foreground: 240 10% 3.9%;
        --card: 0 0% 100%;
        --card-foreground: 240 10% 3.9%;
        --popover: 0 0% 100%;
        --popover-foreground: 240 10% 3.9%;
        --primary: 240 5.9% 10%;
        --primary-foreground: 0 0% 98%;
        --secondary: 240 4.8% 95.9%;
        --secondary-foreground: 240 5.9% 10%;
        --muted: 240 4.8% 95.9%;
        --muted-foreground: 240 3.8% 46.1%;
        --accent: 240 4.8% 95.9%;
        --accent-foreground: 240 5.9% 10%;
        --destructive: 0 84.2% 60.2%;
        --destructive-foreground: 0 0% 98%;
        --border: 240 5.9% 90%;
        --input: 240 5.9% 90%;
        --ring: 240 5.9% 10%;
        --radius: 0.5rem;
      }
      .dark {
        --background: 240 10% 3.9%;
        --foreground: 0 0% 98%;
        --card: 240 10% 3.9%;
        --card-foreground: 0 0% 98%;
        --popover: 240 10% 3.9%;
        --popover-foreground: 0 0% 98%;
        --primary: 0 0% 98%;
        --primary-foreground: 240 5.9% 10%;
        --secondary: 240 3.7% 15.9%;
        --secondary-foreground: 0 0% 98%;
        --muted: 240 3.7% 15.9%;
        --muted-foreground: 240 5% 64.9%;
        --accent: 240 3.7% 15.9%;
        --accent-foreground: 0 0% 98%;
        --destructive: 0 62.8% 30.6%;
        --destructive-foreground: 0 0% 98%;
        --border: 240 3.7% 15.9%;
        --input: 240 3.7% 15.9%;
        --ring: 240 4.9% 83.9%;
      }
    }
  </style>
</head>
<body>
<div class="p-6 bg-background rounded-lg shadow-md">
  <h2 class="text-2xl font-bold text-primary mb-4">Player Information</h2>
  <div class="grid grid-cols-2 gap-4 mb-4">
    <input type="text" placeholder="Player name" class="border border-border rounded p-2" />
    <input type="text" placeholder="Player age" class="border border-border rounded p-2" />
  </div>
  <div class="grid grid-cols-2 gap-4 mb-4">
    <select class="border border-border rounded p-2">
      <option>Index name</option>
      <c:forEach var="indexer" items="${indexers}">
        <option value="${indexer.indexId}">${indexer.name}</option>
      </c:forEach>
    </select>
    <input type="text" placeholder="value" class="border border-border rounded p-2" />
  </div>
  <button class="bg-secondary text-secondary-foreground hover:bg-secondary/80 rounded p-2">Add</button>
  <table class="mt-6 w-full border-collapse border border-border">
    <thead>
    <tr class="bg-muted text-muted-foreground">
      <th class="border border-border p-2">Id</th>
      <th class="border border-border p-2">Player name</th>
      <th class="border border-border p-2">Player age</th>
      <th class="border border-border p-2">Index name</th>
      <th class="border border-border p-2">Value</th>
      <th class="border border-border p-2">Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="player" items="${players}">
    <tr>
      <td class="border border-border p-2">${player.playerId}</td>
      <td class="border border-border p-2">${player.name}</td>
      <td class="border border-border p-2">${player.age}</td>
      <td class="border border-border p-2">${player.indexId}</td>
      <td class="border border-border p-2">
        <button class="text-blue-500 hover:underline">✏️</button>
        <button class="text-red-500 hover:underline">🗑️</button>
      </td>
    </tr>
    </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>
