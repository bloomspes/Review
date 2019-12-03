// DFS 알고리즘 공부

import java.util.Stack;

class Vertex {
    public char label;
    public boolean visited;

    public Vertex(char lab) {
        label = lab;
        visited = false;
    }
}

class Graph {
    private final int maxVertices = 20;
    private Vertex vertexList[];
    private int adjMatrix[][];
    private int vertexCount;
    private Stack theStack;

    public Graph() {
        vertexList = new Vertex[maxVertices];
        adjMatrix = new int[maxVertices][maxVertices];
        vertexCount = 0;

        for(int i=0; i<maxVertices; i++){
            for(int j=0; j<maxVertices; j++){
                adjMatrix[j][i] = 0;
            }

            theStack = new Stack();
        }

    }

    public void addVertex(char lab){
        vertexList[vertexCount++] = new Vertex(lab);
    }

    public void addEdge(int start, int end){
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    public void displayVertex(int v){
        System.out.println(vertexList[v].label);
    }

    public void dfs(){
        vertexList[0].visited = true;
        displayVertex(0);
        theStack.push(0);
        // 방문하지 않은 인접한 접점을 얻어와 스택 상단에 쌓는다
        while(!theStack.isEmpty()){
            int v = getAdjUnvisitedVertex((Integer) theStack.peek());
            if (v == -1)
                theStack.pop();
            else {
                vertexList[v].visited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }
        // 플래그를 초기화 시킨다
        for(int j=0; j<vertexCount; j++){
            vertexList[j].visited = false;
        }
    }

    public int getAdjUnvisitedVertex(int v){
        for(int j=0; j<vertexCount; j++){
            if (adjMatrix[v][j] == 1 && vertexList[j].visited == false)
                return j;
        }
        return -1;
    }
}