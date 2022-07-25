const PILLAR = 0; //기둥
const PLATE = 1; //보

const DELETE = 0; //삭제
const INSTALL = 1; //설치

function solution(n, build_frame) {
    let ans = [];
    build_frame.forEach((command, i) => {
        const [x, y, type, cmd] = command

        if (cmd === INSTALL) {
            if (type === PILLAR && possiblePillar(x, y, ans)) {
                ans.push([x, y, type])
            }
            if (type === PLATE && possiblePlate(x, y, ans)) {
                ans.push([x, y, type])
            }
        }

        if (cmd === DELETE) {
            const tmp = ans.slice();
            const idx = tmp.findIndex(([ansX, ansY, ansType]) => ansX === x && ansY === y && ansType === type);
            tmp.splice(idx, 1);

            destroy(tmp) && ans.splice(idx, 1)

        }
    })

    return ans.sort((a, b) => a[0] === b[0] ? a[1] === b[1] ? a[2] - b[2] : a[1] - b[1] : a[0] - b[0]);
}

const destroy = (tmp) => {
    for (let i = 0; i < tmp.length; i++) {
        const [vX, vY, vType] = tmp[i];

        if (vType === PILLAR) {
            if (!possiblePillar(vX, vY, tmp)) return false
        }

        if (vType === PLATE) {
            if (!possiblePlate(vX, vY, tmp)) return false
        }
    }

    return true
}

const possiblePlate = (x, y, ans) => {

    if (ans.find(([ansX, ansY, ansType]) => ansX === x && ansY === y - 1 && ansType === PILLAR)) return true;
    else if (ans.find(([ansX, ansY, ansType]) => ansX === x + 1 && ansY === y - 1 && ansType === PILLAR)) return true;
    else if (ans.find(([ansX, ansY, ansType]) => ansX === x - 1 && ansY === y && ansType === PLATE) && ans.find(([ansX, ansY, ansType]) => ansX === x + 1 && ansY === y && ansType === PLATE)) return true;

    return false;
}

const possiblePillar = (x, y, ans) => {
    if (y === 0) return true;
    else if (ans.find(([ansX, ansY, ansType]) => ansX === x - 1 && ansY === y && ansType === PLATE)) return true;
    else if (ans.find(([ansX, ansY, ansType]) => ansX === x && ansY === y && ansType === PLATE)) return true;
    else if (ans.find(([ansX, ansY, ansType]) => ansX === x && ansY === y - 1 && ansType === PILLAR)) return true;

    return false;
}

