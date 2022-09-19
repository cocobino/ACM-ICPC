function solution(places, rst =[]) {
    const dx= [1,0,-1,0];
    const dy =[0,1,0,-1];
    const isRange= (nx,ny) => nx>=0 && ny>=0 && nx<5 && ny<5;
    let ok = true;
    const dfs = (x,y,depth,vis,map) => {
        if(depth ===3){
            ok = true;
            return;
        }
        if(map[x][y] === 'X') {
            return;
        }

        if(depth>0 && map[x][y] === 'P') {
            ok = false;
            return;
        }

        vis[x][y] =1;
        for(let i=0; i<4; i++) {
            const nx = x + dx[i];
            const ny = y + dy[i];

            if(isRange(nx,ny) && !vis[nx][ny] && ok) {
                dfs(nx,ny, depth+1, vis, map);
            }
        }
    }

    for(let testcase=0; testcase<places.length; testcase++) {
        const map = places[testcase];
        ok = true;
        for(let i=0; i<map.length&&ok; i++) {
            for(let j=0; j<map.length&&ok; j++) {
                if(map[i][j] =='P') {
                    const vis = [[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0]];
                    vis[i][j]= 1;
                    dfs(i,j,0, vis, map);
                }
            }
        }
        rst = [...rst, ok? 1 : 0];

    }
    return rst;
}