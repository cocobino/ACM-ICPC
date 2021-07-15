function solution(array, commands) {
    const map = new Map;
    array.forEach(v => map.set(v, map.get(v) ? (map.get(v)+1) : 1));
    commands.forEach(v => map.set(v, map.get(v)-1));

    for(const [k, v] of map) {
        if(v) return k;
    }
}

var solution=(array,command)=>
    array.find(array=>!command[array]--,
        command.map(array=>
            command[array]=(command[array]|0)+1))

console.log(solution(	["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"]));