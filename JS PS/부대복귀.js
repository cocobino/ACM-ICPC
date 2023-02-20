function solution(n, roads, sources, destination, ans=[]) {
    const map = Array.from({length: n + 1}, () => ([]))
    let dist = Array.from({length: n + 1}, () => Infinity)


    for (const [from, to] of roads) {
        map[from].push(to);
        map[to].push(from)
    }


    dist[destination] = 0;
    const q =[destination];

    while(q.length !== 0) {
        const cur = q.shift();

        for(const next of map[cur]) {
            if(dist[next] > dist[cur] + 1) {
                dist[next] = dist[cur] + 1;
                q.push(next);
            }
        }
    }


    return sources.map(v=>{
        if(dist[v] === Infinity) return -1;
        else return dist[v];
    });
}

solution(5, [[1, 2], [1, 4], [2, 4], [2, 5], [4, 5]], [1,3,5], 5)