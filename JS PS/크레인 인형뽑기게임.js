

const transpose = matrix =>
    matrix.reduce(
        (result, row) => row.map((_, i) => [...(result[i] || []), row[i]]),
        []
    );

const solution = (board, moves) => {
    const stacks = transpose(board).map(row =>
        row.reverse().filter(el => el !== 0)
    );
    const basket = [];
    let result = 0;

    for (const move of moves) {
        const pop = stacks[move - 1].pop();
        if (!pop) continue;
        if (pop === basket[basket.length - 1]) {
            basket.pop();
            result += 2;
            continue;
        }
        basket.push(pop);
    }

    return result;
};


function solution(board, moves, rst = [], ans =0) {
    const r = board.length;
    const c = board[0].length;
    const chkrst = _ => {
        for(let i=0; i<rst.length-1; i++) {
            if(i+1 < rst.length && rst[i] == rst[i+1]) {
                rst.splice(i, 2);
                ans+=2;
                chkrst()
                break;
            }
        }
    };

    moves.forEach(v => {
        let getItem = 0;
        for(let i=0; i<r; i ++) {
            if(board[i][v-1]) {
                getItem = board[i][v-1];
                board[i][v-1] = 0;
                break;
            }
        }
        getItem && rst.push(getItem);
        chkrst();
    })


    return ans;
}

console.log(solution([[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]], [1,5,3,5,1,2,1,4]));