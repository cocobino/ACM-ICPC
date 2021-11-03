//1. rotate
//2. 상하좌우 move

//validation
//1. 홈과 홈 만나면 안됨

const rotate90deg = arr =>
    arr.reduce(
        (acc, cur) => cur.map((_, i) => [...(acc[i] || []), cur[i]]),
        []
    );

const rightMove = arr =>  arr.reduce((acc, cur) => {
    return [...acc, [0, ...cur.slice(0, cur.length-1)]]
}, []);

const leftMove = arr => arr.reduce((acc, cur) => {
    return [...acc, [...cur.slice(1, cur.length), 0]]
}, [])

const downMove = arr => {
    return [new Array(arr.length).fill(0),
        ...arr.slice(0, arr.length-1)
    ];
}

const upMove = arr => {
    return [...arr.slice(1, arr.length), new Array(arr.length).fill(0)];
}

const valid = (key, lock) => {
    for(let i=0; i<key.length; i++) {
        for(let j=0; j<key.length; j++) {
            if(key[i][j] === lock[i][j]) {
                return false
            }
        }
    }
    return true;
}


function solution(key, lock) {
    const getMap = (x, y, size) => {
        let arr = [];
        for (let i=x; i<x+size; i++) {
            arr = [...arr, key[i].slice(y, y+size)]
        }
        console.log(arr);
        return arr;
    }

    const bfs = (size, cutKey) => {
        const q = [];
        let rst = false;
        q.push({map:cutKey, cnt:0});

        while (q.length !=0  && !rst) {
            let qsize = q.length;
            for(let i=0; i<qsize && !rst; i++) {
                const cur = q.shift();

                if(valid(cur.map, lock)) {
                    rst =true
                }

                debugger;
                console.log(cur.cnt);

                if(cur.cnt <= size*2 -1) {
                    const rotate = rotate90deg(cur.map).map(row =>
                        row.reverse()
                    );
                    q.push({map: leftMove(rotate), cnt: cur.cnt + 1})
                    q.push({map: rightMove(rotate), cnt: cur.cnt + 1})
                    q.push({map: upMove(rotate), cnt: cur.cnt + 1})
                    q.push({map: downMove(rotate), cnt: cur.cnt + 1})
                }

            }
        }

        return rst;
    }

    for(let size=3; size<=key.length; size++) {
        for(let i=0; i<=lock.length-size; i++) {
            for(let j=0; j<=lock.length-size; j++) {
                if(bfs(size, getMap(i,j, size))) {
                    return true;
                }
            }
        }
    }

    return false;
}

console.log(solution([[0, 0, 0], [1, 0, 0], [0, 1, 1]], [[1, 1, 1], [1, 1, 0], [1, 0, 1]]));